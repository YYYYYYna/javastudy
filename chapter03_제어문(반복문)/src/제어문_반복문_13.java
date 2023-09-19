/*
 *   주사위 2개를 던져서 합이 6이 나올 확률
 */
public class 제어문_반복문_13 {

	public static void main(String[] args) {
		//1.5 2.4 3.3 4.2 5.1 5가지 
	
		for(int i=1;i<=6;i++)
		{
			for(int j=1;j<=6;j++)
			{
				if(i+j==6)
				{
					System.out.println(i+"+"+j);
				}
			}
		}

	}

}
