//3) B,D,F,H,J,L,N을 출력하는 프로그램을 작성하라 (for 사용)
public class 예제문제0919_3 {

	public static void main(String[] args) {
		for(char c='B';c<='N';c++)
		{
			if(c%2==0)
			{
				System.out.print(c+" ");
			}
		}

	}

}
