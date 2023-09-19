//1~100까지 => 5의 배수의합과 5의배수의 갯수 => 출력
//66page부터의 예제

public class 제어문_반복문6 {

	public static void main(String[] args) {
		int sum=0, count=0;
		
		for (int i=1;i<=100;i++) 
		{
			if(i%5==0)
			{
				sum+=i;
				count++;
			}
			
		}
		
		System.out.println("1~100까지 5의배수의 합 : "+sum);
		System.out.println("1~100까지 5의배수의 개수 : "+count);

	}

}
