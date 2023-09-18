/*
 *     단일/if-else/다중 이렇게 3가지의 조건문 종류가 있음
 *     
 *     다중조건문 => 결과값이 1개만 도출
 *     형식) 
 *         if(조건문)
 *         {
 *             조건문이 true일때 수행문장 ====> 수행시 종료
 *                   |
 *                   |false일때 다음조건으로 넘어감
 *         }         |
 *         else if(조건문)
 *         {
 *             조건문이 true일때 수행문장 ====> 수행시 종료
 *                   |
 *                   |false일때 다음조건으로 넘어감
 *         }         |
 *         else if(조건문)
 *         {
 *             조건문이 true일때 수행문장 ====> 수행시 종료
 *                   |
 *                   |false일때 다음조건으로 넘어감
 *         }         |
 *         ...      ...
 *         else //생략가능 
 *         {
 *             => 해당조건이 없는경우 처리하는곳 //한개의 문장만 수행, 게임/네트워크서버에서 주로사용
 *         }
 */
// 국어, 영어, 수학 => 평균, 총점, 학점 => 60이상 합격 60미만 불합격

import java.util.Scanner;

public class 제어문_조건문3 {

	public static void main(String[] args) {
		//1. 변수선언
		int kor, eng, math, total;
		double avg;
		char score=' ';//명시적인 초기화
		
		//2. 초기화
	    //2-1. 입력값 받기(scanner)
		Scanner scan=new Scanner(System.in);
		System.out.print("국어점수 : ");
		kor=scan.nextInt();
		System.out.print("영어점수 : ");
		eng=scan.nextInt();
		System.out.print("수학점수 : ");
		math=scan.nextInt();
		//2-1. 명시적인 초기화(type 변수=값;)
		total=kor+eng+math;
		avg=total/3.0;
		if(avg>=90)
			score='A';
		else if(avg>=80)
			score='B';
		else if(avg>=70)
			score='C';
		else if(avg>=60)
			score='D';
		else
			score='F';
		
		//3. 결과값도출 => 제어문, 연산자 => DOS, 브라우저, 모바일
		System.out.println("====결과값====");
		System.out.println("국어 : "+kor);
		System.out.println("영어 : "+eng);
		System.out.println("수학 : "+math);
		System.out.println("총합 : "+total);
		System.out.printf("평균 : %.2f\n",avg);
		System.out.println("학점 : "+score);

	}

}
