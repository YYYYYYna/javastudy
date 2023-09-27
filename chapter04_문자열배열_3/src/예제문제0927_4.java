//4. 10개의 난수를 발생하여 배열에 저장한 후에 인덱스가 1인 곳의 값을 출력하시오.

import java.util.Arrays;

public class 예제문제0927_4 {

	public static void main(String[] args) {
		int[] arr=new int[10];
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=(int)(Math.random()*100)+1;
			//Random r=new Random() => r.nextInt();
		}
		System.out.println(Arrays.toString(arr));
		System.out.println("인덱스가 1인 곳의 값 : "+arr[1]);
		                  //인덱스가 1인지 1번째인지 헷갈리지 말기!

	}

}
