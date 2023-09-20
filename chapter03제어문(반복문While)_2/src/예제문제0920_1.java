//1.  int형 변수 x가 10보다 크고 20보다 작을 때 true인 조건식 작성 (조건문)
public class 예제문제0920_1 {

	public static void main(String[] args) {
		int a=(int)(Math.random()*100)+1;
		System.out.println(a);
		
		if(a>10 && a<20)
		{
			System.out.println("a는 10보다 크고 20보다 작습니다.");
		}
		else
		{
			System.out.println("a기준값에 들어가지 않습니다.");
		}

	}

}
