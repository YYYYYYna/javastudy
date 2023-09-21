/*
 *  while문이 가장 많이 쓰이는 곳은 매뉴임
 *  아래는 가장 많이 쓰이는 while문 사용예제
 */

import java.util.Scanner;

public class 제어문_반복문3 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		
		while(true)//무한루프
		{
			System.out.println("===== 매뉴 =====");
			System.out.println("1. 뮤직 목록");
			System.out.println("2. 가수 목록");
			System.out.println("3. 노래 찾기");
			System.out.println("4. 상태 보기");
			System.out.println("5. 종    료");
			System.out.println("===============");
			System.out.println("매뉴 선택 : ");
			int menu=scan.nextInt(); 
			//↑의 문장이 없다면 sysout문장들이 무한반복출력됨
			//근데 입력할때 1~5중 입력하면 실행되도록
			//프로그램을 짜는게 가장 기본적인 while문 사용예제
			if(menu==5)
			{
				System.exit(0);//프로그램 정상종료
			}
		}

	}

}
