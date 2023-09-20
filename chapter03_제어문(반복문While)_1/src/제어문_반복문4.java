/*
 *    중요한 포인트는 수많은 변수를 어떻게 관리할 수 있는지 
 *    => 변수를 하나의 이름으로 통합/관리하는 배열을 사용해야함
 */

//사용자로부터 정수1개값을 받아서 => 해당 구구단 출력하기
import java.util.Scanner;
public class 제어문_반복문4 {

	public static void main(String[] args) {
		//배열을 이용한 변수명관리 추가설명
		//int a=0, b=0, c=0, d=0, e=0;
		//=> int[] arr=new int[10];
		
		int i=1;
		Scanner scan=new Scanner(System.in);
		System.out.print("단 입력 : ");
		int dan=scan.nextInt();
		
		while(i<=9)
		{
			System.out.printf("%d * %d = %d\n",dan,i,dan*i);
			i++;
		}
		/*//이건 내가 뭐 해보려다가 안된거...
		while(true)
		{   System.out.print("단 입력 : ");
		    dan=scan.nextInt();
			if(dan<=0 || dan>9)
			{
				break;
			}
	
			while(i<=9)
			{
				System.out.printf("%d * %d = %d\n",dan,i,dan*i);
				i++;
			}
		}*/
		

	}

}
