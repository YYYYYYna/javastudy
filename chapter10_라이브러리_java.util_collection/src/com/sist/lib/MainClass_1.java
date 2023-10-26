package com.sist.lib;
/*
 *         ArrayList : 비동기 방식 => 접근속도가 빠르다 => 데이터베이스에서 데이터 읽기
 *                                 -----------    -------- 웹핵심
 *                   => 단점 : 추가, 삭제 속도가 늦다
 *                            -------오라클의주요기능
 *                   => 읽기/데이터 모아서 전송 ==> 마이바티스:리턴형List
 *                   => Vector의 단점 보완
 *         Vector : 동기방식 => 네트워크(접속자 정보 저장)
 *         LinkedList : 접근 속도가 늦다, 추가/삭제가 빠르다
 *         ----------자체처리(Application)
 *         
 *         -----------------
 *         List라는 인터페이스 이용하기에 모든 메소드가 동일하다
 *         java.util => 사용시에는 반드시 import를 사용한다.
 *            
 */

import java.util.*;

public class MainClass_1 {

	public static void main(String[] args) {
		//배열 => 사용하지 않는 공간이 있는경우 메모리 누수현상
		
		//가변컬렉션 => 메모리 크기를 지정하지 않는다 (저장된 데이터만큼만 메모리 할당)
		ArrayList<String> list=new ArrayList<String>();
		//추가할때 쓰는 메소드 : add(Object) 지금은 <String>이라서 add(String)임
		list.add("사과"); //index=0
		list.add("배"); //index=1
		list.add("수박"); //index=2
		list.add("바나나"); //index=3
		list.add("메론"); //index=4 만약에 데이터 삭제되면 앞으로 인덱스번호 밀림
		                //따라서 추가시에는 중간보다는 마지막에 추가하는걸로, 가급적 삭제는 하지 않는다
		
		//저장된값 읽어서 => 출력하기 => size(), get(가져올index)
		for(int i=0;i<list.size();i++) 
		{
			String f=list.get(i);
			System.out.println(i+" "+f);
		}
		
		//삭제 => remove(삭제할index) => 데이터 중복 허용한다
		System.out.println("====remove====");
		list.remove(1);
		for(int i=0;i<list.size();i++) 
		{
			String f=list.get(i);
			System.out.println(i+" "+f);
		}
		
		//수정 => set(바꿀index,바꿀데이터)
		System.out.println("====set====");
		list.set(2,null);
		for(int i=0;i<list.size();i++) 
		{
			String f=list.get(i);
			System.out.println(i+" "+f);
		}
		
		//저장갯수확인 => size()
		System.out.println("====size====");
		System.out.println("과일갯수 : "+list.size());
		
		//데이터비우기 => clear()
		System.out.println("====clear====");
		list.clear();
		System.out.println("전체삭제후과일갯수 : "+list.size());
		
		//저장여부확인 => isEmpty() : true면 비워져있다, false는 채워져있다
		System.out.println("====isEmpty====");
		if(list.isEmpty())
		{
			System.out.println("장바구니가 비워져 있습니다.");
		}
		else
		{
			System.out.println("장바구니가 채워져 있습니다.");
		}
		

	}

}
