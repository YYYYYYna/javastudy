/*
 *    사칙연산
 *    정수 2개 => 연산자(문자열)
 *    정수 3개 => 1개 결과값
 */

import java.util.Scanner;

public class 선택문_2 {

	public static void main(String[] args) {
		int num1,num2;
		int result=0; 
		//초기값을 주지 않으면 만약 default를 실행시 출력할 result값이 없는데
		//그럼 오류가 발생함으로 초기값을 설정해 주어야 한다.
		
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
			break; //만약 이 사이에 break 문이 다 사라진다면 
			       //어떤 연산자를 넣어도 마지막줄인 *만 수행되고 default값만 출력된다.
		default:
			System.out.println("잘못된 연산자 입니다.");
		}
		
		System.out.println("계산결과값:"+result);
	}

}
