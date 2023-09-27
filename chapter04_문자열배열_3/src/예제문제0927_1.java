//1. 5명의 학생의 국어점수를 받아서 등수를 출력하는 프로그램 작성

import java.util.Arrays;
import java.util.Scanner;

public class 예제문제0927_1 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int[] kor=new int[5];
		int[] rank=new int[5];//내가놓친부분
		for(int i=0;i<kor.length;i++)
		{
			System.out.println((i+1)+"번째 학생의 국어점수를 입력하세요 : ");
			kor[i]=scan.nextInt();
			if(kor[i]>100 || kor[i]<0)
			{
				System.out.println("잘못된 입력입니다.");
				i--;
				continue;
			}

		}
		//등수 구하는법은 내가 사진찍어놓은 두개 블럭계산법으로 해야함
		for(int i=0;i<rank.length;i++)
		{
			rank[i]=1;
			for(int k=0;k<kor.length;k++)
			{
				if(kor[i]<kor[k])
				{
					rank[i]++;
				}
			}
		}
		//결과출력
		for(int i=0;i<kor.length;i++)
		{
			System.out.println(kor[i]+" "+rank[i]);
		}
		//아래는 내가 틀리게 푼부분...
		/*for(int i=0;i<kor.length;i++)
		{
			for(int k=0;k<kor.length-1-i;k++)
			{
				if(kor[k]>kor[k+1])
				{
					int temp=kor[k];
					kor[k]=kor[k+1];
					kor[k+1]=temp;
				}
			}
		}
		System.out.println(Arrays.toString(kor));*/

	}

}
