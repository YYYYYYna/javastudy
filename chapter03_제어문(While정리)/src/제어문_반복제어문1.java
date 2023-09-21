/*
 *   break; : 반복 중단
 *            ex) 게임에서 ESC키 실행으로 사용됨 (반복문/switch)
 *   continue; : 특정부분을 제외시키고 다시 실행할때 사용됨
 *   -------------------------------------------- 
 *   => 모두 반복문 에서만 사용이 가능
 *   => 제어영역 : 자신의 반복문에서만!!
 *             : 그러나 예외사항 79page <이름이 있는 break;문>
 *               outer for()
 *               {
 *                  for()
 *                  {
 *                      outer break; => 이럴경우 1,2차 for문 둘다 제어함
 *                  }
 *               }
 *   
 *   for
 *   while
 *   ----- break; 기능 동일
 *   
 *   for => 증가식이 무한루프
 *   while => 조건식이 무한루프
 *   ------------- continue; 기능 상이
 */
public class 제어문_반복제어문1 {

	public static void main(String[] args) {
		//break; => 반복문 종료
		/*for (int i=1;i<=10;i++)
		{
			if(i==3)
			{
				//소스코딩 가능
				break; //이뜻은 i=3일때 종료(반복)
				//소스코딩 불가능
				//break; 혹은 continue; 이후에는 종료가 되기 때문
			}
			System.out.println("i="+i);
			//1 2 까지만 출력되고 종료됨
		}*/
		
		//continue; => 반복문 종료
		for (int i=1;i<=10;i++)
		{
			if(i==3)
			{
				//소스코딩 가능
				continue; // => 종료가 아니라 증가식으로 이동해줌
				//소스코딩 불가능
				//break; 혹은 continue; 이후에는 종료가 되기 때문
			}
			System.out.println("i="+i);
			// 1 2 4 5 6 7 8 9 10 이 출력될것임
		}
		System.out.println("========== while ==========");
		/*int i=1;
		while(i<=10)
		{
			if(i==3)
			{
				break;
			}
			System.out.print("i="+i);
			i++;
		}*/
		int i=1;
		while(i<=10)//<-------
		{                 // |  조건식쪽으로 이동해서
			if(i==3)      // |  i=3인상태 그대로임으로
			{             // |  무한루프상태에 걸리게됨 실수하지않도록 주의!
				continue; //--
			}
			System.out.print("i="+i);
			i++;
		}

	}

}
