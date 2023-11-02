package com.sist.server;
/*
 *    서버
 *    ---
 *      접속담당 =========
 *      => 1개만 사용
 *      통신담당(요청→응답) ==> 클라이언트 접속자 수만큼
 *      -----=쓰레드
 *      
 *      서버
 *       => 서버구동 ServerSocket
 *                bind() ==> 개통(ip,port) => 유심
 *       => 대기(클라이언트 접근) => listen()
 *       => 접속처리 => accept() => 발신자 정보 확인
 *          => 메모리에 저장
 *          => 쓰레드를 클라이언트마다 생성 => 따로 통신이 가능하게 만듬
 *          => 기능별(Function)
 *             쓰레드 => 사용자 요청 => 처리 결과 응답
 *       
 */
import java.net.*;
import java.io.*;
import java.util.*;
import com.sist.common.Funtion;
/*
 *    *******채팅의 경우
 *    채팅받기, 채팅쓰고보내기
 *    이게 둘다 동시에 처리가 안됨으로
 *    받기,보내기를 따로 동시에 실행하는거임
 *    이때 사용하는게 Thread임
 */
public class Server implements Runnable{
    //클라이언트 정보 저장 => id,name,sex,ip,port
	private Vector<Client> waitVc=new Vector<Client>();
	private ServerSocket ss;
	private final int PORT=1024; //포트번호를 지정해야 연결가능:우리는11111
	
	//서버가동 ==> 한번만 시행 가능 //50명 까지만 접근 가능!!
	public Server() {
		try {
			ss=new ServerSocket(PORT);//IP는 자동인식해줌
			       //bind() => listen() 둘이 동시에 들어감
			System.out.println("Server Start...");
		}catch(Exception ex) {
			System.out.println("fail");
			ex.printStackTrace();
		}
	}
	
	//접속시 처리
	public void run()
	{
		try {
			while(true)
			{
				//클라이언트 정보를 얻어와야함 => socket(ip,port)에서
				Socket s=ss.accept();//발신자 정보 얻기
				
				Client client=new Client(s);
				client.start();//통신 시작부분
			}
		}catch(Exception ex) {}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Server server=new Server();
        new Thread(server).start();
	}
	//통신담당 => 따라작동 => 쓰레드
	class Client extends Thread
	{
		String id,name,sex,pos;
		Socket s;
		//클라이언트 요청/응답
		BufferedReader in; //=요청받은경우
		OutputStream out; //=응답
		public Client(Socket s)
		{
			this.s=s;//클라이언트 컴퓨터
			//서버는 클라이언트 정보를 가지고 있어야하고 / 클라이언트는 서버에 대한 정보를 가지고 있어야함
			//PORT연결선 => 서버는 고정PORT / 클라이언트는 PORT자동생성됨(매번바뀜,중복없음)
			try {
				//TCP방식 : 메모리에 저장되는 방식이기 때문에 안정성이 높다
				in=new BufferedReader(new InputStreamReader(s.getInputStream()));
				//요청값을 클라이언트 메모리에서 읽기
				out=s.getOutputStream();//클라이언트에서 읽을수 있게 메모리에서 저장
			}catch(Exception ex) {}
		}
		
		//요청시 응답부분
		public void run()
		{
			try {
				while(true)//여러번 돌려야 하기 때문에
				{
					String msg=in.readLine();//=클라이언트가 보내는 데이터
					System.out.println("Client => "+msg);//클라이언트가 보낸 메세지
					
					//로그인 요청시? 100|id|name|sex의 데이터를 보냄
					//그럼 데이터를 받아서 잘라서 해당부분을 사용함
					StringTokenizer st=new StringTokenizer(msg,"|");
					int protocol=Integer.parseInt(st.nextToken());
					switch(protocol)
					{
					case Funtion.LOGIN:
					{
						//****해당순서를 잘 외워줘야함 => 이과정을 통해 접속자 명단이 동일해짐
					   //0. 값 초기화
					   id=st.nextToken();
					   name=st.nextToken();
					   sex=st.nextToken();
					   pos="대기실";
					   //1.이미 접속한 사람들에게 전송하기
					   messageAll(Funtion.LOGIN+"|"+id+"|"+name+"|"+sex+"|"+pos); //해당메세지를 이미 접속한 사람한테 보냄
					   messageAll(Funtion.WAITCHAT+"|[알림 =>] "+name+"님 입장하셨습니다.");
					   //2.waitVc에 저장
					   waitVc.add(this);
					   //3.Login창을 닫고, main을 보여준다
					   messegeTo(Funtion.MYLOG+"|"+id);
					   //4.접속자 명단을 보낸다
					   for(Client client:waitVc)
					   {
						   messegeTo(Funtion.LOGIN+"|"+client.id+"|"+client.name+"|"+client.sex+"|"+client.pos);
					   }
					   //5.개설된 방을 전송 ==> 이번실습에선 안함
					}
					break;
					case Funtion.WAITCHAT: //해당 case의 function하나가 웹에서 JSP하나를 담당한다고 보면됨
					{
						String data=st.nextToken();
						messageAll(Funtion.WAITCHAT+"|["+name+"]"+data);
					}
					break;
					//사용자 정보 보기
					case Funtion.INFO:{
						String data=st.nextToken();
						for(Client client:waitVc) 
						{
							if(data.equals(client.id)) {
								messegeTo(Funtion.LOGIN+"|"+client.id+"|"+client.name+"|"+client.sex+"|"+client.pos);
								break;
							}
						}
					}
					break;
					//메세지보내기
					case Funtion.MSGSEND:{
						String yourid=st.nextToken();
						String content=st.nextToken();
						for(Client user:waitVc) {
							if(yourid.equals(user.id)) {
								String msgStr=Funtion.MSGSEND+"|"+id+"|"+content;
								user.messegeTo(msgStr);
								break;
							}
						}
					}
					break;
					case Funtion.EXIT:
					{
						messageAll(Funtion.WAITCHAT+"|[알림 →] "+name+"님 퇴장했습니다.");
						messageAll(Funtion.EXIT+"|"+id);
						//이제 퇴장한 id를 테이블에서 제거
						for(int i=0;i<waitVc.size();i++)
						{
							//퇴장한 아이디 찾기
							Client client=waitVc.get(i);
							//찾은 아이디 삭제
							if(client.id.equals(id))
							{
								messegeTo(Funtion.MYEXIT+"|");//해당사용자 종료
								waitVc.remove(i);//해당 아이디 삭제
								//==>이 원리라면 동일 아이디는 한명이 퇴장시 같이 퇴장되니 주의...
								try {
									//송수신종료
									in.close();
									out.close();
								}catch(Exception ex) {}
							}
						}
					}
					}
				}
			}catch(Exception ex) {}
		}
		
		//synchronized => 동기방식(쓰레드)
		//처리 방식 2가지 있음(전체단위 혹은 개인단위)
		//1.접속자 전체로 전송 => 로그인(=로그인된사람) / 나가기(=남아있는사람) / 채팅
		public synchronized void messageAll(String msg)
		{
		    //전체에게 보내는 방식
			try {
				for(Client client :waitVc)
				{
					client.messegeTo(msg);
				}
			}catch(Exception ex) {}
		}
		//2.로그인창닫기,나가기(개인적으로 처리되는부분)
		public synchronized void messegeTo(String msg)
		{
			try {
				//out=this임으로 본인에게 데이터를 보내는 과정
				out.write((msg+"\n").getBytes());
			}catch(Exception ex) {}
		}
	}
}
