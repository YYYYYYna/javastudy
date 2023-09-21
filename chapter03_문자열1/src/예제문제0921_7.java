//7.두 개의 주사위가 같은 값이 나올 때까지 while 문을 사용해 반복하고, 반복 횟수와 주사위 눈의 번호를 출력해 보세요
public class 예제문제0921_7 {
	public static void main(String[] args) {
		int count=0;
		
		while(true)
		{
			int a= (int)(Math.random()*6)+1; //이 두 변수도 나올때까지 계속 반복해야함으로
			int b= (int)(Math.random()*6)+1; //while문 안에 들어가야 오류가 안남
			count++;
			System.out.println("주사위 눈의 번호 : "+a+","+b);//if문 바깥에 적어야 시행기록이 다 나옴
			if(a==b)
			{
				break;//이름 안붙여도 while문 종료됨
			}
		}
		System.out.println("반복 횟수 : "+count);
		
	}
}
