//1~100까지 => 3/5/7의 배수의합 => 출력


public class 제어문_반복문5 {

	public static void main(String[] args) {
		int three=0, five=0, seven=0; //변수=0이라고 초기값 줘야함
		
		
		for (int i=1; i<=100; i++) 
		{
			if(i%3==0)
			{
				three+=i;
			}
			if(i%5==0)    // else를 쓰면 안되는 이유 중복이 있을수 있음
			{
				five+=i;
			}
			if(i%7==0)   // else if도 동일함 15같은 중복수가 3에는 포함되는데
			{            // 5를 실행하는 식에선 제외될수 있음
				seven+=i;
			}
			
		}
		
		System.out.println("1~100까지 3의배수합 : "+three);
		System.out.println("1~100까지 5의배수합 : "+five);
		System.out.println("1~100까지 7의배수합 : "+seven);

	}

}
