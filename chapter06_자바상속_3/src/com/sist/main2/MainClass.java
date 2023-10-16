package com.sist.main2;

//메모리는 항상 상위클래스가 먼저 할당 => 그다음에 상속클래스가 메모리 할당 되어야함
class Super
{
	int a=10;//===> 이게 super.a로 가져오는 a값
	/*
	//가. default 생성자인경우
	public Super()
	{
		a=100;
		System.out.println("Super 생성자 호출...");
	}
	*/
	
	//나. 매개변수가 존재하는 경우
	public Super(int a)
	{
		a=100;
		System.out.println("Super 생성자 호출...");
	}
}
class Sub extends Super
{
	//여기는 a=100으로 상속됨 메소드니까
	int a; //===> 이게 this.a로 가져오는 a값
	public Sub()
	{
		//Super super=new Super();
		
		//가. =>상위클래스가 default생성자일때 super();생략이 가능 
		//super(); //따로 안에 아래처럼 매개변수(=100) 값도 안적어줘도됨
		
		//나. =>만약 상위 클래스가 매개변수가 존재하면 super();생략 불가능 => (int a매개변수에 무슨값이 들어갈지 모름으로)
		super(100); //상위클래스먼저 메모리할당 (그러나 public super();는 자동추가가되어 생략가능)
		
		
		a=1000;
		System.out.println("Sub 생성자 호출...");
		System.out.println("Sub:a="+this.a); //현재클래스(Sub)의 a값 (this는 생략가능)
		System.out.println("Super:a="+super.a); //상위클래스(Super)의 a값
	}
}
/*
 *    [217page]
 *    
 *    final 클래스
 *    ----------
 *    예) public final class ()
 *                          --- 확장이 안되는 클래스
 *                          --- 상속을 받을수가 없다
 *                          --- ex.String, Math, System...등등 java.rang에 들어있는건 안됨
 *                          
 *    예) public class MainClass "String" ==> 불가능!!!
 */
public class MainClass {

	public static void main(String[] args) {
		Sub sub=new Sub();
		/*
		 * 결과값은
		 * 
		 * Super 생성자 호출...
         * Sub 생성자 호출...
         * Sub:a=1000
         * Super:a=100
         * 
         * 이렇게 나옴....
		 */
	}

}
