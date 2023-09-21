//5.정수를 10개 저장하는 배열을 만들고 1에서 10까지 범위의 정수를 랜덤하게 생성하여 
//  배열에 저장하라. 그리고 배열에 든 숫자들과 평균을 출력하라.

import java.util.Scanner;

public class 예제문제0921_5 {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int sum=0;
		
		for(int i=1;i<=10;i++)
		{
			int num= (int)(Math.random()*10)+1;
			//System.out.println("1에서 10사이의 정수를 입력하시오 : ");
			//int num=scan.nextInt();
			sum+=num;
		}
		//double avg=sum/10;
		//System.out.println("평균 : "+avg);
		System.out.println("평균 : "+sum/10.0);
	}
}
