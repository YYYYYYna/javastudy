package com.sist.main;
/*
 *    어떤 클래스로 선언하느냐에 따라 접근범위가 달라지고
 *    어떤 생성자를 선언하느냐에 따라 사용 메소드가 달라짐
 */
class A
{
	//A클래스는 B클래스에 있는 모든것을 사용할 수 없다.(사용가능목록:a,b,aaa())
	int a=10,b=20;
	void aaa() {
		System.out.println("A:aaa() Call...");
	}
}
class B extends A
{
	//상속받은변수와메소드변경=오버라이딩
	int a=100,b=200;
	void aaa() {
		System.out.println("B:aaa() Call...");
	}
	
	//B클래스는 A클래스에 있는 모든 것을 사용할 수 있다(사용가능목록:a,b,aaa(),c,d,bbb())
	int c,d;
	void bbb() {
		System.out.println("B:bbb() Call...");
	}
}

public class MainClass2 {

	public static void main(String[] args) {
		A a=new A();
		System.out.println("a.a=>"+a.a);
		System.out.println("a.b=>"+a.b);
		//System.out.println("a=>"+a.c);//하위클래스내용 사용불가능
		//System.out.println("a=>"+a.d);//하위클래스내용 사용불가능
		a.aaa();
		
		System.out.println();
		B b=new B();
		System.out.println("b.a=>"+b.a);//상위클래스내용 사용가능
		System.out.println("b.b=>"+b.b);//상위클래스내용 사용가능
		System.out.println("b.c=>"+b.c);
		System.out.println("b.d=>"+b.d);
		b.aaa();//상위클래스내용 사용가능
		b.bbb();
		
		System.out.println();
		///// A > B => 클래스의 크기 ==> 범위 (상속을 내린 클래스가 크다)
		/*
		 *    A a=new B();
		 *    B b=new A(); //오류:큰거를 작은걸로 받아서 오류남 => 그러나 형변환은 가능
		 */
		//[A로선언 하위클래스B로선언]
		A aa=new B();
		//aa로 접근할 수 있는 범위 : a,b,aaa()만 접근가능
		
		//멤버변수 호출시에는 (A.c)를 봐야함
		System.out.println("aa.a=>"+aa.a);
		System.out.println("aa.b=>"+aa.b);//=classA값출력
		//System.out.println("aa.c=>"+aa.c);//오류남
		//System.out.println("aa.d=>"+aa.d);//오류남
		
		//메소드를 호출하면 생성자(new B)를 봐야함
		aa.aaa();//=classB값출력
		//aa.bbb();//접근불가능
		
		System.out.println();
		//B cc=(B)new A(); //오류남!!!!
		//상위클래스를 하위클래스로 받는경우 => 형변환
		B bb=(B)aa; //위에서 객체선언이 되어서 형변환이 가능한거임
		System.out.println("bb.a=>"+bb.a);
		System.out.println("bb.b=>"+bb.b);
		System.out.println("bb.c=>"+bb.c);
		System.out.println("bb.d=>"+bb.d);
		bb.aaa();
		bb.bbb();
		
		/*
		 * int aa=(int)10.5;
		 * 
		 * 상속 : 하위클래스로 접근하는 것이 기본
		 *       ---------------------
		 *       class A
		 *       class B extends A
		 *       B b=new B();
		 *       A => 여러개를 한개의 클래스로 제어
		 *       
		 *       그러나 예외는 static 상속이 아님 또한
		 *       private, 생성자, 초기화블록 등은 예외접근범위임
		 *       
		 *       상위클래스는 공통적으로 사용하는 메소드,변수가 있어야함
		 */
		/*
		 *    [기존의 각각클래스의 변수와 메소드 비교]
		 *    학생         회사원
		 *    --          ---
		 *    학번          사번
		 *    ----------------
		 *    이름          이름  ==> 해당공통 변수가 상위클래스로 올라감
		 *    나이          나이
		 *    ----------------
		 *    학년          연차
		 *    -------------------
		 *    먹는다()      먹는다()  ==> 해당공통 메소드가 상위클래스로 올라감
		 *    잠을잔다()     잠을잔다()
		 *    --------------------
		 *    공부한다()     업무한다()
		 *    
		 *    
		 *    [상위 클래스 생성 후 클래스 생성]
		 *    사람(=학생과 회사윈의 상위클래스)
		 *    --
		 *    이름
		 *    나이
		 *    먹는다()
		 *    잠을잔다()
		 *    -------------------------------------
		 *    학생 extends 사람      회사원 extends 사람
		 *    --                   ---
		 *    학번                  사번
		 *    학년                  연차
		 *    공부한다()             업무한다()
		 *    
		 *    => 요렇게 상위클래스에서 상속을 이용하여 "중복부분 최소화"로 데이터관리 가능
		 *    => 단일상속만 가능하단걸 기억하기
		 *    => 상위 클래스는 하위 클래스가 가지고 있는 변수,메소드 사용이 불가능
		 *       하위 클래슨느 상위 클래스에서 내려준 변수,메소드를 사용할 수 있다.
		 *       => 변수 (static) 상속이 아니고 사용이 가능
		 *       => 공통으로 사용이 가능
		 *       
		 *    [객체생성의 경우]
		 *    class A
		 *    class B extends A
		 *    
		 *    방법1) B b=new B();
		 *    방법2) A a=new B(); //확장기능을 이용하기 위해 상속받은 B로 객체생성
		 *          => 여러 클래스를 한개로 묶어서 사용할때 주로 사용하는 방법
		 *          예) class 동물
		 *             class 사람 extends 동물
		 *             class 개 extends 동물
		 *             class 소 extends 동물
		 *             class 말 extends 동물
		 *             class 돼지 extends 동물
		 *             ----------------=공통적으로 쓰이는 클래스를 하나 만들고 따로 제어가능하도록
		 *             //1개를 가지고
		 *             동물 ani=new 사람();
		 *             //여러개 제어가능
		 *             ani=new 개();
		 *             ani=new 소();
		 *             //이런식을 상위클래스를 통해 접근하면 하위클래스중 하나가 오류가 나도
		 *             //결합성이 낮아서 전체에 에러를 발생하지 않음
		 *             
		 *          
		 *    방법3) A bb=new B();
		 *          B cc=(B)bb; //형변환을 위해서는 위에 생성자가 선언되어야함
		 *         
		 *    
		 *    
		 */

	}

}
