/*
 *    updown 게임
 *    1. 컴퓨터 난수 발생 :1~100
 *    2. 힌트주기
 *    3. 정답이 나올때까지 반복
 *       ----------------- 무한루프 => for(;;)
 *                                => while(true)
 *                         무한루프를 종료하는 방법 => break;
 *                                             => System.exit(0)
 *                                             
 *    ***이걸 응용하여 야구게임도 만들 수 있음
 */

import java.util.Scanner;
//import java.lang.* //이건 기본저장함수
public class 제어문_반복문9 {

	public static void main(String[] args) {
		//1. 난수발생
		int com=(int)(Math.random()*100)+1;
		
		Scanner scan=new Scanner(System.in);
		
		int count=0;
		
		for(;;) // => 무한루프=continue를 사용하여 구현
		{
			System.out.println("1~100사이의 값 입력 : ");
			int user=scan.nextInt();
			if(user<1 || user>100)
			{
				System.out.println("잘못된입력입니다.");
				continue; //false의 경우 다음조건식으로 이동하는것이 아닌 처음으로 돌어가는것
			}
			count++;
			//hint
			if(com>user)
			{
				System.out.println("보다 높은 정수를 입력하십시오");
			}
			else if(com<user)
			{
				System.out.println("보다 낮은 정수를 입력하십시오");
			}
			else//정답
			{
				System.out.println("정답입니다.");
				System.out.println("입력횟수 : "+count);
				System.exit(0); //프로그램 종료, 현재 반복문임으로 무조건 써줘야함 break; 써도 무방함
			}
		}

	}

}
