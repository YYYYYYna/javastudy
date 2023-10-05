/*
 * up down 게임
 * 1. 난수발생
 * 2. 숫자입력
 * 3. 숫자비교 결과값출력
 */

import java.util.Scanner;

public class 메소드_문제_6 {
	static int com()
	{
		int com=(int)(Math.random()*100+1);
		return com;
	}
	
	static int userInput()
	{
		Scanner scan=new Scanner(System.in);
		System.out.print("1~100사이 정수 입력하세요 : ");
		int user=scan.nextInt();
		return user;
	}
	static String hint(int com, int user)
	{
		String res="";
		if(com>user)
		{
			res="큰수를 입력하세요";
		}
		else if(com<user)
		{
			res="작은수를 입력하세요";
		}
		else
		{
			res="정답입니다.";
		}
		return res;
	}
	
	static void process()
	{
		int com=com();
		Scanner scan=new Scanner(System.in);
		while(true)
		{
			int user=userInput();
			String h=hint(com,user);
			System.out.println(h);
			if(h.contains("정답"))
			{
				System.out.println("게임을 다시 할까요? y/n");
				char c=scan.next().charAt(0);
				if(c=='y'||c=='Y')
				{
					System.out.println("다시시작");
					process();//자신걸 다시 부르는 재귀호출
				}
				else
				{
					System.out.println("게임종료");
					System.exit(0);
				}
			}
		}
	}

	public static void main(String[] args) {
		process();
	}

}
