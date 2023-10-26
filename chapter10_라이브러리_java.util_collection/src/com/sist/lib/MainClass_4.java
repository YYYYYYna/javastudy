package com.sist.lib;
import java.util.*;
//코딩테스트에서 가장 많이 나오는 부분 : 데이터에서 중복없이 출력하기 ==> set을 이용하면 쉽게 해결가능
public class MainClass_4 {
	public static void main(String[] args) {
		
		String[] names= {"홍길동", "심청이", "박문수", "이순신", "강감찬", "춘향이", "이산", "홍길동", "심청이", "박문수"};
		
		//String 데이터 List(컬렉션)로 변환 : Arrays.asList(배열이름)
		List<String> list=Arrays.asList(names);
		
		//출력
		for(String name:list)
		{
			System.out.print(name+" ");
		}
		
		//List를 set으로 바꿔서 중복 제거
		Set<String> set=new HashSet();
		set.addAll(list); //list값을 모두 저장할때 : addAll
		
		System.out.println("\n==========set으로중복제거==========");
		for(String name:set)
		{
			System.out.print(name+" ");
		}
		
		//set을 새로운 List 생성후 중복없앤 데이터 List에 다시저장
		System.out.println("\n=========List로데이터다시저장=========");
		List<String> list2=new ArrayList<String>();
		list2.addAll(set); 
		for(String name:list2)
		{
			System.out.print(name+" ");
		}
	}

}
