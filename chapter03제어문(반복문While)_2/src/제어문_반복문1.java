/*
 * 
 *    while => 1차
 *    ----------- 응용 (파일 읽기, 데이터베이스(오라클연동))
 *    일반 프로그램의 반복문(for)
 *    형식) 
 *        초기값 ====== 1
 *        while(조건식) 2 ===> 
 *        
 *   이런식의 예제가 실무에서 대부분 사용...
 *   for()
 *   {
 *      while()
 *      {
 *          if()
 *          {
 *          }
 *      }
 *   }
 *   섞여있는 코드도 짤수 잇어야함
 */

//1~100까지의 짝수의 합, 홀수의 합
public class 제어문_반복문1 {

	public static void main(String[] args) {
		int even=0,odd=0,i=1;
		while(i<=100)
		{
			if(i%2==0)
			{
				even+=i;
			}
			else
			{
				odd+=i;
			}
			i++;
		}
		System.out.println("짝수의 합 : "+even);
		System.out.println("홀수의 합 : "+odd);

	}

}
