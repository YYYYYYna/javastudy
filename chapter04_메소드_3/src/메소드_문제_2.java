//정수1개 입력 => 3의배수여부확인

import java.util.Scanner;

public class 메소드_문제_2 {
	//1. 정수 한개를 입력받아서
	    //아래에서 메소드 가져옴
		/*static int userInput()
		{
			Scanner scan=new Scanner(System.in);
			System.out.print("정수 1개 입력 : ");
			int num=scan.nextInt();
			return num;
		}*/
	//2-1. 3의배수여부확인
		static String three(int num)
		{
			String res=num+"는 3의배수아님";
			if(num%3==0)
			{
				res=num+"는 3의배수";
			}
			return res;
			
			//~이렇게 짧게도 표현가능~
			//String res="";
			//return num%3==0?num+"는 3의배수":num+"는 3의배수아님";
		}
	//2-2. 출력
		static void print(String res)
		{
			System.out.println(res);
		}
	//3. 조립기
		static void process()
		{
			int num=메소드_문제_1.userInput();
			print(three(num));
			
			//~이렇게 짧게도 표현가능~
			//print(three(메소드_문제_1.userInput()));
		}

	public static void main(String[] args) {
		process();

	}

}
