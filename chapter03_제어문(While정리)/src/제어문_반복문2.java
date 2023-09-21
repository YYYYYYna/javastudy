//1~10 => 짝수만 출력 (3가지 반복문으로 만들어보기)
/*
 *   각각 if문이 들어가는 위치를 파악하기
 *   for: for문안에
 *   while: while문 안에
 *   do~while: do문 안에
 *   
 *   다 같은 출력값을 낼수 있지만 
 *   보통 반복문 안에 조건문이 들어간 형태를 많이 사용함
 */

public class 제어문_반복문2 {

	public static void main(String[] args) {
		System.out.println("각각 다른 형식이지만 같은 결과값이 나옴");
		System.out.println("========== for ==========");
		for(int i=1;i<=10;i++)
		{
			if(i%2==0)//if문이 들어가는 위치
			{
				System.out.print(i+" ");
			}
		}
		System.out.println("\n========== while ==========");
		int i=1;
		while(i<=10)
		{
			if(i%2==0)//if문이 들어가는 위치
			{
				System.out.print(i+" ");
			}
			i++;
		}
		System.out.println("\n========== do~while ==========");
		i=1;
		do {
			if(i%2==0)//if문이 들어가는 위치
			{
				System.out.print(i+" ");
			}
			i++;
		}while(i<=10);

	}

}
