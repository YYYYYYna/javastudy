/*
 *  ♥♥♥♥♥
 *  ♥♥♥♥♥
 *  ♥♥♥♥♥
 *  ♥♥♥♥♥
 *  ♥♥♥♥♥
 *  
 *  줄수 1  2  3  4  5
 *  별표 5  5  5  5  5
 *  
 *  줄수 for(int i=1;i<5;i++)
 *  별표 for(int j=1;j<=5;i++)
 */
public class 제어문_반복문4 {
	public static void main(String[] args) {
		/*for(int i=1;i<5;i++)
		{
			for(int j=1;j<=5;j++)
			{
				System.out.println("♥");
			}
			System.out.println();
		}*/
	
	
	/*
	 *  ABCDE
	 *  FGHIJ
	 *  KLMNO
	 *  PQRXT
	 */
		/*char c='A';
		for(int i=1;i<5;i++)
		{
			for(int j=1;j<=5;j++)
			{
				System.out.print(c++);
			}
			System.out.println();
		}*/
		
		/*
		 *  ABCDE
		 *  ABCDE
		 *  ABCDE
		 *  ABCDE
		 */
			
			/*for(int i=1;i<=4;i++) //처음부터 끝까지 계속증가=for문바깥쪽에 변수선언
			{   char c='A'; //범위가 있다면,시작값이같다면=for문 안쪽에 변수선언
				for(int j=1;j<=5;j++)
				{
					System.out.print(c++);
				}
				System.out.println();
			}*/
		/*
		 *  ♥♡♡♡♡
		 *  ♡♥♡♡♡
		 *  ♡♡♥♡♡
		 *  ♡♡♡♥♡
		 *  ♡♡♡♡♥
		 */
			
		/*	for(int i=1;i<=5;i++)
			{
				for(int j=1;j<=5;j++)
				{
					if(i==j)
					{
						System.out.print("♥");
					}
					else
					{
						System.out.print("♡");
					}
				}
				System.out.println();
			}*/
	
	}
}
