package com.sist.main;
/*
 *                         ------ 기능을 상속하는 부분이 중요!!! 변수보다 메소드가 중요
 *       1. 상속 => 멤버변수 / "메소드" 2개 보내줌!!!!!!!!!아오
 *                 -----   
 *                 접근지정어에 따라 상속안되는 변수도 있음 
 *                 private=불가능 , default=패키지다른경우불가능
 *                 
 *              => 따라서 상속은 변수가 아니라 "메소드를 재사용 하거나 변경하는데 의의"가 있음(기능처리부분이중요)
 *                 => 객체지향관련이 메소드와 관련이 있기 때문임!
 *                 => 라이브러리는 변수가 없음(상수만보유) => 메소드만 존재
 *              
 *              형식) 
 *                단일상속만 가능
 *                class SubClass extends SuperClass
 *                               -------
 *                               기존의 클래스를 확장(수정,추가)
 *                {
 *                   //SuperClass가 보유한 모든 메소드 사용이 가능
 *                   //변경해서 사용(=오버라이딩)도 가능!!!
 *                }
 *              호출)
 *               class A
 *               class B extends A
 *                   (sub)    (super)  ==> super>sub
 *                   : 상속을 내리는 클래스가 상속을 받은 클래스보다 크다
 *                   : 모든 클래스의 상위클래스는 Object(=가장큰클래스)다
 *                     => 자바에서 지원하는 라이브러리의 메소드는 => 대부분 Object를 리턴함 => 그럼 형변환을 시켜줘야함
 *                     예) class A
 *                        {
 *                           void aaa(){}
 *                        }
 *                        main에서
 *                        Object o=new A(); 는 가능
 *                        그러나
 *                        o.aaa()는 불가능
 *                        ==> 이건 상속"한"쪽에서는 상속"된"쪽의 데이터는 접근이 불가능하기 때문
 *                        ==> 이래서 형변환을 시켜줘야함~~~~
 *                        따라서 A o=new A(); 하위클래스로 받아줘야함~~~
 *                        ==>211page
 *              
 *              확장) 클래스 사용시에는 확장된 클래스를 사용한다.
 *               class B extends A인 경우
 *               굳이 A a=new A()를 하진 않음
 *               B b=new B(); ==> 이게 상속시 기본 / 매우중요함!!!!!!!!
 *               A a=new B(); ==> 특별한 경우(=A로부터상속받은클래스를묶어서쓸때) 사용
 *                                *인터넷 카페에서 게시판관리에 주로 사용하는 경우임  
 *                                *혹은 스프링에서 쓰임
 *                                
 *              접근) 상위클래스는 하위클래스에 있는 변수/메소드를 접근이 불가능하다
 *                   예)
 *                     class A
 *                     {
 *                        int a,b;
 *                        void aaa(){}
 *                        void bbb(){}
 *                     }
 *                     class B extends A
 *                     {
 *                        int c,d;
 *                        --눈에는안보이고메모리상에만배치됨--
 *                        int a,b;
 *                        void aaa(){} => 변경시
 *                        void bbb(){} => 변경시
 *                        --------------------------
 *                        void ccc(){} => 오버라이딩함
 *                     }
 *                     A a=new A(); a는 ==> a,b,aaa(),bbb() 접근가능
 *                     B b=new B(); b는 ==> a,b,aaa(),bbb(),c,d 접근가능
 *                     A c=new B(); c는 ==> a,b,"B.aaa()","B.bbb()=>오버라이드된부분" 접근가능
 *                                     ==> c,d는 접근 불가능 / ccc()도 접근불가능 B영역이기때문 A가 가지고있는것만 접근가능
 *                     
 *                     상위클래스 a=new 하위클래스();해도 상위클래스는 하위클래스의 변수/메소드 접근불가능 오버라이딩된 메소드 호출만 가능임~~
 *                     
 *                     클래스 객체명 => 객체는 클래스에 있는 변수,메소드만 사용한다
 *                     A a=> A클래스에 정의된 변수,메소드
 *                     
 *                     상위클래스에 하위클래스를 대입하면(상위클래스=하위클래스)
 *                     변수는 상위클래스를 따라가고
 *                     메소드는 하위클래스를 따라감~~~(상위클래스에있는메소드만!)       
 */

class A
{
	int a=10,b=10;
	void aaa() {System.out.println("A:aaa() Call");}
	void bbb() {System.out.println("A:bbb() Call");}
}
class B extends A
{
	int a=100,b=200,c=300,d=400;
	void aaa() {System.out.println("B:aaa() Call");}
	void bbb() {System.out.println("B:bbb() Call");}
	void ccc() {System.out.println("B:ccc() Call");}
}
public class MainClass {
	public static void main(String[] args) {
		A aa=new A();
		System.out.println("aa.a="+aa.a);
		System.out.println("aa.b="+aa.b);
		aa.aaa();
		aa.bbb();
		/*
		 * 결과값으론 
		 * 
		 * aa.a=0
         * aa.b=0
         * A:aaa() Call
         * A:bbb() Call
		 */
		System.out.println();
		
		//이 아래부분의 선언이 가장 많이 쓰임
		B bb=new B();
		System.out.println("bb.a="+bb.a);
		System.out.println("bb.b="+bb.b);
		System.out.println("bb.c="+bb.c);
		System.out.println("bb.d="+bb.d);
		bb.aaa();
		bb.bbb();
		bb.ccc();
		/*
		 * 결과값으론 
		 * 
		 * bb.a=100
         * bb.b=200
         * bb.c=300
         * bb.d=400
         * B:aaa() Call
         * B:bbb() Call
         * B:ccc() Call
		 */
		System.out.println();
		
		//인터페이스(클래스 여러개를 묶어서 사용)
		A cc=new B();
		System.out.println("cc.a="+cc.a);
		System.out.println("cc.b="+cc.b);
		//System.out.println("cc.c="+cc.c); //불가능
		//System.out.println("cc.d="+cc.d); //불가능
		cc.aaa();
		cc.bbb();
		//cc.ccc(); //불가능
		/*
		 * 결과값으론 
		 * 
		 * cc.a=10 //A변수
         * cc.b=20 //A변수
         * B:aaa() Call //B메소드
         * B:bbb() Call //B메소드
		 */
		
		
		
		
	}

}
