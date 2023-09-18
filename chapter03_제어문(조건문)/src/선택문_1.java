/*
 *       선택문은 범위가 지정되는 것이 아니다
 *       => 값 1개를 선택해서 사용
 *          ----- 정수, 문자, 문자열
 *       => 형식)
 *          switch(정수, 문자, 문자열)
 *          {
 *             case 1;
 *               실행문장
 *               break; ==> 실행문장 수행후에 종료
 *             case 2;
 *               실행문장
 *               break; ==> 실행문장 수행후에 종료
 *             case 3;
 *               실행문장 ==> break가 없음 : 3을 수행하고 4를 수행하고 종료
 *             case 4;
 *               실행문장
 *               break; ==> 실행문장 수행후에 종료
 *          }
 *          
 *          범위가 지정되면 다중조건문
 *          범위가 없이 값이 1개일때 => switch
 *          switch => 메뉴, 키보드 => 웹, 게임, 서버프로그램에서 주로 사용
 *          
 */

//성적계산
// 국어, 영어, 수학 => 평균, 총점, 학점
import java.util.Scanner;

public class 선택문_1 {

	public static void main(String[] args) {
		int kor, eng, math, total, avg;
		                         //avg를 정수를 만든이유는 switch문에서는 실수를 사용하지 않음
		                                                          //정수만 사용가능
		double avg2;
		char score=' ';//명시적인 초기화
		
		
		Scanner scan=new Scanner(System.in);
		System.out.print("국어 입력:");
		kor=scan.nextInt();
	
		System.out.print("영어 입력:");
		eng=scan.nextInt();

		System.out.print("수학 입력:");
		math=scan.nextInt();
		
		total=(kor+eng+math);
		avg2=total/3.0;
		
		avg=(int)(avg2/10);//예상되는값 : 10,9,8,7,6,5,4,3,2,1,0
		                   //따라서 69~60이 같은 학점을 받게됨
		
		
		switch(avg) // if(avg==10 || avg==9) score='A'
		{
		  case 10:
		  case 9:
			  score='A';
			  break; //break가 없으면 마지막까지 수행해서 무조건 F가 나옴
		  case 8:
			  score='B';
			  break;
		  case 7:
			  score='C';
			  break;
		  case 6:
			  score='D';
			  break;
		  default: //나머지
			  score='F';
		}
		System.out.println("총점:"+total);
		System.out.printf("평균:%.2f\n",avg2);
		System.out.println("학점:"+score+"학점");
	}

}
