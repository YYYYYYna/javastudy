/*
 *      학생 3명에 대한 성적계산 예제
 *      ------
 *      1. 이름
 *      2. 국어점수
 *      3. 영어점수
 *      4. 수학점수
 *      5. 총점
 *      6. 평균
 *      =========> 배열이 총 6개 필요함 
 *                 그러나 클래스의 경우에는 1개로 해결가능
 */

import java.util.Scanner;

public class 문자열_2 {

	public static void main(String[] args) {
		
		//1. 배열생성
		String[] names=new String[3];
		int[] kor=new int[3];
		int[] eng=new int[3];
		int[] math=new int[3];
		int[] total=new int[3];
		double[] avg=new double[3];
		
		//2. 입력값 받기
		Scanner scan=new Scanner(System.in);
		for(int i=0;i<kor.length;i++)
		{
			System.out.println("이름 입력 : ");
			names[i]=scan.next();
			
			System.out.println("국어 점수 입력 : ");
			kor[i]=scan.nextInt();
			
			System.out.println("영어 점수 입력 : ");
			eng[i]=scan.nextInt();
			
			System.out.println("수학 점수 입력 : ");
			math[i]=scan.nextInt();
			
			total[i]=kor[i]+eng[i]+math[i];
			avg[i]=total[i]/3.0;
		}
		
		//3. 결과값 출력하기
		for(int i=0;i<names.length;i++)
		{
			System.out.printf("%-8s%-5d%-5d%-7d%-5.2f\n",names[i],kor[i],eng[i],math[i],avg[i]);
		}

	}

}
