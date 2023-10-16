package com.sist.main2;
/*
 *       206page
 *       -----------------------------다형성
 *              [오버로딩]        [오버라이딩]
 *     클래스   같은클래스안에서      상속조건이있어야    만들어짐
 *    메소드명      같아야            같아야        만들어짐
 *    매개변수  갯수나데이터형이달라야      같아야       만들어짐
 *     리턴형      관계없이            같아야       만들어짐
 *   접근지정어     관계없이       축소가능,확대불가능   만들어짐
 *            (=새로운기능추가)   (=기존의메소드변경)
 *   
 *   예) 
 *     class A
 *     {
 *        void aaa()
 *        {
 *           void aaa(){}
 *        }
 *     }
 *     class B extends A 
 *     {
 *        void aaa(){} ==> (A에 대해)오버라이딩
 *        void aaa(int a){} ==> (A에 대해)오버로딩
 *     }
 *   
 */
public class MainClass2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
