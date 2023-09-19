//4) 한 개의 정수를 입력 받아 1부터 입력 받은 정수까지의 합을 출력하라
//                   합,입력값의 2개변수필요
import java.util.Scanner;

public class 예제문제0919_4 {

	public static void main(String[] args) {
		int dan=0;
		
		Scanner scan=new Scanner(System.in);
		System.out.print("한개의 정수를 입력하시오");
		
		dan=scan.nextInt();
		
		for(int i=1;i<dan;i++)
		{
			dan+=i;
		}
		System.out.println(dan);
	}

}
