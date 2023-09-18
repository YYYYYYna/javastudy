//7) 정수 2개와 연산자(+,-,*,/)를 입력 받아 사칙 연산하는 프로그램을 만들어라 (switch~case 사용) 
import java.util.Scanner;

public class 예제문제0918_7 {

	public static void main(String[] args) {
		int num1,num2;
		int result=0; 
		
		Scanner scan=new Scanner(System.in);
		
		System.out.print("첫번째 정수 입력:");
		num1=scan.nextInt();
		
		System.out.print("두번째 정수 입력:");
		num2=scan.nextInt();
		
		System.out.print("연산자입력 (+,=,*,/):");
		switch(scan.next())
		{
		case "+":
			result=num1+num2;
			break;
		case "-":
			result=num1-num2;
			break;
		case "/":
			result=num1/num2;
			break;
		case "*":
			result=num1*num2;
			break;
		default:
			System.out.println("잘못된 연산자 입니다.");
		}
		
		System.out.println("계산결과값:"+result);
	}

	}
