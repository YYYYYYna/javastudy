//1) 2+4+6+....100까지의 정수의 합을 구하고 출력하라 (for 사용)
//                           --변수발생(누적변수)

public class 예제문제0919_1 {

	public static void main(String[] args) {
		int even=0;
		
		for(int i=1;i<=100;i++)
		{
			if(i%2==0)
			{
				even+=i;
			}
		}
        System.out.println("2+4+6+....100까지의 정수의 합 : "+even);
	}

}
