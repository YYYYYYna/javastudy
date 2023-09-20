//9. 0~12까지 2의 배수, 3의 배수의 합을 구하여라.
public class 예제문제0920_9 {

	public static void main(String[] args) {
		int two=0, three=0;
		
		for(int i=0;i<=12;i++)
		{
			if(i%2==0)
			{
				two+=i;
			}
			if(i%3==0)
			{
				three+=i;
			}
		}
		System.out.println("2의 배수 결과값 : "+two);
		System.out.println("3의 배수 결과값 : "+three);
		
		

	}

}
