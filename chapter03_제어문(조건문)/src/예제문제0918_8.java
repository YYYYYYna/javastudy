import java.util.Scanner;
public class 예제문제0918_8 {

	public static void main(String[] args) {
		int com=(int)(Math.random()*3);
		Scanner scan=new Scanner(System.in);
		System.out.println("가위(0), 바위(1), 보(2) : ");
		int user=scan.nextInt();
		
		switch(com)
		{
		case 0: //컴퓨터 가위
			switch(user)
			{
			case 0:
				System.out.println("비겼습니다.");
				break;
			case 1:
				System.out.println("사용자가 이겼습니다.");
				break;
			case 2:
				System.out.println("컴퓨터가 이겼습니다.");
				break;
			}
			break;
		case 1: //컴퓨터 바위
			switch(user)
			{
			case 0:
				System.out.println("컴퓨터가 이겼습니다.");
				break;
			case 1:
				System.out.println("비겼습니다.");
				break;
			case 2:
				System.out.println("사용자가 이겼습니다.");
				break;
			}
			break;
		case 2: //컴퓨터 보
			switch(user)
			{
			case 0:
				System.out.println("컴퓨터가 이겼습니다.");
				break;
			case 1:
				System.out.println("사용자가 이겼습니다.");
				break;
			case 2:
				System.out.println("비겼습니다.");
				break;
			}
			break;
		}

	}

}
