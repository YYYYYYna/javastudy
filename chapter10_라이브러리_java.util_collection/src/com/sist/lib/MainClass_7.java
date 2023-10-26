package com.sist.lib;
//검색 기능 : TreeSet
import java.util.*;
public class MainClass_7 {

	public static void main(String[] args) {
		Set<Integer> set=new HashSet<Integer>();
		Random r=new Random();
		for(int i=0;i<10;i++)
		{
			int k=r.nextInt(100)+1;
			set.add(k);
		}
		System.out.println(set);
		System.out.println();
		
		//50보다 작은수
		for(int i:set)
		{
			if(i<50)
			{
				System.out.print(i+" ");
			}
		}
		System.out.println("\n");
		
		//50보다 큰수
		for(int i:set)
		{
			if(i>50)
			{
				System.out.print(i+" ");
			}
		}
		System.out.println("\n");
		
		TreeSet<Integer> tSet=new TreeSet<Integer>();
		tSet.addAll(set);
		System.out.println("============== tSet ==============");
		System.out.println(tSet);
		System.out.println("=>자동으로 정렬시켜줌");
		System.out.println();
		System.out.println("50보다 작은 수 : "+tSet.headSet(50));
		System.out.println("50보다 큰 수 : "+tSet.tailSet(50));
		System.out.println("=>특정이상/이하값을 가져올때는 for문돌리는것보다 tSet사용하는게 더 좋음");
		//정렬도 시켜주고 검색속도도 더 빠름

	}

}
