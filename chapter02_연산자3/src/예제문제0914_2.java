/*
 *    윤년여부를 확인하기
 *    => 4년마다 1번
 *    => 100년마다 제외
 *    => 400년마다 해당
 */
import java.util.Scanner;
public class 예제문제0914_2 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.print("년도 입력 : ");		
		int year=scan.nextInt();
		System.out.println(
			(year%4==0 && year%100!=0) || (year%400==0) //윤년조건
			?year+"년도는 윤년입니다.":year+"년도는 윤년이 아닙니다."
				);


	}

}
