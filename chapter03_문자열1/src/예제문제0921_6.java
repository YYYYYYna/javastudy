//6.1부터 100 까지의 정수 중에서 짝수만을 더해 출력하는 코드를 for 문을사용해 작성해 보세요
public class 예제문제0921_6 {
	public static void main(String[] args) {
		int even=0;
		for(int i=1;i<=100;i++)
		{
			if(i%2==0)
			{
				even+=i;
			}
		}
		System.out.println(even);
	}

}
