/*
 *      배열_생성0 의 프로그램을 배열과 for문으로 더 짧게 만들어봄
 */


import java.util.Scanner;

public class 배열_생성1 {
	public static void main(String[] args) {
		int [] kor=new int[3]; //=> int kor1,kor2,kor3;
		int [] eng=new int[3]; //=> int eng1,eng2,eng3;
		int [] math=new int[3]; //=> int math1,math2,math3;
		int [] total=new int[3];
		double [] avg=new double[3];
		
		Scanner scan=new Scanner(System.in);
		for(int i=0;i<3;i++) //0,1,2의 인덱스를 가지는 학생
		  //int i=1;i<=3;i++  인덱스번호랑 안맞으니까 일케쓰면안됨                 
		{
			System.out.println((i+1)+"번째 학생의 국어점수 : ");
			kor[i]=scan.nextInt();
			
			System.out.println((i+1)+"번째 학생의 영어점수 : ");
			eng[i]=scan.nextInt();
			
			System.out.println((i+1)+"번째 학생의 수학점수 : ");
			math[i]=scan.nextInt();
			
			total[i]=kor[i]+eng[i]+math[i];
			avg[i]=total[i]/3.0;
		}
		for(int i=0;i<3;i++)
		{
			System.out.printf("%-5d%-5d%-5d%-7d%-5.2f\n",kor[i],eng[i],math[i],total[i],avg[i]);
		}
		
	}

}
