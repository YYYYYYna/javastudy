package com.sist.lib;
/*
 *      335page : 자바의 컬렉션
 *                --------- 자료구조(데이터 관리)
 *                => 데이터를 모아서 관리하는 클래스의 집합
 *                   --------------
 *                   =CRUD (추가, 수정, 삭제, 읽기)
 *                     => 메모리에서 영구적으로 수정이 안됨
 *                     => 영구적인 저장장치 : 파일, 오라클
 *      
 *      컬렉션:Collection => 인터페이스
 *             |
 *      ----------------------------------------
 *      |                  |                   |
 *      List               Set                 Map => 인터페이스(표준화)
 *      
 *      List : 순서를 가지고 있다 (찾을때 인덱스 번호를 사용:엑셀) ==> 배열(고정적,같은데이터만가능)을 보완한 클래스(가변적) 형식
 *           : 데이터의 중복을 허용
 *           => ***ArrayList
 *           => Vector
 *           => LinkedList
 *           
 *      Set : 순서가 없다
 *          : 데이터의 중복을 허용하지 않는다 (이걸로 데이터 찾을때 사용:벤다이어그램)
 *          => ***HashSet
 *          => TreeSet
 *          
 *      Map : 순서가 없다
 *          : 데이터 중복이 가능 (key,value가 쌍으로 만들어져서 key로 데이터를 찾음:도표)
 *          => ***HashMap
 *          => HashTable
 *      
 *      
 *      335page
 *         Collection => 데이터가 일정 공간을 모아서 관리
 *         ---------- => 웹에서 데이터 목록출력(모아서=>브라우저)
 *           1) 배열이 단점을 보완 (저장의 크기 결정:고정적)
 *                        => 크기결정을 하지 않는다(가변적)
 *           2) 인터페이스를 이용한다
 *                        => 표준화 (모든개발자가 동일한 메소드를 이용)
 *                        => 프레임워크 : Spring/MyBatis/JQuery/VueJS/ReactJS => 코딩하는 방법이 다 동일함
 *                             |=일정 기본틀 => 쉽게 다른 개발자의 코딩을 분석 (유지보수가 쉬움)
 *                     
 *         Collection
 *             |
 *         -------------------------------------
 *         |                 |                 |
 *         List              Set               Map
 *         |                 |                 |
 *         |                 ----------        ------------
 *         |                 |        |        |          |
 *         |                 HashSet  TreeSet  HashMap    HashTable
 *         -----------------------
 *         |           |         |
 *         ArrayList   Vector    LinkedList
 *         
 *         List에서 가장 많이 사용되는 컬렉션
 *           ArrayList : Vector를 보완 => 비동기 => 데이터베이스 연동
 *           Vector : 동기방식 => 네트워크에서 접속자 정보를 저장할때
 *           LinkedList : C언어 개발자 => 호환
 *           -------------------------------------------------------------------------
 *            컬렉션           읽기(접근시간)      추가/삭제                 비고
 *           -------------------------------------------------------------------------
 *            ArrayList      속도가 빠르다        느리다           ⓐ순차적으로 추가/삭제 빠르다
 *                                                           ⓑ비효율적인 메모리 사용
 *                           => 웹에서는 자체에서 추가/삭제를 하지않음 
 *                              오라클을 거쳐서 사용해야하기 때문
 *           -------------------------------------------------------------------------
 *            LinkedList     속도가 느리다        빠르다         데이터가 많을수록 접근성이 떨어진다
 *                           => 윈도우
 *           -------------------------------------------------------------------------
 *         
 *         Set에서 많이 사용되는 컬렉션
 *           HashSet : 중복 데이터를 만들때
 *           TreeSet : 검색 최적화
 *         
 *         Map에서 많이 사용되는 컬렉션
 *           HashTable => 단점을 보완 => HashMap : 웹에서 가장 많이 사용
 *                                            1) 관련된 클래스 관리 => Spring/MyBatis
 *                                            2) 웹소켓 (웹 네트워크) => sessionId
 *                                            
 *        
 *        
 *         List
 *         ----
 *           1. ArrayList (:엑셀형식)
 *             = 장점
 *               배열형식으로 만들어져 있다 => 인덱스를 이용해서 처리 접근 속도가 빠르다
 *             = 단점
 *               중간에 추가/삭제시 속도가 저하됨
 *             = 특징
 *               항상 인덱스 번호는 순차적으로 유지 ===> 반복문 돌리기 좋은 형태
 *               1 2 3 4 5 ===3삭제시===> 1 2 3 4 (길이수정됨) 
 *               1 2 3 4 5 ===3추가시===> 1 2 3 4 5 6 (길이수정됨) 
 *             = 사용
 *               데이터의 양이 일관적이고 추가, 삭제가 없는 경우 주로 사용
 *                 만약 데이터 베이스에서만 사용한다면 새로운 데이터의 관리가 이뤄지지 못함
 *               데이터의 접속 속도를 중시할때 (웹)
 *               
 *           2. LinkedList(:벤다이어그램형식)다 같은 링크를 통해 연결하고있음   
 *          
 *             
 *         주요메소드) : 웹에서 데이터를 어떻게 공유(위치=오라클)할지 초점을 맞춰야함
 *         ***① 추가
 *           add(데이터)
 *           add(int index, 데이터) => 속도가 느려진다
 *         ② 수정
 *           set(int index, 데이터)
 *         ③ 삭제
 *           remove(int index)
 *         ***④ 읽기
 *           get(int index)
 *         ***⑤ 저장 갯수
 *           size()
 *         ⑥ 전체 지우기
 *           clear()
 *          
 */

/*
 *    add() => 데이터 추가
 *    size() => 저장된 갯수
 *    get() => 읽기
 *    remove() => 삭제
 *    set() => 수정
 *    clear() => 전체데이터를 비우는 경우
 */

import java.util.*;

public class MainClass_2 {

	public static void main(String[] args) {
		ArrayList list=new ArrayList(); //추가 혹은 수정이 가능한 Object
		//가급적이면 같은 데이터형을 집어넣는 것이 유리하다
		
		//추가
		list.add("홍길동"); //index 0
		list.add("심청이"); //index 1
		list.add("이순신"); //index 2
		list.add("강감찬"); //index 3
		list.add("춘향이"); //index 4
		
		//출력부
		for(int i=0;i<list.size();i++)//length 아니고 size임!!
		{
			Object name=list.get(i);//데이터 읽기
			System.out.println(i+"."+name);
		}
		/*
		 *    add() => 데이터 추가
		 *    size() => 저장된 갯수
		 *    get() => 읽기
		 *    remove() => 삭제
		 *    set() => 수정
		 *    clear() => 전체데이터를 비우는 경우
		 */
		//추가된 배열 수정
		System.out.println("======데이터 추가=====");
		list.add(2,"을지문덕");
		//출력부	
		for(int i=0;i<list.size();i++)//length 아니고 size임!!
		{
			Object name=list.get(i);//데이터 읽기
			System.out.println(i+"."+name);
		}
		
		//배열 삭제 remove(int index)
		System.out.println("======데이터 삭제=====");
		list.remove(3);
		for(int i=0;i<list.size();i++)//length 아니고 size임!!
		{
			Object name=list.get(i);//데이터 읽기
			System.out.println(i+"."+name);
		}
		
		//set 수정
		System.out.println("======데이터 수정=====");
		list.set(2,"박문수");
		for(int i=0;i<list.size();i++)//length 아니고 size임!!
		{
			Object name=list.get(i);//데이터 읽기
			System.out.println(i+"."+name);
		}
		
		//데이터 갯수 세기
		System.out.println("======데이터 갯수=====");
		System.out.println("현재 인원 : "+list.size());
		
		//데이터 삭제
		System.out.println("======데이터 삭제=====");
		list.clear();
		System.out.println("현재 인원 : "+list.size());

	}

}
