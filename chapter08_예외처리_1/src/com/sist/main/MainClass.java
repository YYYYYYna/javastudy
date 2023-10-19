package com.sist.main;
/*
 *        ***JSP, Spring, Spring-Boot => 기본 자바
 *           => 서버구현 : HTML/CSS/JavaScript
 *           => 데이터 저장 : 오라클/MySQL(오라클의무료버전이라중요)
 *           => 데이터 분석 : 파이썬 
 *           
 *           
 *        ***default는 접근지정어는 아니다 = 구현된 메소드임을 알려주기 위해(=선언된 메소드와 구분을 위해) 앞에 붙이는거임
 *        
 *        ***[컬렉션:Collection] : CRUD
 *                  |
 *           -----------------------
 *           |
 *          List <===얘가 인터페이스인거임!!!!----------------------------
 *           |                                                     |
 *        -------------------------------------                    |
 *        |         |        |         |      |                    ↓
 *    ArrayList  Vector  LinkedList  Stack  Queue  ==> 해당부분에서 "추가할때" "add()"라는 공통메소드를
 *                                                     사용하기로 약속하면? 중간에 ArrayList에서 Vector로
 *                                                     클래스(생성자)가 바뀌더라도 "List.add()" 그대로 
 *                                                     별도의 수정없이 모든 클래스에서 쉽게 구현할 수 있음!!!!
 *            
 *        
 *        7장 정리
 *        [인터페이스]
 *                 인터페이스는 같은 기능을 가지는 클래스를 만들어서 제어 => 아니면 제어가 안됨..
 *                          --강제화--
 *                 인터페이스로 관리할때는 클래스에 추가적인 내용을 넣으면안됨 : 인터페이스가 제어를 못하기 때문
 *                 예) interface I {
 *                        void aaa();
 *                        void bbb();
 *                        void ccc();
 *                        
 *                        //아래 클래스에 새로운 메소드를 여기에 넣어주면 제어가능
 *                        void default ddd(){} //근데 모든 클래스에서 생성을 하기엔 메모리 낭비임으로
 *                        void default eee(){} //"선언만하고 구현안된 메소드"를 넣어두기만 한거임
 *                        void default kkk(){} //그걸 default로 구분하는거임
 *                    }
 *                    class A implements I {
 *                        void aaa(){};
 *                        void bbb(){};
 *                        void ccc(){};
 *                        
 *                        //새로운 기능 추가함
 *                        void ddd(){}; 
 *                    }
 *                    class B implements I {
 *                        void aaa(){};
 *                        void bbb(){};
 *                        void ccc(){};
 *                        
 *                        //새로운 기능 추가함
 *                        void eee(){};
 *                    }
 *                    class C implements I {
 *                        void aaa(){};
 *                        void bbb(){};
 *                        void ccc(){};
 *                        
 *                        //새로운 기능 추가함
 *                        void kkk(){}; //=>그럼 이부분은 인터페이스로 관리못함(=인터페이스 필요없어짐..)
 *                    }
 *                    <출력부>
 *                    I i=new A() => i를 가지고 A가 가지고 있는 메소드를 제어 ==> aaa(),bbb(),ccc()
 *                                => 그러나 문제발생 : i로 접근할 수없는 추가된 메소드가 존재 ==> ddd()
 *                                
 *                    I i=new B() => i를 가지고 B가 가지고 있는 메소드를 제어
 *                                => 그러나 문제발생 : i로 접근할 수없는 추가된 메소드가 존재 ==> eee()
 *                    
 *                    I i=new C() => i를 가지고 C가 가지고 있는 메소드를 제어
 *                                => 그러나 문제발생 : i로 접근할 수없는 추가된 메소드가 존재 ==> kkk()
 *                    ===>따라서 인터페이스로 관리할때는 클래스에 추가적인 내용을 넣으면안됨 : 인터페이스가 제어를 못하기 때문
 *                    
 *                    ===> A,B,C가 유형이 같은 경우 한개의 이름으로 제어하는게 편함
 *                    ===> 인터페이스의 목적은 서로 다른 "관련된" 클래스를 묶어서 관리 => 게시판은 인터페이스고 채팅게시판,00게시판...이 클래스
 *                         1) 이렇게 되면 관리하기가 편하고 소스코딩이 간결해진다
 *                         2) 인터페이스의 메소드만 알면 관리하기 편함
 *                            예) 오라클 MySQL MSSQL DB2 SQLITE... 어느 데이터 베이스를 사용할지 모름
 *                               ---------DriverMavager--------라는 인터페이스로 바로 적용 데이터베이스를 바꿀수 있음!!
 *                               => SQL 문장은 ANSI(표준화)이고 데이터형이 서로 다를뿐임
 *                               => 결과적으로 똑같은 메소드를 사용하기 때문에 표준화가 쉽게 가능함
 *                         
 *        1) 인터페이스와 추상클래스의 차이점
 *           ------------------------------------------------------------
 *                         인터페이스                     추상클래스
 *           ------------------------------------------------------------
 *            구현메소드        선언된                      구현/선언
 *            보유여부       메소드만 보유                   메소드 둘다
 *                        
 *                      ~1.8버전부터는달라짐~
 *                       = default
 *                       = static
 *                         :접근시에 반드시
 *                          인터페이스명으로만
 *                          접근이 가능
 *           ------------------------------------------------------------
 *            인스턴스변수    사용할 수 없다                 사용이 가능
 *                         => 공용                    => private 변수 사용가능
 *                         => "상수형변수"만 사용이 가능
 *                         => 오직! public만 사용가능
 *                            (안쓰면자동으로추가해줌)
 *                            
 *                         ~openjdk~
 *                          jdk => 1.9(private사용가능)
 *                          C/C++을 따라가는 추세임
 *           ------------------------------------------------------------
 *            생성자       생성자가 없다                   생성자가 있다
 *           ------------------------------------------------------------
 *            접근범위     모든내용을공개(public이다보니)   한정한다(private도가능하다보니)
 *                      ------=메소드/변수             (물론모든 접근지정어 사용가능)
 *           ------------------------------------------------------------
 *            상속           다중상속                      단일상속
 *                        implements                  extends
 *                        
 *                        **
 *                        interface에서
 *                        interface상속시
 *                        extends
 *                        
 *                        interface에서
 *                        class상속시
 *                        implements
 *                        
 *                        **
 *                        윈도우                     사용자정의,라이브러리
 *                        다중상속이주로쓰임             => 단일상속이 중심이다
 *           ------------------------------------------------------------
 *           
 *        2) 인터페이스와 추상클래스의 공통점
 *           = new를 이용해서 메모리 할당이 불가능하다 (뭐..lambda의 경우는 사용할수도 잇지만..)
 *             아예 불가능한건 아님...new를 사용하는 순간 포함되어있는 메소드를 익명의 클래스를 사용해서
 *             override로 모두 재정의 해줘야함....
 *             
 *           = 공통목적) +""서로다른 클래스를 연결해서 사용이 가능하도록 함""
 *                    +관련된 클래스를 모아서 사용할 때 주로 사용
 *           
 *           = 실생활에서 비유를 하자면) 110V를 220V로 변환해주는 어뎁터를 인터페이스라고 할수 있음
 *                                마우스,키보드 만드는 업체가 여러개가 있음 => MS에서 공통된 인터페이스를 전송함
 *           
 *        3) 인터페이스의 구성요소
 *           public interface interface명
 *           {
 *              ------------------------
 *               [상수] : 반드시 초기값 설정 (값을집어넣어야함:명시적으로설정)
 *                  = 예를들어 int a=10; 처럼 값이 있어야함
 *                  
 *                  => (public static final) int a=10;
 *                     :생략이 되면 (접근지정어/제어어)를 자동추가해줌
 *              ------------------------
 *               [구현이 안된 메소드] : 프로그램에 맞게 개발자가 알아서 구현해야함
 *                  = default가 없는 메소드라는 뜻~~
 *                  = 그럼 데이터베이스가 다르고 메소드 구조는 같다는 뜻임으로 보다 빠른 개발이 가능
 *                    :메소드 구조가 같다는건 사용자 요구분석을 통해 메뉴구성을 알려주는것과 같음
 *                    
 *                  => (public abstract) void display();
 *              ------------------------
 *               [구현이 된 메소드] : 공통으로 사용되는 부분이라는뜻
 *                  = 필요시 마다 변경해서 사용
 *                  
 *                  => (public) default void method(){구현도해줘야함}
 *                              -------
 *                              접근지정어아니고구현된메소드임
 *                  => (public) static void method(){구현도해줘야함}
 *                     <호출시>
 *                     인터페이스명.메소드명()
 *              ------------------------
 *           }
 *           ***만약에 기능 추가가 있는 경우에는 default를 이용해야 오류없이 구현 가능
 *           
 *           
 *        
 */
interface I{

	//static method : public을 생략해도 자동으로 컴파일러에 의해 자동추가됨
	public static void display() {
		System.out.println("I:display() Call...");
	}
}

class A{
	public static void aaa() {
		System.out.println("A:aaa() Call...");
	}
}

class B extends A{
	    //=상속
	public void bbb() {
		
		//class A에 접근가능함
		aaa();
		A.aaa();
	}
}

class C implements I{
	    //=구현(상속이기도함)  ===> 둘다 클래스인데 class(단일상속) , interface(다중상속) 의 개념이라 생각하면됨 
	public void ccc() {
		
		//display(); //불가능!!
		I.display(); //가능!! = interface에 static메소드는 인터페이스.메소드()로만 접근이 가능
		
	}
}

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
