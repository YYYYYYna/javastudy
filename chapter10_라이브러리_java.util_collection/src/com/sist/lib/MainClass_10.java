package com.sist.lib;
//출력이 어려운 경우
//데이터를 모아서 한번에 처리 => Iterator
import java.util.*;
public class MainClass_10 {
	public static void main(String[] args) {
		List<String> list=new ArrayList<String>();
		list.add("홍길동");
		list.add("심청이");
		list.add("박문수");
		list.add("이순신");
		list.add("강감찬");
		
		System.out.println("======== 일반출력방식(웹) ========");
		for(String name:list)
		{
			System.out.print(name+" ");
		}
		
		//Iterator 실습 : 데이터한곳에모아서출력
		System.out.println("\n========== Iterator ==========");
		Iterator<String> it=list.iterator();
		//iterator는 갯수를 명확하게 모를때(=실시간) 사용함으로 while문만 사용가능
		while(it.hasNext())
		{
			System.out.print(it.next());
		}
		
		//List에서만 사용하는 
		System.out.println("\n===== ListIterator : 순차출력 =====");
		ListIterator<String> it1=list.listIterator();
		while(it1.hasNext())
		{
			System.out.print(it1.next());
		}
		
		System.out.println("\n===== ListIterator : 역출력 =====");
		while(it1.hasPrevious())
		{
			System.out.print(it1.previous());
		}
	}

}
