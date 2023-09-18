//4) 년도를 입력 받아 윤년인지 아닌지를 판별하는 방법을 if~else문으로 사용하라
//윤년 조건 : if((year%4==0 && year%100!=0)||(year%400==0))

import java.util.Scanner;
public class 예제문제0918_4 {

	public static void main(String[] args) {
		int year;
		
		Scanner scan=new Scanner(System.in);
		System.out.print("년도를 입력해 주세요 : ");
		year=scan.nextInt();
		
		if((year%4==0 && year%100!=0)||(year%400==0))
		{
			System.out.println(year+"년은 윤년입니다.");
		}
		else
		{
			System.out.println(year+"년은 윤년이 아닙니다.");
		}
	}
}
