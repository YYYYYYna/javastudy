import java.util.Scanner;
//로그인 처리 하기
//1. 사용자로부터 입력값을 받아야함 => id/pw => 매개변수
//2. 로그인 여부 확인
//[다음두가지 방법중 하나를 선택하면됨]
//2-1. void(해당 메소드 처리)
//2-2. 결과값을 받을건지
//3. 결과값 받아서 처리 : 두가지경우니까 boolean사용, 
//                   0,1로 int사용, 
//                   로그인여부를 문장으로 출력하도록 String사용
public class 메소드_7 {
	static String userInput(String msg)
	{
		Scanner scan=new Scanner(System.in);
		System.out.print(msg+"를 입력 : ");
		String input=scan.next();
		return input;
	}
	static boolean isLogin(String id,String pw)
	{
		final String ID="admin";//final=상수
		final String PW="1234";//final=상수
		//원래는 해당 내용이 파일이나 오라클에 저장되어있어야함
		//지금은 데이터베이스가 없으니 임시로 상수로 만듬
		
		boolean bCheck=false;//return값에대한 boolean 생성
		
		if(id.equals(ID) && pw.equals(PW))
		{
			bCheck=true;
			//return true; //이렇게 바로 출력해도됨
		}
		//else문장은 이미 bCheck가 false임으로 작성안해도됨
		return bCheck;
	}
	//[조립기 생성]
	static void process()//이렇게 출력부분도 메소드화 시킬수 잇음
	{
		//아래는 msg의 매개변수를 사용해서 그 자리에 들어가는거임
		String id=userInput("아이디");
		String pw=userInput("패스워드");
		boolean bbCheck=isLogin(id,pw);
		//boolean변수는 보통 bXxxx로 되어잇음
		//isXxx()는 리턴형 boolean
		
		if(bbCheck==true)
		{
			System.out.println("메인화면으로 이동...(response.sendRedirect('main.jsp')=메인화면이동)");
		}
		else
		{
			System.out.println("아이디 혹은 비밀번호가 틀립니다.(histroy.back()=이전화면)");
		}
	}
	public static void main(String[] args) {
		process();//조립기 출력
		
	}

}
