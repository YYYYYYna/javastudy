/*
 *   컴퓨터와 가위바위보 (0,1,2)
 *      0 => 가위
 *      1 => 바위
 *      2 => 보
 *      
 *   <게임작동조건>
 *   1. 컴퓨터 난수 발생
 *   2. 사용자 입력
 *   3. 컴퓨터, 사용자의 가위바위보 출력
 *   4. 결과값
 *      -----(총 9개)
 *      컴퓨터      사용자
 *                 가위(0)  same  
 *      가위(0)     바위(1)  Win
 *                 보(2)   Lose
 *      컴퓨터-사용자 실행시 same=0 Win=-1 Lose=-2
 */
import java.util.Scanner;
public class 삼항연산자_1 {

	public static void main(String[] args) {
		//컴퓨터
		int com=(int)(Math.random()*3); //0,1,2
		//사용자
		Scanner scan=new Scanner(System.in);
		System.out.println("가위(0),바위(1),보(2) 중 숫자 기입하시오");
		int user=scan.nextInt();
		//서로의 패 확인
		System.out.print("컴퓨터 : ");
		System.out.print(com==0?"가위":"");
		System.out.print(com==1?"바위":"");
		System.out.print(com==2?"보":"");
		System.out.println();
		System.out.print("플레이어 : ");
		System.out.print(user==0?"가위":"");
		System.out.print(user==1?"바위":"");
		System.out.print(user==2?"보":"");
		System.out.println();
		//결과 확인
		System.out.print(com==user?"비겼습니다.":"");
		System.out.print(com-user==-1 || com-user==2?"이겼습니다.":"");
		System.out.print(com-user==-2 || com-user==1?"졌습니다.":"");

		

	}

}
