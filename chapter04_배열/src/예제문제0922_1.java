//배열 alpha를 모두 출력하고자 한다. 


import java.util.Scanner;

public class 예제문제0922_1 {

	public static void main(String[] args) {
//양의 정수 10개 입력받아 배열에 저장하고, 배열에 있는 정수 중에서 3의 배수만 출력하는 프로그램을 작성하라
		Scanner scan=new Scanner(System.in);
		
		int [] a=new int[10];
		for(int i=0;i<a.length;i++) 
		{
			System.out.println("양의정수입력:");
			a[i]=scan.nextInt();

			if(a[i]%3==0)
			{
				System.out.println(a[i]);
			}
		}

	}

}
