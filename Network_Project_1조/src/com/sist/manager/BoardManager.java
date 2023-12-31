package com.sist.manager;
//파일 입출력
import com.sist.vo.*;
import java.util.*; //ArrayList , Date
import java.text.*; //SimpleDateFormat
import java.io.*; //File관련 => ObjectInputStream/ObjectOutputStream
public class BoardManager {
	
	//게시물 목록 모으기 => 모아서(ArrayList...) 관리(개인정보는 꼭 캡슐화)하기
	private static ArrayList<BoardVO> blist=new ArrayList<BoardVO>();
		//같이 제어해야하니까...static
	
	//값 채우기 => 시작과 동시에
	static {
		//파일불러오는거니까 당연하게 try-catch
		FileInputStream fis=null;
		ObjectInputStream ois=null;
		try {
			//파일 가져오기
			fis=new FileInputStream("c:\\java_data\\board.txt");
			//파일 출력하기
			ois=new ObjectInputStream(fis);
			//파일 입력하기
			blist=(ArrayList<BoardVO>)ois.readObject();
			      //Object로 받았기 때문에 형변환 해줌
			
		}catch(Exception ex) {
			ex.printStackTrace();
		}
		finally {
			try {
				fis.close();
				if(ois!=null)
				{
					ois.close();
				}
				
			} catch (IOException e) {}
			
		}
	}
	//구현하는 게시판의 메소드
	//목록 출력
	public ArrayList<BoardVO> boardListData(int page)
	{
		ArrayList<BoardVO> list=
				new ArrayList<BoardVO>();
		int j=0;
		int rowSize=10;
		int pagecnt=(page*rowSize)-rowSize;
		/*
		 * rowSize = 한 페이지에 출력하는 게시물 갯수
		 * 1page = 0~9 //인덱스 번호에 따라서 출력함
		 * 2page = 10~19
		 * : 
		 */
		
		//최신글부터 역순출력
		 ArrayList<BoardVO> temp=new ArrayList<BoardVO>();
		 for(int i=blist.size()-1;i>=0;i--)
		 {
		     temp.add(blist.get(i));
		 }
		 
		 for(int i=0;i<temp.size();i++)
		{
			//10개 넘어가면 스킵하는 형식으로 페이지 나눔
			if(j<10 && i>=pagecnt)
			{
				//아래 소스가 "페이지 나누는법"
				 BoardVO vo=temp.get(i);
				list.add(vo);
				j++;
				//그러나 해당 방법은 속도가 느려지기 때문에 
				//오라클 => 인라인뷰
				//MySQL => LIMIT
				//등을 사용함
			}
		}
		return list;
	}
	//총페이지 구하기
	public int boardTotalPage() {
		return (int)(Math.ceil(blist.size()/10.0));
		                //ceil은 올림함수 : 소숫점이 0이 아닌경우 올라간다
	}
	
	
	//데이터 추가 (파일 저장을 다시하는 동일코딩 필요)
	public void boardInsert(BoardVO vo)
	{
		blist.add(vo); //근데 blist는 "메모리"임으로 종료하면 사라짐
		               //그래서 파일에 저장하는 과정이 필요
		fileSave();//그래서 수정이 이뤄지면 바로 저장하도록...
	}
	//**파일저장 동일코딩부분
	public void fileSave() {
		//그래서 파일에 저장하는 과정이 필요
		FileOutputStream fos=null;
		ObjectOutputStream oos=null;
		try {
			fos=new FileOutputStream("c:\\java_data\\board.txt");
			oos=new ObjectOutputStream(fos);
			oos.writeObject(blist);
		}catch(Exception ex) {
			ex.printStackTrace();
		}
		finally {
			try {
				fos.close();
				oos.close();
			}catch(Exception ex) {}
		}
	}
	
	//상세보기
	public BoardVO boardDetailData(int no)
	{
		BoardVO vo=new BoardVO();
		
		for(int i=0;i<blist.size();i++)
		{
			BoardVO bVO=blist.get(i);
			if(bVO.getNo()==no)
			{
				bVO.setHit(bVO.getHit()+1); //1번누르면 조회수 1증가
				vo=bVO;
				fileSave();
				break;
			}
		}
		return vo;
	}
	//수정하기 (파일 저장을 다시하는 동일코딩 필요)
	public BoardVO boardUpdateData(int no)
	{
		BoardVO vo=new BoardVO();
		for(BoardVO bVO:blist)
		{
			if(bVO.getNo()==no)
			{
				vo=bVO;
				break;
			}
		}
		return vo;
	}
	public String boardUpdate(BoardVO vo)
	{
		String result=""; //Yes or NO
		for(int i=0;i<blist.size();i++)
			//remove(index), set(index) 그외 for-each
		{
			BoardVO pVO=blist.get(i);
			if(pVO.getNo()==vo.getNo())
			  //서버저장값      서버전송값
			{
				if(pVO.getPwd().equals(vo.getPwd()))
				{
					//비밀번호가 맞은상태 => 수정해줘야함
					result="YES";
					//blist.set(i, vo); //메모리 => 수정되는대상
					pVO.setContent(vo.getContent());
					pVO.setName(vo.getName());
					pVO.setSubject(vo.getSubject());
					fileSave(); //파일 => 수정된 내용을 파일에 저장
					//메모리==파일로 만들어줘야함
				}
				else
				{
					//비밀번호가 틀린상태
					result="NO";
				}
				break;
			}
		}
		return result;
	}
	
	//삭제하기 (파일 저장을 다시하는 동일코딩 필요)
	//ArrayList제어와 파일제어를 동일하게 하는 버릇들이기
	public String boardDelete(int no,String pwd)
	{
		String result="";// y/n중 하나가 출력됨
		for(int i=0;i<blist.size();i++)
		{
			BoardVO vo=blist.get(i);
			
			if(vo.getNo()==no)
			{
				if(vo.getPwd().equals(pwd))
				{
					//비밀번호 일치=>삭제대상
					result="YES";
					blist.remove(i);//ArrayList도 삭제함
					fileSave();//파일도 삭제함
				}
				else
				{
					//비밀번호 틀린상태
					result="NO";
				}
				break;
			}
		}
		return result;
	}
	
	
	//검색하기
	//자동 증가 번호 만들기 => 시퀀스
	public int boardSequence() {
		int max=0;
		for(BoardVO vo:blist)
		{
			if(vo.getNo()>max)
			{
				max=vo.getNo();
			}
		}
		return max+1;
	}

}
