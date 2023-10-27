package com.sist.main;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

public class MainClass_2 {

	public static void main(String[] args) {
		try {
			Document doc=Jsoup.connect("https://movie.daum.net/ranking/reservation").get();
			
			//제목
			Elements title=doc.select("div.section_ranking strong.tit_item a.link_txt");
			//포스터
			Elements poster=doc.select("div.section_ranking div.poster_movie img");
			//등급
			Elements grade=doc.select("div.section_ranking span.txt_tag span.ico_see");
			//평점
			Elements avg=doc.select("span.txt_grade");
			//예매율
			Elements rev=doc.select("div.section_ranking span.txt_append span.txt_num");
			//상세정보
			Elements info=doc.select("div.section_ranking a.link_story");
			
			for(int i=0;i<title.size();i++)
			{
				System.out.println(title.get(i).text()+"|"+poster.get(i).attr("src")
						+"|"+grade.get(i).text()+"|"+avg.get(i).text()+"|"+rev.get(i).text()
						+"|"+info.get(i).attr("href"));
				/*
				* System.out.println(title.get(i).text());
				* System.out.println(poster.get(i).attr("src"));
				* System.out.println(grade.get(i).text());
				* System.out.println(avg.get(i).text());
				* System.out.println(rev.get(i).text());
				* System.out.println(info.get(i).attr("href"));
				* 
				*/
			}
		}catch(Exception ex)
		{
			
		}
		

	}

}
