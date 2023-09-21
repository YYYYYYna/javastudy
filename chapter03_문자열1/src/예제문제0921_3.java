//3.1에서 100까지 3의 배수를 더하는 while 문의 빈칸에 적절한 코드를 삽입하라.
public class 예제문제0921_3 {
	public static void main(String[] args) {
		int i=1, sum=0;
		while(i<=100)
		{
			if(i%3==0)
			{
				sum+=i;
			}
			i++;
		}
		System.out.println("1부터 3의 배수의 값 : "+sum);
	}
}
