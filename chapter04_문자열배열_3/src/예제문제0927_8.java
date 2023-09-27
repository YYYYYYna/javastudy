//8.5개의 난수를 배열에 저장한 후에 인덱스번호 두개를 받아서 값을 교환하는 프로그램을 작성하시오

import java.util.*;

public class 예제문제0927_8 {

	public static void main(String[] args) {
		int[] arr=new int[5];
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=(int)(Math.random()*100)+1;
		}
		System.out.println(Arrays.toString(arr));
		
		//인덱스번호 두개를 받아서
		Scanner scan=new Scanner(System.in);
		System.out.print("첫번째 index 입력 : ");
		int index1=scan.nextInt();
		System.out.print("두번째 index 입력 : ");
		int index2=scan.nextInt();
		
		//값을 교환
		//그러나 맞교환은 불가능 따라서 임시변수 생성후 교환
		int temp=arr[index1];
		arr[index1]=arr[index2];
		arr[index2]=temp;
		
		System.out.println(Arrays.toString(arr));
	}

}
