package com.sist.main;
/*
 *    194page => 상속목적와 형식 읽어보기
 *    
 *    199page => "논리적 포함관계" 읽어보기
 *                abstract => 추상적인 => 공통적인 내용 모아둔 것이다
 *                
 *    201~202page => 다중상속시 변수의 충돌이 일어날수 있음으로 단일상속만 허용
 *                => 변수/메소드 오버라이딩 => 재정의 => 변경
 *                
 *    204page => 메소드 오버라이징
 *    
 *    206page => 오버로딩(중복함수정의:새로운기능추가) 오버라이징(재정의:기존의메소드수정) 차이점!
 *    
 *    207page => 접근지정어
 *    
 *    211page => 생성자
 *    
 *    215page => this();와 super(); 읽어보기
 *    
 *    217page => final이 붙으면 변수는 상수형이 되고 메소드는 확장이 안되는 메소드가됨
 *    
 *    
 *    <매우중요>221~227page => 객체의 형변환(=클래스의 크기가 있다) 
 *                                     ---------
 *                                 |반드시 상속/포함을해야 크기비교가능
 *                                 |class A extends B ==> A<B
 *                                 |class A
 *                                 |{
 *                                 |   B b=new B(); //포함
 *                                 |}
 *                                 |class B ==> A>B
 *                                 
 *                                 |묵시적 타입 변환(=자동형변환)
 *                                 
 *                                 |클래스도 데이터형이다
 *                                 |=>자바에서 지원하지 않는 데이터 형이라
 *                                    사용자 정의 데이터형
 *                                 
 *                                 
 *    page => 읽어보기
 *    page => 읽어보기
 *    page => 읽어보기
 *    page => 읽어보기
 *    
 *    ---------------------------------------------------------------------
 *    **this();와 super();는 생성자 첫줄에 사용해야함
 *      = 두개를 동시에 사용할수는 없다는뜻
 *      
 *    **제어자
 *      접근지정어 : private, protected, public, default
 *      그외 : static, final, abstract, synchronizer
 *      
 *      static=공통적인=공유변수
 *            =클래스,메소드,변수에서 사용가능 / 지역변수는불가능
 *      final : 마지막
 *      
 *      abstract : 추상적인(공통성), 미완성
 *               : 추상클래스/인터페이스
 *      
 *      synchronized 
 *       =동기화:데이터실행종료후재실행(속도↓)
 *            : 음악다운로드의 경우 하나를 다 다운해야 다음걸 실행하는예시
 *       =비동기:데이터종료여부와상관없이실행(속도↑)
 *            : 홈페이지에서 동시다발적으로 바뀌는 배너들
 *            : AJax
 *            
 *    **조합
 *    --------------------------------------------
 *      대상         조합
 *      클래스      (O) public default final abstract
 *                (X) protected private
 *                
 *      변수       (O) private final static
 *      
 *      메소드     (O) public final static abstract
 *      
 *      지역변수    (O) final
 *    
 *    
 */
public class MainClass3 {

	public static void main(String[] args) {

	}

}
