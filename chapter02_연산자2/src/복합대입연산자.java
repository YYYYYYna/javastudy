//41page => 증감 (원하는 갯수만큼) => 복합 대입 연산자
/*
 *     op =
 *     +- (중요)
 *     -= (중요)
 *     *=
 *     /=
 *     &=
 *     ^=
 *     |=
 *     >>=
 *     <<=
 *     
 *     한개 증가
 *     -------
 *     int a=10;
 *     a++ , ++a , a=a+1 ==> a+=1
 *     -------
 *     두개증가
 *     a++;
 *     a++;
 *     
 *     a=a+2 ==> a+=10
 *     
 *     a--, --a
 *     a=a-1 , a-=1 ==> 문자열 누적, 숫자 누적시에 주로 사용
 */
public class 복합대입연산자 {
	public static void main(String[] args) {
		int a=10;
		//a를 100증가했을때 값은?
		a+=100;
		System.out.println(a);
		
		int b = a-50;
		System.out.println(b);
		
		/*
		 *   변수수정하는방법
		 *   int a=10;
		 *   a=50;
		 *   앞에 int 같은 선언을 빼면 됨
		 *   
		 *   
		 *   혹은 같은 변수에 다른값을 저장하고 싶을땐 {}로 영역을 나눠주면됨
		 *   {
		 *   int a=10; => 이런식으로 해당블럭{}안에서만 사용하는 지역변수를 설정하면가능
		 *   }            그러나 지역변수를 사용하려면 초기값을 설정해둬야함
		 *   int a=100;
		 */
		a = a-50;
		System.out.println(a);
		
	}
}
