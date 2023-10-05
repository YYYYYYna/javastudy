//메소드에 들어가는 소스는 동일함
//리턴형과 매개변수 잡는게 중요 
//=> 마지막에 어떤 데이터형(리턴)으로 뭘 도출(매개변수)해주는지
//main에서 코딩을 하고 메소드화 시키는것도 방법

/*
 *   연도를 입력 받아서 => 윤년여부 확인
 *   
 *   1. 입력메소드         = 초기화→회원가입에 필요한 데이터입력
 *   2. 윤년확인메소드      = ①오라클을 연결해서 데이터 추가 ②로그인 여부 확인 
 *   3. 결과값 출력 메소드   = 로그인 이동
 *   4. 조립기
 *   
 *   브라우저 => 자바 => 오라클 이 구조만 잘 파악하면 됨
 *   -------------------=라이브러리
 */

import java.util.Scanner;

public class 메소드_3 {
	//1. 입력메소드
	    //↓매개변수받음
	static int userInput()
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("년도 입력 : ");
		int year=scan.nextInt();
		//여기가 매개변수
		return year;
	}
	
	//2. 윤년확인메소드
	      //↓출력해야하는값    ↓매개변수받음
	static boolean isYear(int year)
	{
		boolean bCheck=false;
		if((year%4==0 && year%100!=0)||(year%400==0))
		{
			bCheck=true;
			//여기가 매개변수
		}
		return bCheck;
	}
	
	//3. 
         //↓출력만하고잇음     ↓매개변수받음
	static void print(boolean bCheck)
	{
		if(bCheck)
			//bCheck => bCheck==true
			//!bCheck => bCheck!=true
		{
			System.out.println("윤년입니다.");
		}
		else
		{
			System.out.println("윤년이 아닙니다.");
		}
	}
	
	//4. 조립기
	static void process()
	{
		int year=userInput();
		boolean bCheck=isYear(year);
		print(bCheck);
		
	}
	public static void main(String[] args) {
		/*
		//1. 입력메소드
		Scanner scan=new Scanner(System.in);
		System.out.println("년도 입력 : ");
		int year=scan.nextInt();
		//여기가 매개변수
		
		//2. 윤년확인메소드
		boolean bCheck=false;
		if((year%4==0 && year%100!=0)||(year%400==0))
		{
			bCheck=true;
			//여기가 매개변수
		}
		
		//3. 결과값 출력 메소드
		if(bCheck)
			//bCheck => bCheck==true
			//!bCheck => bCheck!=true
		{
			System.out.println("윤년입니다.");
		}
		else
		{
			System.out.println("윤년이 아닙니다.");
		}
		*/
		process();
		

	}

}
