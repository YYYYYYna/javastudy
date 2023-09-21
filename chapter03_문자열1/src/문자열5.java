/*
 *   2진법 출력하는법
 */


import java.util.Scanner;

public class 문자열5 {

	public static void main(String[] args) {
		int[] bin=new int[16];
		int index=15;
		Scanner scan=new Scanner(System.in);
		System.out.print("정수 입력 : ");
		int num=scan.nextInt();
		System.out.println(Integer.toBinaryString(num));
		                          //해당라이브러리안에는 약 10줄의 제어문들이 있음

	}

}
