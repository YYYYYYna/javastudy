//7. 10개의 난수를 배열에 저장 후에 배열의 인덱스가 3인 곳은 출력하지 말고, 나머지만 출력하시오

import java.util.Arrays;

public class 예제문제0927_7 {

	public static void main(String[] args) {
		int[] arr=new int[10];
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=(int)(Math.random()*100)+1;
		}
		System.out.println(Arrays.toString(arr));
		
		//인덱스번호3제외하기
		//인덱스 번호가 필요하면 for each문 아님!!!
		for(int i=0;i<arr.length;i++)
		{
			if(i==3)
			{
				continue; //인덱스가 3인것을 제외하기 (=특정부분제외)
			}
			System.out.print(arr[i]+" ");
		}

	}

}
