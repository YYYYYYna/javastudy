package com.sist.lib;
/*
 *      컬렉션 프레임 워크
 *        => 군집(다수의 데이터)를 쉽게 관리(CRUD)할 수 있게 만든 라이브러리
 *        
 *           파일/오라클
 *           --------
 *           파일 : read(), write(), delete()
 *           오라클 : select(읽기) , insert(추가), update(수정), delete(삭제)
 *           
 *           1. 읽기 => file은 한줄씩 => 구분자
 *           2. 오라클 => 원하는 데이터만 가지고 올 수 있다.
 *           
 *      동적 메모리 할당 (자동으로 크기가 변경 => 크기를 지정하지 않음)=가변형(메모리누수방지)
 *      자동으로 인덱스 번호 관리 => 빈공백이 없다
 *      
 *      컬렉션의 종류
 *      List : ArrayList
 *          => 순서가 지정(인덱스)
 *          => 중복을 허용한다
 *          => 주요메소드
 *             추가) add(Object)
 *             삭제) remove(int index)
 *             수정) set(int index,Object)
 *             읽기) get(int index)
 *             비워있는지 확인) isEmpty()
 *             전체삭제) clear()
 *             저장된갯수) size()
 *             두개의 List가 있는경우 
 *               교집합) retainAll()
 *               합집합) addAll()
 *               차집합) removeAll()
 *             기타) Arrays.asList : 배열을 ArrayList로 변경
 *               
 *      Set : HashSet
 *          => 순서가 없다
 *          => 중복허용하지 않는다
 *          **null값을 추가할수 있다(한번만)
 *          => 장르별, 부서별, 상품별...에 주로 이용
 *          => List에서 중복 데이터를 제거할때 주로 사용
 *          => 주요메소드
 *             추가) add()
 *             갯수) size()
 *             삭제) remove(Object)
 *             비워있는지확인) isEmpty()
 *             => 일반for문은 사용불가
 *                항상 foreach구문만 사용가능
 *             
 *      Map : HashMap
 *          => 두개를 동시에 저장(key,value)
 *          => 도서, 클래스관리, 데이터전송관리, SQL관리
 *          => 주요메소드
 *             저장) put()
 *             읽기) get()
 *             크기) size()
 *             저장된 키 읽기) keySet
 *             저장된 값 읽기) values
 *             --------------------------------전부 clear() 사용가능
 *             ** 전체를 한곳에 모아서 출력, 관리 => iterator
 *             
 *      -------------------------------------------------------------------------------------
 *          
 *      제네릭 : 이 만들어진 이유는?
 *        프로그램은 데이터 관리가 중요함
 *                -------
 *                데이터 저장방식을 신경써야함
 *                -----------
 *                |=> 데이터형을 통일
 *                |=> 이미만들어진클래스(데이터형)
 *                    -------------------
 *                    |라이브러리 => 지정하는 리턴형/매개변수의 데이터형을 변경
 *                                -----------------------------
 *                                => 프로그램 개발시 마다 형변환 필요
 *                                => 필요시마다 데이터형을 변경
 *                                   ===> 모든점을 보완하여 제네릭 탄생
 *                                                     ---
 *                                                     라이브러리에 있는 데이터형을 프로그램에 맞게 변경
 *      제네릭의 사용법)
 *          클래스<데이터형> => 리턴형과 매개변수가 변경됨
 *          
 *      제네릭의 단점) 기본형 사용불가
 *                 -----------
 *                 이 점을 보완하여 클래스형으로 변경한게 Wrapper
 *                                             ------
 *                                             박싱/언박싱을 통해 호환성을 높임
 *      ------------------------------------------------------------------------------------
 *          
 *                                     
 */

import java.io.*;
import java.util.*;
public class MainClass_Collection정리 {

	public static void main(String[] args) {
		try {
			//private보다 보안성이 더 좋음...인코딩/디코딩 과정인듯
			Properties prop=new Properties();
			prop.load(new FileInputStream("C:\\Users\\sist\\git\\java_study\\"
					+ "chapter10_라이브러리_java.util_collection\\student.properties"));
			String name=prop.getProperty("name");
			System.out.println(name);
			
			Properties props=System.getProperties();
			System.out.println(props.getProperty("java.version"));
			System.out.println(props.getProperty("user.language"));
			//Map => 파일 => .properties
		}catch(Exception ex)
		{
			
		}

	}

}
