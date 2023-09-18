//5) 100점 만점으로 성적을 입력 받아 90~100이면 A,80~89이면 B,70~79이면 C, 60~69이면 D,
   //60점 이하면 F를 출력하라 (다중 if 사용)

import java.util.Scanner;
public class 예제문제0918_5 {

	public static void main(String[] args) {
        int score;
		
		Scanner scan=new Scanner(System.in);
		System.out.print("점수를 입력해 주세요 : ");
		score=scan.nextInt();
		
		if(score>=90 && score<=100)
		{
			System.out.println("A 입니다.");
		}
		else if(score>=80 && score<=89)
		{
			System.out.println("B 입니다.");
		}
		else if(score>=70 && score<=79)
		{
			System.out.println("C 입니다.");
		}
		else if(score>=60 && score<=69)
		{
			System.out.println("D 입니다.");
		}
		else if(score>60)
		{
			System.out.println("F 입니다.");
		}

	}

}
