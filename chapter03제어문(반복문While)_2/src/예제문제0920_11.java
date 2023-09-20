//11. 10개의 정수를 입력받아 그 수들 중 짝수의 개수가 몇개인지 출력하는 프로그램 작성

import java.util.Scanner;

public class 예제문제0920_11 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int num=0,count=0;
		
		for(int i=1;i<=10;i++)
		{
			System.out.println("한개의 정수를 입력 : ");
			num=scan.nextInt();
			if(num%2==0)
			{
				count++; //보통 조회수에서 많이 쓰임
			}
		}
		System.out.println("짝수의 갯수 : "+count);
		
		
		

	}

}
