/*
 *   44page
 *   비교연산자 ===> 결과값(boolean : true/false)
 *   비교연산자의 사용처 : 조건문, 반복문
 *   숫자 (정수, 실수, boolean, 문자) => 문자열은 비교할 수 없다.
 *                  *boolean은 ==, != 은 사용가능
 *                  *문자는 어떤 연산자를 사용해도 정수형으로 변경
 *   ---------------------------------------------------
 *   1) == 같다
 *   2) != 같지않다
 *   3) < 작다
 *   4) > 크다
 *   5) <= 작거나 같다
 *   6) >= 크거나 같다
 *   ---------------------------------------------------
 *   
 */
public class 비교연산자 {

	public static void main(String[] args) {
		int a=(int)(Math.random()*100)+1;
		           //일련의 과정을 거쳐 해당값은 1~100을 뜻함
		int b=(int)(Math.random()*100)+1; //ex)예약가능한날
		System.out.println("a="+a);
		System.out.println("b="+b);
		System.out.println("a==b : "+(a==b));
		System.out.println("a!=b : "+(a!=b));
		System.out.println("a<b : "+(a<b));
		System.out.println("a>b : "+(a>b));
		System.out.println("a<=b : "+(a<=b));
		//a<b 이거나 a==b 이면 true. 즉 둘중 하나만 맞아도 true로 나옴
		System.out.println("a>=b : "+(a>=b));
		//a>b 이거나 a==b 이면 true. 즉 둘중 하나만 맞아도 true로 나옴
		
		char c=(char)((Math.random()*26)+65); 
		char d=(char)((Math.random()*26)+65);
		System.out.println("c="+c);
		System.out.println("d="+d);
		System.out.println("c==d : "+(c==d));
		System.out.println("c!=d : "+(c!=d));
		System.out.println("c<d : "+(c<d));
		System.out.println("c>d : "+(c>d));
		System.out.println("c<=d : "+(c<=d));
		System.out.println("c<=d : "+(c<=d));
		System.out.println("c>=d : "+(c>=d));
		//문자도 비교가 가능하다
		//동일한 수식에 변수만 바꿀때 원하는영역 블록지정 후 Edit-Find/Replace(=ctrl+F) 선택하면 바꿀수 있음
		
        boolean b1=false;
        boolean b2=true;
    	System.out.println("b1==b2 : "+(b1==b2));
		System.out.println("b1!=b2 : "+(b1!=b2));
	}

}
