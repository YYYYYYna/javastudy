package com.sist.main;
/*
 *      재사용 기법
 *      -------- 기존의 클래스(=라이브러리)를 사용 
 *      => 라이브러리는 상속보다는 포함이 더 많다
 *         -------
 *         | 상속을 할 수 없는 클래스가 많음 => 종단클래스 (예)public final class ClassName)
 *                                     ----------------------------------------
 *                                     => 대부분 java.lang에 많이 들어있음 [220pg]
 *                                        =public class MainClass extends String 이렇게 사용은 안됨
 *                                     => 확장이불가능하다=변경할수없다는 뜻임 ===> 그래서 "포함"을 사용함
 *      
 *      
 *      [**클래스 끼리는 상속/포함을 진행하야 크기비교가 가능하다]
 *      
 *      [크기비교의 유형]
 *      
 *      수 표현 => long(8) < float(4) 
 *      
 *      범위 비교 => 클래스비교에서 쓰임(=공통성이 많을수록 큼)  
 *             => class B extends A ==> A>B 
 *             => class 나무 extends 식물 ==> 식물>나무 
 *             
 *             [포함클래스의 경우]
 *             => class A
 *                class B
 *                {
 *                   A a;
 *                }
 *             ==> A<B
 *      
 *      [상속과 포함차이]
 *      윈도우 => 자동차모양으로 변경 : 상속
 *           : class Login extends JFrame
 *           {
 *           }
 *      윈도우 => 사각형으로 사용 : 포함
 *           : class Login
 *           {
 *              //주의사항!
 *              //이렇게 클래스 영역안에 있어야 포함클래스임
 *              JFrame fr=new JFrame();
 *              
 *              //주의사항!
 *              //메소드안에서 선언하면 포함클래스가 아님! 그냥 지역변수임
 *              public void display(){
 *                 JFrame fr=new JFrame(); //이러면 지역변수임
 *              }
 *           }
 *           <출력시>
 *           Login log=new Login();
 *           log.fr.메소드() 
 *           ==> 요렇게 사용해야함
 *           
 *           ==> 포함클래스가 많다!
 *               예) 계산기의 경우 숫자/연산자버튼들은 포함클래스로 구성해야함
 *                  상속으로 구성할수 없음(단일상속이기때문)
 *               예) class Movie라고 하면 String title;...등등 
 *                  변수들만 모아서 선언하는 클래스도 포함클래스라고 할수 있음
 *                  
 *           
 *                                     
 */
public class MainClass{

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
