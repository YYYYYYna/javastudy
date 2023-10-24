package com.sist.lib;

/*
 *    Wrapper : 기본 데이터형을 클래스화
 *      => 기본 데이터형에 기능을 부여해서 쉽게 사용이 가능
 *      int ==> Integer
 *      long ==> Long
 *      double ==> Double
 *      boolean ==> Boolean
 *      --------------------웹에서 주로 사용
 *      
 *      => 웹/윈도우 => 모든 데이터값 문자열
 *                   ---------------
 *                   문자열을 정수,실수,논리형
 *                   
 *         예를들어 평점의 경우는 읽을때는 String이고 저장할때는 double로 저장해야함
 *         
 *      예) Double.parseDouble("4.5") => 4.5
 *         Integer.parseInt("10") => int page=10
 *         Boolean.parseBoolean("true") => true (HTML에서 체크박스값 읽어올때 많이 사용됨)
 *      
 *    제네릭:<>(데이터형 통일에 사용) 사용시
 *    ----메소드 => 리턴형,매개변수
 *                  ----------Object형으로 대부분 퉁치기 때문에
 *                            주로 Object를 원하는 형으로 바꿀때 쓰임
 *                            
 *        <>이 안에는 클래스 형이 들어와야함 <Integer> 가능 | <int> 불가능
 *                            
 *      예) 예를들어 배열을 저장한다할때 어떤 클래스형을 사용할지 예측불가함 => Object로 대부분 막아버림
 *         class Box<T> ==> T<Object>
 *         :
 *         Box<String> 
 *         이렇게 변환 가능
 *         -------------------
 *         ***오토박싱/언박싱
 *         오토박싱 : Integer i=10; => int와 같이 사용가능
 *         언박싱 : int j=i;
 *              : int j=new Integer(100);
 *         ***이렇게 클래스지만 정수와 같이 사용할 수 있다
 */

import java.util.*;
public class MainClass_1 {
	
	//int대신 Integer로 대신사용가능
	static void aaa(Integer i) {
		System.out.println(i);
	}
	public static void main(String[] args) {
		
		//int대신 Integer로 대신사용가능
		aaa(10);
		
		//제네릭:<> 예시
		/*
		List list=new ArrayList();
		list.add("a");
		list.add(10.5);
		list.add(10);
		list.add('A');
		list.add(new MainClass_1());

		list.add(10.5);
		list.add(10);
		list.add('A');
		list.add(new MainClass_1());
		
		list.add(10);
		list.add("a");
		list.add(10.5);
		list.add('A');
		list.add(new MainClass_1());
		
		//이렇게 위처럼 패턴이 동일하지 않을때는 for문을 사용하지 못함
		*/
		
		//제네릭:<> 예시
		List<Integer> list=new ArrayList<Integer>();
		


	}

}
