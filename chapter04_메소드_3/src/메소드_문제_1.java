// 정수 한개를 입력받아서 => 짝/홀 판별하기

import java.util.Scanner;

public class 메소드_문제_1 {
	//1. 정수 한개를 입력받아서
	static int userInput()
	{
		Scanner scan=new Scanner(System.in);
		System.out.print("정수 1개 입력 : ");
		int num=scan.nextInt();
		return num;
	}
	
	//2. [내가푼거] 짝홀판별
	static void aaa(int num)
	{
		if(num%2==0)
		{
			System.out.println("짝수입니다.");
		}
		else
		{
			System.out.println("홀수입니다.");
		}
	}
	//3. [내가푼거] 조립기
		static void process()
		{
			int num=userInput();
			aaa(num);
		}
	//2. [쌤이푼거] 짝홀판별
		static String bbb(int num)
		{
			/*String res="";
			if(num%2==0)
			{
				res=num+"은/는 짝수입니다.";
			}
			else
			{
				res=num+"은/는 홀수입니다.";
			}*/
			return num%2==0?num+"은/는 짝수입니다.":num+"은/는 홀수입니다.";
		}

	//3-1. [쌤이푼거] 출력
		static void print(String res)
		{
			System.out.println("");
		}
     //3-1. [쌤이푼거] 출력
		static void processs()
		{
			print(bbb(userInput()));
		}

	public static void main(String[] args) {
		process();
		

	}

}
