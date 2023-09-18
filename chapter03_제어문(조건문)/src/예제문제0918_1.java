//1. Scanner 클래스를 이용하여 한 개의 정수를 입력 받아 양수인지 음수인지 판별하여 출력하라

import java.util.Scanner;


public class 예제문제0918_1 {
	public static void main(String[] args) {
		int num1;
		
		Scanner scan=new Scanner(System.in);
		System.out.print("정수를 입력해주세요 : ");
		num1=scan.nextInt();
		/*
		 *   정수 : nextInt()
		 *   실수 : nextDouble()
		 *   논리 : nextBoolean()
		 *   문자열 : next()
		 *   *** 단점은 char는 읽지 못한다.
		 *            ----- 문자열로 읽어서 첫번째 문자를 자른다
		 *                              ---------charAt(0)
		 */
		
		if(num1>=1)
		{
			System.out.println("양수입니다.");
		}
		else if(num1<0)
		{
			System.out.println("음수입니다.");
		}
		else if(num1==0)
		{
			System.out.println("0입니다.");
		}
	}
}
