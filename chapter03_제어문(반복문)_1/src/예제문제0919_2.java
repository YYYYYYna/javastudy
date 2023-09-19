//2) 5,10,15,20,25,30,35,40,45,50을 출력하는 프로그램을 만들어라 (for 사용)
/* 
 *          초기값 : 5
 *          조건식 : <=50
 *          증가식 : +=5
 */
public class 예제문제0919_2 {

	public static void main(String[] args) {
		
		for(int i=5;i<=50;i+=5)
		{
			if(i==50)
			{
				System.out.print(i);
			}
			else
			{
				System.out.print(i+",");
			}
		}
	}

}
