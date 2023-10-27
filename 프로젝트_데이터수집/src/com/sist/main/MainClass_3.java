package com.sist.main;

import java.io.FileWriter;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class MainClass_3 {

	public static void main(String[] args) {
		try {
			//전체페이지
			Document doc=Jsoup.connect("https://movie.daum.net/ranking/reservation").get();
			Elements link=doc.select("div.section_ranking strong.tit_item a");
			
			for(int i=0;i<link.size();i++) 
			{
				//전체페이지
				//System.out.println(link.get(i).attr("href"));
				String sublink="https://movie.daum.net"+link.get(i).attr("href");
				System.out.println(sublink);
				
				//상세페이지
				Document doc2=Jsoup.connect(sublink).get();
				
				Element title=doc2.selectFirst("h3.tit_movie span.txt_tit");
				System.out.println(title.text());
				Element state=doc2.selectFirst("h3.tit_movie span.txt_state");
				System.out.println(state.text());
				
				
				//여러개:select 한개:selectFirst
				//Elements detail=doc2.select("div.detail_cont dl.list_cont dd");
				/*
				 * 
				 * for(int j=0;j<detail.size();j++)
				{
					temp+=detail.get(j).text()+"|";
					System.out.println(detail.get(j).text());
				}
				 */
				
				Element dd1=doc2.select("h3.tit_movie span.txt_state dd").get(0);
				Element dd2=doc2.select("h3.tit_movie span.txt_state dd").get(1);
				Element dd3=doc2.select("h3.tit_movie span.txt_state dd").get(2);
				Element dd4=doc2.select("h3.tit_movie span.txt_state dd").get(3);
				Element dd5=doc2.select("h3.tit_movie span.txt_state dd").get(4);
				
				String temp="";
				System.out.println(dd1.text());
				System.out.println(dd2.text());
				System.out.println(dd3.text());
				System.out.println(dd4.text());
				System.out.println(dd5.text());
				
				
				//포스터부분
				Element poster=doc2.selectFirst("div.info_poster span.bg_img");
				String image="";
				try {
					image=poster.attr("style");
				}catch(Exception ex)
				{
					image="이미지없음";
				}
			/*
				String image=poster.attr("style");
				image=image.substring(image.indexOf("(")+1,image.lastIndexOf(")"));//주소값에서 (뒤부터 )앞까지 값을 가져옴
				System.out.println(image);*/
				
				String msg=(i+1)+"|"
						+title.text()+"|"
						+state.text()+"|"
						//+image.text()+"|"
						+dd1.text()+"|"
						+dd2.text()+"|"
						+dd3.text()+"|"
						+dd4.text()+"|"
						+dd5.text()+"\r\n";
				
				//msg=msg.substring(0,msg.lastIndexOf("|"));
				//msg+="\r\n";
				
				FileWriter fw=new FileWriter("c:\\java_data\\movie.txt",true);
				fw.write(msg);
				fw.close();
				
			}
		}catch(Exception ex)
		{
			
		}
		

	}

}
