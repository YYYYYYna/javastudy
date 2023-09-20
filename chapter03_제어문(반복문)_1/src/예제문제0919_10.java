//10)1~30 짝수합,홀수합을 출력하는 프로그램을 작성
//        ----------변수두개필요
public class 예제문제0919_10 {

	public static void main(String[] args) {
		int a=0,b=0;
		
		for(int i=1;i<=30;i++)
		{
			if(i%2==0)
			{
				a+=i;
			}
			else
			{
				b-=i;
			}
		}
		
		System.out.println(a);
		System.out.println(b);

	}

}
