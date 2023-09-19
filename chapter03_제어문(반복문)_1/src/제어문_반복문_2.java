/*
 *       1차 for
 *       => for(몇부터시작하는지;어디까지갈건지;몇씩증가하는지)
 *                  초기값       조건식       ++/+=
 *          예) 1~100
 *          for(int i=1;i<=100;i++)
 *          예) 1~100 홀수만
 *          for(int i=1;i<=100;i+=2)
 *          예) 1~100 짝수만
 *          for(int i=2;i<=100;i+=2)
 *       ---------------------------------------------
 *       문자는 정수 (문자는 모든 연산시 => 정수 변수) 
 *       
 *       for(int i=...) 일때 i는 for문 안에서만 사용가능
 *       만약 for문 이후에도 사용해야한다면 
 *       int i=1;
 *       for(int i=1;i<=30;i++)
		 {
			
		 }
		 System.out.println(i); //i값 31로 나옴
		 -> 이 이후에 사용가능
		 
		 
		 중첩 for => 2차 for문
		 형식)
		 for(초기값;조건식;증가식)
		 {
		    for(초기값;조건식;증가식)
		    {        -----이부분이중요
		    
		    }
		 }
 *          
 */
public class 제어문_반복문_2 {//전역변수
    static int aaa=100;//전역변수
	public static void main(String[] args) {//지역변수
		/*for(int i=1;i<=100;i+=2)
		{
			System.out.print(i+" ");
		}
		System.out.println();
		for(int i=2;i<=100;i+=2)
		{
			System.out.print(i+" ");
		}
		*/
		for(int i=1;i<=4;i++) //출력되는 줄수를 결정 (=tr)
		{
			for(int j=1;j<=5-i;j++) //실제 출력물 (=td) 결론적으로 tr td를 반복하는거임
			{
				System.out.print("a");
			}
			System.out.println();
		}

	}

}
