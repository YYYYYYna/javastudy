//11)1~100 3의 배수이고 5의 배수를 출력하는 프로그램 작성
public class 예제문제0919_11 {

	public static void main(String[] args) {
		int a=0,b=0;
		
		for(int i=1;i<=100;i++)
		{
			if(i%3==0 && i%5==0)
			{
				System.out.println(i+" ");
			}
		}
		

	}

}
