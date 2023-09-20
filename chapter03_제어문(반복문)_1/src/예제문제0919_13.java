//13)10~99까지 정수중에 같은 자리의 정수를 출력하시오
public class 예제문제0919_13 {

	public static void main(String[] args) {
		제어문_반복문_2.aaa=2000;//전역변수 재정정
        int a=0,b=0;
		
		for(int i=10;i<=99;i++)
		{
			if(i%11==0)
			{
				System.out.println(i+" ");
			}
		
		}

	}


}
