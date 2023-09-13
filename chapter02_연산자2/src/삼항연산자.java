/*     삼항연산자는 if문 대신 주로 쓰임
 * 
 *      이항 => () + ()
 *      삼항 => () + () + ()
 *             (조건)?값1:값2
 *             -----
 *             true => 값1
 *             false => 값2
 *             
 *             int a=10;
 *             (a%2==0)?"짝수":"홀수"
 */
public class 삼항연산자 {

	public static void main(String[] args) {
		  int a=(int)(Math.random()*100)+1; //1~100 사이의 숫자발생
		  System.out.println(a%2==0?"짝수":"홀수");
		  System.out.println("랜덤숫자 : "+a);
		  
		  //예제문제) sex=1,3 남자  sex=2,4 여자
		  int sex=(int)(Math.random()*4)+1; //1~4 사이의 숫자발생
		  System.out.println(sex%2==0?"여자":"남자");
		  System.out.println(sex%2!=0?"남자":"여자");
		  System.out.println("성별숫자 : "+sex);

	}

}
