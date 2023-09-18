//3. Scanner 클래스를 이용하여 한 개의 정수를 입력 받아 정수의 절대값을 출력하라

import java.util.Scanner;

public class 예제문제0918_3 {

	public static void main(String[] args) {
		int num1,num2;
		
		Scanner scan=new Scanner(System.in);
		System.out.print("정수를 입력해 주세요 : ");
		num1=scan.nextInt();
		
		if(num1>=0)
		{
			System.out.println("정수의 절대값 : "+num1);
		}
		else if(num1<0)
		{
			num2=num1*(-1);
			System.out.println("정수의 절대값 : "+num2);
		}
	}

}
