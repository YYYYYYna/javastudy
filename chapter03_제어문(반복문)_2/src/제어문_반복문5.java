/*
 *    // 조건식만 바꿔서 다른 출력을 하는거임!!!!
 *  
 *     ♥
 *     ♥♥
 *     ♥♥♥
 *     ♥♥♥♥
 *     ♥♥♥♥♥
 *     
 *  줄수 1  2  3  4  5
 *  별표 1  2  3  4  5
 *  i=j -> j<=i
 */
public class 제어문_반복문5 {

	public static void main(String[] args) {
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print("♥");
			}
			System.out.println("dd");
		}
		/*
		 *     ♥♥♥♥♥
         *     ♥♥♥♥
         *     ♥♥♥
         *     ♥♥
         *     ♥
		 *     
		 *  줄수 1  2  3  4  5
		 *  별표 5  4  3  2  1
		 *  i+j=6 따라서 j=6-i
		 */
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=5-i;j++)
			{
				System.out.print("♥");
			}
			System.out.println("ee");
		}
		/*
		 *     A
         *     BC
         *     DEF
         *     GHIJ
         *     KLMNO
		 *     
		 *  줄수 1  2  3  4  5
		 *  별표 1  2  3  4  5
		 *  i=j 따라서 j<=i
		 */
		char c='A'; //처음부터 끝까지 계속증가=for문바깥쪽에 변수선언
		            //범위가 있다면,시작값이같다면=for문 안쪽에 변수선언
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(c++);
			}
			System.out.println();
		}

	}

}
