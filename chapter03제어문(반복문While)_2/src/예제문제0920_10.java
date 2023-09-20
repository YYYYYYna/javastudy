//10. 1~100까지의 정수 중 4의 배수의 합계를 구하라
public class 예제문제0920_10 {

	public static void main(String[] args) {
		int sum=0;
		
		for(int i=0;i<=100;i++)
		{
			if(i%4==0)
			{
				sum+=i;
			}
		}
		System.out.println("결과값 : "+sum);
		

	}

}
