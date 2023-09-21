/*
 *    break; continue; 이름있는break; 세가지의 제어범위 차이
 *    
 *    그중에서 break;는 많이 쓰이기 때문에 꼭 숙지를 해야함
 *    
 *    break; => while과 for에서 주로 쓰임
 *    System.exit(0) => 자주사용하지않음 창 자체를 종료하기 때문에
 *    
 */
public class 제어문_반복제어문2 {

	public static void main(String[] args) {
		System.out.println("==== break; ====");
		for(int i=1;i<=3;i++)
		{
			for(int j=1;j<=3;j++)
			{
				if(j==2)
				{
					break; //j만 제어하기 때문에 
					       //출력값은 i=1 j=1 / i=2 j=1 / i=3 j=1 이렇게 나옴
				}
				System.out.println("i="+i+",j="+j);
			}
			System.out.println();
		}
		
		System.out.println("==== continue; ====");
		for(int i=1;i<=3;i++)
		{
			for(int j=1;j<=3;j++)
			{
				if(j==2)
				{
					continue; //j만 제어하기 때문에 
					          //출력값은 i=1 j=1 j=3 / i=2 j=1 j=3 / i=3 j=1 j=3 이렇게 나옴
				}
				System.out.println("i="+i+",j="+j);
			}
			System.out.println();
		}
		
		System.out.println("==== 이름이 있는 break; ====");
		aaa:for(int i=1;i<=3;i++)
		{
			for(int j=1;j<=3;j++)
			{
				if(j==2)
				{
					break aaa; //1차 2차 for문을 모두 제어하기 때문에  
					           //출력값은 i=1 j=1 에서 끝남
				}
				System.out.println("i="+i+",j="+j);
			}
			System.out.println();
		}

	}

}
