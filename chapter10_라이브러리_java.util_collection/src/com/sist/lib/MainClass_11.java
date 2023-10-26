package com.sist.lib;
import java.util.*;
public class MainClass_11 {

	public static void main(String[] args) {
		int[] arr={10,20,30,50,40,70,60,10,20,40};
		Set<Integer> set=new HashSet<Integer>();
		//Arrays.asList(null) //Array배열을 바꿀수 있는 메소드가 있음
		
		//set은 없음
		//1. 일단 중복만 제거
		for(int a:arr)
		{
			set.add(a);
		}
		System.out.println(set);
		
		//2. ArrayList로 같은 데이터 생성
		List<Integer> list=new ArrayList<Integer>();
		list.addAll(set);
		System.out.println(list);
		
		//3. 정렬시 sort는 list만 받음으로 list로 바꿔줘야함
		System.out.println("===== 정렬(ASC) =====");
		Collections.sort(list);
		System.out.println(list);
		System.out.println("===== 정렬(DESC) =====");
		Collections.reverse(list);
		System.out.println(list);
		
		// ?는 와일드 카드 : 익명의 클래스형=모든데이터형을 받음
		//ArrayList<?> list=new ArrayList<Integer>();
		//근데 꼭 쓰지 않고 Object형으로 넘기는게 낫다
	}

}
