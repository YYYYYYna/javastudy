//8. 3이상 4462 이하에서 짝수인 정수의 합을 구하여라.
public class 예제문제0920_8 {

	public static void main(String[] args) {
		int sum=0;
		
		for(int i=2;i<=4462;i+=2)
		{
			sum+=i;
		}
		System.out.println(sum);

	}

}
