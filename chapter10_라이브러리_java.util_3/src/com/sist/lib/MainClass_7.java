package com.sist.lib;
/*
 *       List => add, remove, set, size, get, isEmpty
 *       => List가 여러개 있는 경우(JOIN)
 *          (외워야할 메소드의 종류)
 *          containsAll : 두개 이상 list가 있는경우 중복된 데이터 모아서 관리
 *          retainAll : 두개 이상 list가 있는경우 중복된 데이터만 남기기
 *          ----------------------------------------------------장바구니=>중복구매
 *          ***addAll : 데이터 전체 복사
 *          subList : 부분적 데이터 복사 
 */

import java.util.*;

public class MainClass_7 {

	public static void main(String[] args) {
		
		ArrayList<Integer> list=new ArrayList<Integer>();
		
		Random r=new Random();
		
		for(int i=0;i<10;i++)
		{
			list.add(r.nextInt(100)+1);
		}
		for(int i:list)
		{
			System.out.print(i+" ");
		}
		
		
		
		//부분적으로 데이터 추출 : subList
		System.out.println("\n==========subList=========");
		
		ArrayList<Integer> list2=new ArrayList<Integer>(list.subList(1, 4));//(n,m) => n~m-1까지
		for(int i:list2)
		{
			System.out.print(i+" ");
		}

		
		
		
		//리스트 정렬 : Collections.sort()
		System.out.println("\n==========리스트정렬=========");
		Collections.sort(list);
		for(int i:list)
		{
			System.out.print(i+" ");
		}
		
		
		
		/*
		//같은데이터 추출
		System.out.println("\n=========같은데이터 추출========");

		ArrayList<Integer> list3=new ArrayList<Integer>(list.subList(1, 4));//(n,m) => n~m-1까지
		list3.add(r.nextInt(100)+1);
		list3.add(r.nextInt(100)+1);
		list3.add(r.nextInt(100)+1);
		list3.add(r.nextInt(100)+1);
		list3.add(r.nextInt(100)+1);
		list3.add(r.nextInt(100)+1);
		list3.add(r.nextInt(100)+1);
		for(int i:list3)
		{
			System.out.print(i+" ");
		}
		System.out.println(list.retainAll(list3));
		list3.add(r.nextInt(100)+1);
		for(int i:list3)
		{
			System.out.print(i+" ");
		}
		*/
		
		
		/*
		//전체복사
		System.out.println("\n========전체복사========");
		ArrayList<Integer> list3=new ArrayList<Integer>();
		list3.addAll(list);
		for(int i:list3)
		{
			System.out.print(i+" ");
		}
		*/
		
		
		
		
	}

}
