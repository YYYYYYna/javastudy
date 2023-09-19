//정수1개를 받아서 해당 구구단

import java.util.Iterator;
import java.util.Scanner;

public class 제어문_반복문3 {

	public static void main(String[] args) {
		int dan;
		
		Scanner scan=new Scanner(System.in);
		System.out.print("정수1개를 입력해주세요");
		dan=scan.nextInt();
		
		if(dan>=10 || dan<=0)
		{
			System.out.println("잘못된 입력입니다.");
		}
		else
		for (int i=1;i<=9;i++) 
		{
			System.out.printf("%d * %d = %d\n",dan,i,dan*i);
			
		}

	}

}
