/*
 *    break;문 예제
 */

import java.util.Scanner;

public class 제어문_반복제어문3 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		
		//1~9까지의 메뉴중 하나 선택하기
		while(true)
		{
			System.out.print("메뉴 선택: ");
			int menu=scan.nextInt();
			if(menu<1 || menu>9) //범위 외의 메뉴 선택시
			{
				System.out.println("없는 메뉴 입니다.");
				continue; //종료시키면 처음으로 다시 수행이 안됨으로
				          //break; 가 아닌 continue;를 사용
				          //그 결과 while의 조건문 true=무한루프로
				          //이동하여 다시 수행하도록 출력함
			}
			if(menu==9)
			{
				System.out.println(menu+"번 메뉴를 선택하셨습니다.");
				break;
			}
		}
		System.out.println("프로그램이 종료되었습니다.");
		//만약 위에서 break; 대신 System.exit(0);를 사용했다면
		//프로그램 전체가 종료됨으로 해당sysout은 실행될수 없음

	}

}
