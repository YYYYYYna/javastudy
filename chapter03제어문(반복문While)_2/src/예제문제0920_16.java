/*
 * 16. 다음 결과를 출력하는 프로그램
 
       출력예) 1 # # # #
             # 2 # # #
             # # 3 # #
             # # # 4 #
             # # # # 5
 */
public class 예제문제0920_16 {

	public static void main(String[] args) {
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=5;j++)
			{
				if(i==j)
				{
					System.out.print(i);
				}
				else //이렇게 else로 처리를 해야 앞/뒤에 #이 하나씩 더 나오는 현상이 없음
				{
					System.out.print('#');
				}
			}
			System.out.println();
		}

	}

}
