//5. 10개의 난수를 발생하여 배열 중에서 최대값의 인덱스를 출력하시오. 

import java.util.Arrays;

public class 예제문제0927_5 {

	public static void main(String[] args) {
		int[] arr=new int[10];
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=(int)(Math.random()*100)+1;
		}
		System.out.println(Arrays.toString(arr));
		
		int max=0;
		for(int i=0;i<arr.length;i++)
		{
		    if(max<arr[i])
			{
				max=arr[i];
			}
		}
		int index=0;
		for(int i=0;i<arr.length;i++)
		{
			if(max==arr[i])
			{
				index=i;//인덱스 번호 구하는법 외우기
				break;
			}
		}
		System.out.println("최대값의 인덱스 : "+index);

	}

}
