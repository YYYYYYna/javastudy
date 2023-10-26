package com.sist.lib;
//멜론의 곡명과 지니뮤직의 곡명을 비교해서 중복이 아닌곡만 추출하기
//공통 / 차집합 / 교집합 / 합집합
import java.util.*;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;
public class MainClass_6 {
	public static Set<String> genieMusic()
	{
		Set<String> set=new HashSet<String>();
		try {
			Document doc=Jsoup.connect("https://www.genie.co.kr/chart/top200").get();
			Elements title=doc.select("table.list-wrap a.title");
			for(int i=0;i<title.size();i++)
			{
				set.add(title.get(i).text());
			}
		}
		catch(Exception ex)
		{
			System.out.println(ex.getMessage());
		}
		return set;
	}
	public static Set<String> melonMusic()
	{
		Set<String> set=new HashSet<String>();
		try {
			Document doc=Jsoup.connect("https://www.melon.com/chart/index.htm").get();
			Elements title=doc.select("div.wrap_song_info div.rank01 a");
			for(int i=0;i<title.size();i++)
			{
				set.add(title.get(i).text());
			}
		
		}
		
		catch(Exception ex)
		{
			System.out.println(ex.getMessage());
		}
		return set;
	}
	public static void main(String[] args) {
		
		System.out.println("========Genie========");
		Set<String> genie=genieMusic();
		System.out.println("genie 노래 수 : "+genie.size());
		/*
		for(String title:genie)
		{
			System.out.println(title);
		}
		*/
		
		System.out.println("========Melon========");
		Set<String> melon=melonMusic();
		System.out.println("melon 노래 수 : "+melon.size());
		/*
		for(String title:melon)
		{
			System.out.println(title);
		}
		*/
		
		// [차집합] : A.removeAll(B) => A속 B를 제거한 결과값 도출
		//[1,2,3,4,5] - [1,2,3,6,7] = [4,5]
		System.out.println("=====지니뮤직에만 있는 노래=====");//지니뮤직-멜론뮤직
		genie.removeAll(melon);
		for(String title:genie)
		{
			System.out.println(title);
		}
		
		genie=genieMusic();//우선 비교하려고 값 다시 생성하고(그럼 다시 String인가?)
		
		// [교집합] : A.retainAll(B) => A와 B의 공통값 도출
		System.out.println("=====지니뮤직과 멜론에 공통 노래=====");
		genie.retainAll(melon);
		System.out.println("공통 노래 수 : "+genie.size());
		/*
		for(String title:genie)
		{
			System.out.println(title);
		}
		*/
		
		// [합집합] 중복O
		System.out.println("=====지니뮤직+멜론(중복O)=====");
		List<String> list=new ArrayList<String>();
		list.addAll(genie); //데이터값 전체추가 : addAll
		list.addAll(melon);
		System.out.println("곡 갯수 : "+list.size());
		/*
		for(String title:list)
		{
			System.out.println(title);
			//현재까지는 중복데이터가 존재함 : 아직까지는 중복데이터 거르지 않음
			//만약 set으로 모으면 중복데이터를 다 삭제할거임
		}
		*/
		//장바구니라면 동일상품 관계없이 처리해야할 경우가 있음으로 굳이 중복을 걸러내지 않음
		
		// [합집합] 중복X
		System.out.println("=====지니뮤직+멜론(중복X)=====");
		Set<String> hap=new HashSet<String>();
		hap.addAll(genie);
		hap.addAll(melon);	
		System.out.println("곡 갯수 : "+hap.size());
		/*
		for(String title:hap)
		{
			System.out.println(title);
			//set을 이용해서 중복데이터가 이제 없음
		}
		*/
	}

}
