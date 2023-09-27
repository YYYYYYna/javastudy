//2.10개의 임의의 정수를 받아서 최대값,최소값(난수)  구하는 프로그램 작성

import java.util.Arrays;

public class 예제문제0927_2 {

	public static void main(String[] args) {
		//임의의 정수
		int max=0,min=100;
		int[] arr=new int[10];
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=(int)(Math.random()*100)+1;
		}
		//최대값,최소값
		for(int i=0;i<arr.length;i++)
		{
			if(max<arr[i])
			{
				max=arr[i];
			}
			if(min>arr[i])
			{
				min=arr[i];
			}
		}
		//for each문으로 실행하는법
		/*for(int i:arr)
		{
			if(max<i)
			{
				max=i;
			}
			if(min>i)
			{
				min=i;
			}
		}*/
		System.out.println(Arrays.toString(arr));
		System.out.println("최대값 : "+max);
		System.out.println("최소값 : "+min);

	}

}
