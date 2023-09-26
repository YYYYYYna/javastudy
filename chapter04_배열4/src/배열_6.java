//

import java.util.*;
public class 배열_6 {

	public static void main(String[] args) {
		char[] arr=new char[10];
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=(char)((Math.random()*26)+65);
		}
		
		for(int i=0;i<arr.length-1;i++)
		{
			for(int k=0;k<arr.length-1-i;k++)
			{
				if(arr[k]>arr[k+1])
				{
					int temp=arr[k];
					arr[k]=arr[k+1];
					arr[k+1]=temp;
				}
			}
		}
		System.out.println(Arrays.toString(arr));

	}

}
