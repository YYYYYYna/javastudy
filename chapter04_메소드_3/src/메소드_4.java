/*
 *    로또
 *    1. 6개 정수 중복없이 추출(1~45)
 *    2. 출력
 */
public class 메소드_4 {
	//1. 6개 정수 중복없이 (1~45)
	static int[] getRand()
	{
		int[] lotto=new int[6];
		for(int i=0;i<lotto.length;i++)
		{
			lotto[i]=(int)(Math.random()*45+1);//랜덤생성
			for(int j=0;j<i;j++)//중복제거
			{
				if(lotto[j]==lotto[i])
				{
					i--;
					break;
					
				}
			}
		}
		return lotto;
	}
	//2. 배열로 추출
	static void print(int[] lotto)
	{
		for(int i:lotto)
			//여기가매개변수
		{
			System.out.print(i+" ");
		}
	}
	public static void main(String[] args) {
		/*
		//1. 6개 정수 중복없이 (1~45)
		int[] lotto=new int[6];
		for(int i=0;i<lotto.length;i++)
		{
			lotto[i]=(int)(Math.random()*45+1);//랜덤생성
			for(int j=0;j<i;j++)//중복제거
			{
				if(lotto[j]==lotto[i])
				{
					i--;
					break;
					
				}
			}
		}
		//2. 배열로 추출
		for(int i:lotto)
			//여기가매개변수
		{
			System.out.print(i+" ");
		}
		*/

	}

}
