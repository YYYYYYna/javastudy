/*
 *     유효성검사 : 내가 원하는 값이 오류없이 도출될수 있도록 while로 무한루프 돌리는것
 */

import java.util.Scanner;
public class 제어문_반복문3 {

	public static void main(String[] args) {
		int kor,eng,math;
		int total;
		double avg;
		
		Scanner scan=new Scanner(System.in);
		while(true)//=무한루프
		{
			System.out.print("국어점수 : ");
			kor=scan.nextInt();
			if(kor>=0 && kor<=100)
			{
				break;//종료됨
			}
			
		}//이 문장의 뜻은 0~100사이가 아닌 점수는 잘못된 입력이기 때문에 처음으로 무한돌아가게함
		
		while(true)//=무한루프
			       //무한루프 주의할점 : 반드시 종료조건(ex.break;)이 있어야함
		{
			System.out.print("영어점수 : ");
			eng=scan.nextInt();
			if(eng>=0 && eng<=100)
			{
				break;//종료됨
			}
			
		}//이 문장의 뜻은 0~100사이가 아닌 점수는 잘못된 입력이기 때문에 처음으로 무한돌아가게함
		
		while(true)//=무한루프
		{
			System.out.print("수학점수 : ");
			math=scan.nextInt();
			if(math>=0 && math<=100)
			{
				break;//종료됨
			}
			
		}//이 문장의 뜻은 0~100사이가 아닌 점수는 잘못된 입력이기 때문에 처음으로 무한돌아가게함
		
		total=kor+eng+math;
		avg=total/3.0;
		
		System.out.println("국어점수 : "+kor);
		System.out.println("영어점수 : "+eng);
		System.out.println("수학점수 : "+math);
		System.out.println("총점 : "+total);
		System.out.println("평균 : "+avg);
		
		//근데 여기서 더 발전할 수 있는법.....
		//while을 위에 3번이나 썻는데 이걸 for문 3번반복으로 대체하면 더 짧게 가능
		//kor,eng,math의 변수값은 "배열"로 바꿔서 대치하면됨

	}

}
