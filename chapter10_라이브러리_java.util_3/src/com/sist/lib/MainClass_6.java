package com.sist.lib;
/*
 *     ArrayList<클래스>
 *              ------
 *               |기본형 ==> Integer, String
 *               |나머지는 전부 사용자 정의 클래스
 *                 예) ArrayList<Music>
 *                    ArrayList<Movie>
 *                    ArrayList<Food>
 *                 => 사용자 정의 클래스를 사용하는 이유는
 *                    우리가 만든 메소드를 사용할때마다
 *                    Object형이면 형변환을 시켜줘야하기 때문엔
 */

import java.util.*;

public class MainClass_6 {

	public static void main(String[] args) {
		
		ArrayList<String> names1=new ArrayList<String>();
		names1.add("홍길동");
		names1.add("박문수");
		names1.add("심청이");
		names1.add("이순신");
		names1.add("강감찬");
		
		for(String name:names1)
		{
			System.out.println(name);
		}
		System.out.println("=====");
		
		
		
		ArrayList<String> names2=new ArrayList<String>();
		names2.add("홍길동2");
		names2.add("박문수2");
		names2.add("심청이2");
		names2.add("이순신");
		names2.add("강감찬");
		
		for(String name:names2)
		{
			System.out.println(name);
		}
		System.out.println("=====");
		
		
		
		ArrayList<String> temp=new ArrayList<String>();
		temp.addAll(names1);//다른 컬렉션의 데이터 추가 (임시객체생성으로 복사한거임)
		for(String name:temp)
		{
			System.out.println(name);
		}
		System.out.println("=====");
		
		
		
		temp.retainAll(names2); //temp(=name1)와 name2의 교집합을 가져와 달라는뜻
		for(String name:temp)
		{
			System.out.println(name);
		}
		System.out.println("=====");
		
		
		
		

	}

}
