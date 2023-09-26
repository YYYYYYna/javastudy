// 선택정렬 예제2 : 알파벳 정렬
import java.util.*;
public class 배열_4 {

	public static void main(String[] args) {
		//초기화
		char[] arr=new char[5];
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=(char)((Math.random()*26)+65);
		}
		System.out.println("====== 정렬전 ======");
		System.out.println(Arrays.toString(arr));
		
		//선택정렬
		for(int i=0;i<arr.length-1;i++)
		{
			for(int k=i+1;k<arr.length;k++)//두번째 시행은 2번째 자리부터 시행하도록 초기값 k=i+1
			{
				if(arr[i]>arr[k])//i번째자리와 i+1번째자리 비교할때 
				{                //i번째 자리가 더 크다면 
					char temp=arr[i];//(temp=자리교체를 위한 임시변수값)
					arr[i]=arr[k];//i+1번째자리에 i번째자리'값'을 대입 = 큰값을 오른쪽으로 이동
					arr[k]=temp;//그리고 i+1번째자리'값'을 i번째자리에 대입 = 작은값은 왼쪽으로 이동
					
				}
			}
			System.out.println("===== "+(i+1)+"차 시행 =====");
			System.out.println(Arrays.toString(arr));
		}
		System.out.println("====== 정렬후 ======");
		System.out.println(Arrays.toString(arr));

	}

}
