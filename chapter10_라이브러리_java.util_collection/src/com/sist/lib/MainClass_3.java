package com.sist.lib;
/*
 *         Set(인터페이스)
 *          |
 *         --------------구현클래스----------------
 *         |                                   |
 *         HashSet                       TreeSet
 *         
 *         특징) 
 *              순서가 없다 (인덱스가 없다) , 데이터 중복을 허용하지 않는다
 *              장르별, 부서별...
 *              데이터베이스 : DISTINCT
 *              HashSet : 속도가 빠르다
 *              TreeSet : 정렬, 검색속도
 *         ---------------------------------Set에 저장하면 자동으로 중복제거
 *                                          그래서 List에 저장된 데이터를 Set 돌려서
 *                                          중복제거할때 사용하기도함
 *                                          예) 방문기록을 동일한걸 두번누르면 중복으로 출력되지않도록 set으로 출력함
 *         
 *         주요메소드)
 *              데이터저장 : add(Object)
 *              삭제 : remove(Object)
 *              전체 삭제 : clear()
 *              데이터를 모아서 관리 : iterator()
 *              
 *              TreeSet => 오라클에서는 LIKE, REGEXP_LIKE
 *                  : headSet
 *                  : tailSet
 *  
 * 
 */

import java.util.*;

public class MainClass_3 {

	public static void main(String[] args) {
		
		Set<String> set=new HashSet<String>();
		set.add("A");
		set.add("B");
		set.add("C");
		set.add("D");
		set.add("E");
		/////////////////중복된값은 저장안시켜줌
		set.add("A");
		set.add("B");
		set.add("C");
		//이렇게 저장을 해도!!! 중복부분은 출력도 안됨
		
		//출력
		for(String s:set)//index가 없으니까 foreach구문
		{
			System.out.println(s+" "); //중복부분은 출력도 안됨
		}

	}

}
