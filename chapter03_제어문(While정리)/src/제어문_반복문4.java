/*
 *   do~while문으로 updown게임 만들기
 *                 => 한번종료되면 끝임..
 */

import java.util.Scanner;

public class 제어문_반복문4 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		
		int com=(int)(Math.random()*100)+1;
		
		do {
			System.out.println("숫자를 입력하세요 : ");
			int num=scan.nextInt();
			
			if(com<num)
			{
				System.out.println("Down");
			}
			else if(com>num)
			{
				System.out.println("Up");
			}
			else if(com==num)
			{
				System.out.println("정답입니다.");
				break; //혹은 system.exit(0);
			}
		}while(true);//맞출때까지 무한반복해야함
		             //그렇기 때문에 continue를 주는게 아니라
		             //while(true)를주면해결

	}

}
