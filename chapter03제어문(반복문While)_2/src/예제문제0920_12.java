//12. 10개의 정수를 입력받아 3의 배수의 개수와 5의 배수의 개수를 각각 출력하는 프로그램

import java.util.Scanner;

public class 예제문제0920_12 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int num=0,count3=0,count5=0;
		
		for(int i=1;i<=10;i++)
		{
			System.out.println("한개의 정수를 입력 : ");
			num=scan.nextInt();
			if(num%3==0)
			{
				count3++;
			}
			if(num%5==0)
			{
				count5++;
			}
		}
		System.out.println("3의 배수의 갯수 : "+count3);
		System.out.println("5의 배수의 갯수 : "+count5);

	}

}
