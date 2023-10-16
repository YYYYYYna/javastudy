package com.sist.main;
/*
 *     상속 => 1)멤버변수 2)메소드
 *            -------
 *               | static, private
 *             접근지정어
 *             -------
 *             | public / protected => 패키지와 관계없이 받을수 있다.
 *             | default => 패키지가 같은경우 받을 수 있다
 *             | private => 상속을 받을수 없다
 *             => 생성자 초기화블록은 받을수 없다.
 *             
 *       1=> 클래스 여러개를 한개의 객체로 접근시에는 상위클래스를 이용한다.
 *           예)
 *           Student
 *           ↑ 상속 ↑
 *        HStudent UStudent
 *           
 *           ---------접근방법1---------
 *           HStudent h=new HStudent()
 *           UStudent u=new UStudent()
 *           
 *           ---------접근방법2---------
 *           Student h=new HStudent()
 *           h=new UStudent()
 *           
 *      2=> 모든클래스를 한개의 객체로 연결이 가능(=Object) : Object o=new MainClass()
 *                                                 o=new MainClass1()...
 *                                                 Object는 모든 데이터형을 묶어서 사용이 가능
 *                                                 
 *                                                 예) 자바의 매개변수가 객체인 경우 
 *                                                    Object => 형변환 해서 사용해야함
 *                                                    Object o=10;
 *                                                    o=10.5;
 *                                                    o=true;...
 *          형식)
 *           class 하위클래스 extends 상위클래스
 *           => 단일상속만 가능
 *          
 *          다중상속은 불가능하다)
 *           class Man
 *           {
 *              String name;
 *              int age;
 *           }
 *           class Woman
 *           {
 *              String name;
 *              int age;
 *           }
 *           class Human extends Man,Woman => 다중상속 => 자바에서는 존재하지 않음
 *           {
 *              //Man에 관련 내용
 *              String name;
 *              int age;
 *              
 *              //Woman에 관련 내용
 *              String name;
 *              int age;
 *              
 *              ===> 동일변수로 2개의 값이 들어오게 됨으로 오류가남
 *           }
 *           **다중상속은 C/C++만 가능
 *           **자바에도 다중상속은 존재하나 => 인터페이스(7장)에서만 쓰임                           
 */
public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
