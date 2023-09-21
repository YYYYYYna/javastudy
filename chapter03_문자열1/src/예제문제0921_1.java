//1. Scanner 클래스를 이용하여 2자리의 정수(10~99사이)를 입력받고,
//   십의 자리와 1의 자리가 같은 지 판별하여 출력하는 프로그램을 작성하라.

import java.util.Scanner;

public class 예제문제0921_1 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		
		System.out.println("두자리정수 : ");
		int num=scan.nextInt();
		
		int first=num/10;
		int second=num-first*10;
		
		if(first==second)
		{
			System.out.print("동일합니다.");
		}
		else
		{
			System.out.print("동일하지 않습니다.");
		}

	}

}
