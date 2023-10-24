package com.sist.lib;
/*
 *      1. java.util
 *          => 프로그램에서 많이 사용되는 유용한 클래스의 집합
 *          => 반드시 import를 사용해야함
 *         1) 날짜 제어관련
 *            = date
 *            = Calendar : date에 없는 기능 확장함
 *         2) 문자열 분해
 *            = StringTokenizer : split을 보안함
 *         3) 자료구조 : 메모리에서 데이터를 쉽게 관리할 수 있게 만든 클래스
 *            ------
 *            "컬렉션"******
 *                 : 가변형(크기를 결정하지 않는다)
 *                 : 들어가는 데이터 만큼만 생성됨
 *            => 표준화가 되어있음 : 모든 개발자가 동일하게 사용한다 
 *            => CRUD 가능
 *               Collection => interface //어느때 무엇을 사용하는지를 외우는게 중요!
 *                   |
 *               ------------------------------------------
 *               |                  |                     |
 *               List               Set                   Map==>인터페이스
 *               :순서를 가짐          :순서가 없음             :순서는 없음
 *                (인덱스허용)         :데이터중복비허용          :데이터가 중복
 *               :데이터중복허용         *벤다이어그램형태*         :데이터와 인덱스부분이 짝을이뤄
 *                *표형태*                                   키,값으로 저장한다
 *                                                        :키는 중복할 수 없다
 *                                                        :클래스관리에 주로사용됨(스프링,웹)
 *                                                         *엑셀형태*
 *                                                         
 *         List
 *         ----
 *         |List를 구현한 클래스
 *         ---------------------------(Stack)
 *         |            |            |   
 *         **ArrayList  Vector       LinkedList
 *                                       |
 *                                       Queue
 *           ArrayList : 오라클에 있는 데이터 저장해서 제어
 *                       ------------------------(브라우저)
 *                       => 데이터 베이스 관련 => 비동기방식  
 *           Vector : 동기방식 => 네트워크(사용자정보=IP,PORT)
 *                    ***Vector의 단점을 보안한게 ArrayList 
 *           LinkedList : C호완 => 수정,삭제,추가
 *           
 *           ***List인터페이스를 구현한것임으로 메소드가 동일함
 *              하나의 메소드만 사용하면 메소드 오버라이딩 가능
 *            
 *         
 *         Set
 *         ---
 *         |Set을 구현한 클래스
 *         ----------------
 *         |              |
 *         **HashSet      TreeSet
 *         
 *         
 *         Map
 *         ---
 *         |Map을 구현하는 클래스
 *         -------------------
 *         |                 |
 *         **HashSet         Hashtable
 *            
 */

import java.util.*;
public class MainClass_1 {
	
	public static void main(String[] args) {
		
		//같은 인터페이스 임으로 메소드 공유 가능
		//List list=new ArrayList();
		List list=new LinkedList();
		
		list.add("홍길동");
		list.add("심청이");
		list.add("박문수");
		
		for(Object name:list)
		{
			System.out.println(name);
			//ArrayList()와 LinkedList() 둘다 같은 결과값 나옴
			//속도나 저장방식에 따라 사용하는게 달라짐
			//어느때 무엇을 사용하는지를 외우는게 중요
		}
		
	}

}
