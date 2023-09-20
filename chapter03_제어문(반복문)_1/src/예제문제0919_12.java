//12)1~1000까지에서 7의 배수의 합 ,9의 배수의 합
//               -----------  ----------- 변수2개발생
public class 예제문제0919_12 {

	public static void main(String[] args) {
        int a=0,b=0;
		
		for(int i=1;i<=1000;i++)
		{
			if(i%7==0)
			{
				a+=i;
			}
			if(i%9==0)
			{
				b-=i;
			}
		}
		System.out.println(a);
		System.out.println(b);
		System.out.println(a+b);

	}

}
