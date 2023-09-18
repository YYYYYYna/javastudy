/*
 *   if~else
 *   
 *   예상되는 결과값이 두개로 나눠져서 나오는 경우 => if~else
 */
// 국어, 영어, 수학 => 평균, 총점 => 60이상 합격 60미만 불합격
import java.util.Scanner;
public class 제어문_조건문2_1 {

	public static void main(String[] args) {
		//1. 변수선언
		int kor, eng, math, total;
		double avg;
		
		//2. 초기화
		//2-1. 명시적인 초기화(type 변수=값;) or 입력값 받기(scanner) or 임의발생(random)
		Scanner scan=new Scanner(System.in);
		System.out.print("국어점수 :");
		kor=scan.nextInt();
		System.out.print("영어점수 :");
		eng=scan.nextInt();
		System.out.print("수학점수 :");
		math=scan.nextInt();
		
		total=kor+eng+math;
		avg=total/3.0;
		
		//3. 결과값도출 => 제어문, 연산자 => DOS, 브라우저, 모바일
		System.out.println("=====결과값=====");
		System.out.println("국어 : "+kor);
		System.out.println("영어 : "+eng);
		System.out.println("수학 : "+math);
		System.out.println("총합 : "+total);
		System.out.printf("평균 : %.2f\n",avg);
		if(avg>=60)
		{
			System.out.println("합격 입니다.");
		}
		else
		{
			System.out.println("불합격 입니다.");
		}
		

	}

}
