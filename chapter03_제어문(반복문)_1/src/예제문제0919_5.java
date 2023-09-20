//5) 1부터 30까지의 정수에서 짝수만 한 줄에 3개씩 출력하라
//            변수필요없음
public class 예제문제0919_5 {

	public static void main(String[] args) {
		
		for(int i=1;i<=30;i++)
		{
			if(i%2==0)
			{
				System.out.printf("%d\t",i);
			  //System.out.printf(i+" ");
			}
			if(i%6==0)
			{
				System.out.println();
			}
		}
	}
}
