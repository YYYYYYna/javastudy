// 알파벳 입력 받기 => 대문자/소문자/숫자/기타 판별

import java.util.Scanner;

public class 메소드_문제_4 {
	static char userInput()
	{
		Scanner scan=new Scanner(System.in);
		System.out.print("문자 입력해주세요 : ");
		char c=scan.next().charAt(0);
		return c;//=밖으로 도출된 값을 꺼내주는 역할
	}
	     //↓결과값이문자니까
	static String check(char c)
	{
		String res="";
		if(c>='A' && c<='Z')
		{
			res=c+"는 대문자";
		}
		else if(c>='a' && c<='z')
		{
			res=c+"는 소문자";
		}
		else if(c>='0' && c<='9')
		{
			res=c+"는 숫자";
		}
		else 
		{
			res=c+"는 알파벳이나 숫자가 아닙니다";
		}
		return res;
	}
	
	static void print(String res)
	{
		System.out.println(res);
	}
	
	static void process()
	{
		print(check(userInput()));
	}

	public static void main(String[] args) {
		process();
	}

}
