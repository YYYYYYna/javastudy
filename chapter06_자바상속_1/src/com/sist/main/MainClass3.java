package com.sist.main;
/*
 *      => 객체 지향
 *         ------
 *         데이터 손실 방지 : 캡슐화(변수:private=>은닉화 , 기능 => 처리)
 *                            --- 저장/읽기
 *                            --- getter/setter
 *                            (*Jsoup을 이용한건 해킹이니...상용화하면안됨)
 *         재사용 : 상속 / 포함
 *         수정 / 추가 : 유지보수
 *         ---다형성---(오버라이딩/오버로딩)
 *        ============================================================
 *        상속 : 재사용
 *        --- 상위 클래스 : 상속을 "내리는" 클래스 => 공통적으로 사용하는 내용(변수,메소드)
 *            하위 클래스 : 상속을 "받 는" 클래스 => 재사용 → 확장(extends)
 *            => 결과적으로 확장된 하위 클래스를 주로 사용
 *            => 간혹 여러개의 하위 클래스를 묶어서 사용할때 상위 클래스를 이용
 *            
 *            : 단일상속 , 키워드(extends)
 *            
 *            : ==> 보통 ①을 더 많이 사용
 *              ① 있는 그대로 사용 (변경없이) => 포함(ex.Scanner)
 *                                     예) class Window
 *                                     {
 *                                        JFrame fr=new JFrame()
 *                                     }
 *                                     => 심지어 Spring 에서는 new없이 메모리 할당이 되기 때문에
 *                                        ①을 더 자주 사용함    --------------=리플렉션
 *              ② 변경해서 사용 => 상속
 *                             예) class Window extends JFrame
 *           상속의 형식)
 *            : class A
 *              class C
 *              class B extends A,C => 오류! (단, C언어,React 는 가능)
 *              
 *              class A
 *              class C extends A => A,C 가능
 *              class B extends C => A,C,B 가능
 *              => 상속받은 클래스가 메모리는 크다
 *              => 클래스의 크기는 위로 올라갈수록 크다 (범위)
 *                 => 위로 올라갈수로 공통기반이크다(추상화) 
 *                 => 아래로내려갈수록 구체화
 *                 예) 
 *                    생물
 *                     |
 *                   ---------
 *                   |       |
 *                  동물     식물
 *                   |
 *                   ----------------
 *                   |     |    |   | 
 *                  포유류  양서류 조류 ...
 *                  
 *                  이 "상속" 과정을 통해 위로 올라갈수록? 범위가 커짐
 *                  아래로 내려갈수록? 구체화됨
 *                  
 *                  따라서 
 *                  class A
 *                  class B extend A => A>B ==> is-a(상속)
 *                  
 *                  class A
 *                  class B
 *                  {
 *                     A a=new A() ==> B>A ==> has-a(포함)
 *                  }
 *                  
 *           상속의 예외조건)
 *            static : 상속은 없다 => 공통사용 가능
 *            private : 상속은 가능 => 접근이 불가능
 *            생성자,초기화 블록 : 둘다 모두 예외
 *            
 *           상속의 메모리 할당)
 *            여러개를 묶어서 사용 => 상위클래스로 메모리 할당
 *            확장된 클래스로 메모리 할당
 *            예) class A
 *               class B extends A => B,A
 *               class C extends A => C,A
 *               class D extends A => D,A
 *               class E extends A => E,A
 *               
 *      
 *            
 *         
 */
public class MainClass3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
