/*
 *   **메소드를 이용하면 총점, 학점, 등수 등 출력부분별로 나눠서 수정이 가능하도록 따로 운영함 => 객체지향프로그램
 *     이렇게 하면 예를들어 나중에 학생수가 달라진다 했을때 수정에 용이함
 */

/*
 *  3명의 학생 => 국,영,수 점수입력 => 총점, 평균, 학점, 등수 출력
 *                                           ----배열이있어야지만구할수있음
 *           => 1차배열은 기능별로 나누는게 좋음
 */
import java.util.Scanner;

public class 배열_3 {

	public static void main(String[] args) {
		int[] kor=new int[3];
		int[] eng=new int[3];
		int[] math=new int[3];
		int[] total=new int[3];
		int[] rank=new int[3];
		
		double[] avg=new double[3];
		char[] score=new char[3];
		
		//각각 배열의 인덱스값은 같은 학생의 정보값이다.
		//초기화를 시키기
		//---- 국,영,수
		Scanner scan=new Scanner(System.in);
		for(int i=0;i<kor.length;i++)
		{
			//국어
			System.out.print((i+1)+"번째 학생 국어점수입력:");
			kor[i]=scan.nextInt();
			//영어
			System.out.print((i+1)+"번째 학생 영어점수입력:");
			eng[i]=scan.nextInt();
			//수학
			System.out.print((i+1)+"번째 학생 수학점수입력:");
			math[i]=scan.nextInt();
			//총합 계산하기
			total[i]=kor[i]+eng[i]+math[i];
			//평균 계산하기
			avg[i]=total[i]/3.0;
		}
		//학점 계산하기
		for(int i=0;i<kor.length;i++)
		{
			switch((int)(avg[i]/10))//switch에는 정수/ / 만 가능 실수 불가능이라 형변환함
			{
			case 10:
			case 9:
				score[i]='A';
				break;
			case 8:
				score[i]='B';
				break;
			case 7:
				score[i]='C';
				break;
			case 6:
				score[i]='D';
				break;
			default:
				score[i]='F';
			}
		}
		
		//등수 구하기 (2차 for문 이용)
		for(int i=0;i<kor.length;i++)
		{
			rank[i]=1;
			for(int j=0;j<total.length;j++)
			{
				if(total[i]<total[j])
				{
					rank[i]++;
				}
			}
		}
		//최종 결과값 출력하기
		//일반for문을써야함 여기선 index값을 써야하기 때문에 for-each문 사용불가
		for(int i=0;i<kor.length;i++)
		{
			System.out.printf("%-5d%-5d%-5d%-7d%-7.2f%-5c%-5d\n"
					,kor[i],eng[i],math[i],total[i],avg[i],score[i],rank[i]);//%-5d=5칸만들고앞에서부터정수값채우기
		}
		
	}

}
