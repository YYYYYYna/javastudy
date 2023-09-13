//   &&(직렬연산자:and)   ||(병렬연산자:or) 
/*
 *   사용처
 *   -----
 *   && => 기간이나 범위안에 포함
 *   || => 기간이나 범위가 아닌경우
 *   
 *   사용법
 *   -----
 *   ==> 조건에 사용할 수 있는 연산자 (부정연산자, 비교연산자)
 *   
 *   (조건) && (조건)         (조건) || (조건)  
 *     |        |
 *     ----------
 *         |
 *       결과값 
 *
 *   경우의 수
 *   -------
 *                &&            ||
 *   true  true   ==>  true     ==>  true
 *   true  false  ==>  false    ==>  true
 *   false true   ==>  false    ==>  true
 *   false false  ==>  false    ==>  false
 *   
 *   그런데 &&와 ||는 효율적인 연산을 수행한다.
 *   따라서 
 *   &&는 앞이 false면 뒤에있는 조건은 수행하지 않는다(결국 false니까)
 *   ||는 앞이 true면 뒤에있는 조건은 수행하지 않는다(결국 true니까)
 *   
 */
public class 논리연산자 {

	public static void main(String[] args) {
		int a=10;
		int b=9;
		boolean bCheck=a<b && ++b==a;
		System.out.println("bCheck : "+bCheck);
		System.out.println("b : "+b); //(&&는)효율적 연산을 하기 때문에 뒤의 조건을 수행하지않음
		System.out.println("(&&는) 효율적 연산을 하기 때문에 ++조건을 수행하지않음 따라서 b=9");
		
		a=10;
		b=9;
		boolean cCheck=a<b || ++b==a;
		System.out.println("cCheck : "+cCheck);
		System.out.println("b : "+b); 
		
		int c=10;
		int d=20;
		boolean dCheck=(c%2==0) && (d%2!=1);
		              //짝수조건      홀수조건
		System.out.println("dCheck : "+dCheck);
		
		dCheck=(c%2==0) || (d%2!=1);
              //짝수조건      홀수조건
		System.out.println("dCheck : "+dCheck);
	}

}
