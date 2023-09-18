//6) 100점 만점으로 성적을 입력 받아 90~100이면 A,80~89이면 B,70~79이면 C, 60~69이면 D,
  // 60점 이하면 F를 출력하라 (switch~case 사용)
import java.util.Scanner;
public class 예제문제0918_6 {

	public static void main(String[] args) {
        int score;
        
        Scanner scan=new Scanner(System.in);
		System.out.print("점수를 입력해 주세요 : ");
		score=scan.nextInt();
        
        switch((int)score/10)
		{
		  case 10:
		  case 9:
			  System.out.println("A");
			  break; 
		  case 8:
			  System.out.println("B");
			  break; 
		  case 7:
			  System.out.println("C");
			  break; 
		  case 6:
			  System.out.println("D");
			  break; 
		  case 5:
		  case 4:
		  case 3:
		  case 2:
		  case 1:
		  case 0:
			  System.out.println("F");
			  break; 
		}
	}
}
