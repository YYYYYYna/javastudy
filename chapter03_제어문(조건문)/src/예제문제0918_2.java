//2. 한 개의 정수를 입력 받아 3의 배수인지 판별하여 출력하라
import java.util.Scanner;
public class 예제문제0918_2 {

	public static void main(String[] args) {
		//1. 초기값
		int num1;
		
		//2. 변수
		Scanner scan=new Scanner(System.in);
		System.out.print("한자리의 정수를 입력해주세요 : ");
		num1=scan.nextInt();
		
		//3. 판별
		//4. 출력
		if(num1>=10)
		{
			System.out.println("한자리 정수가 아닙니다.");
		}
		else if(num1%3==0)
		{
			System.out.println("3의 배수입니다.");
		}
		else if(num1%3!=0)
		{
			System.out.println("3의 배수가 아닙니다.");
		}
}

}
