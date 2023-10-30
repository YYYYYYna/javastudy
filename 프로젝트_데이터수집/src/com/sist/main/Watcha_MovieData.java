package com.sist.main;
import java.util.*;
import java.io.*;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
//regdate / genre / nation / grade / time / score / make_share / poster / title
public class Watcha_MovieData {

	public static void main(String[] args) {
		//파일저장/생성
		FileWriter fw=null;
		try {
			//파일저장/생성
			fw=new FileWriter("c:\\java_data\\movie_watcha.txt",true);
			
			//전체페이지
			Document doc=Jsoup.connect("https://movie.daum.net/premovie/watcha?flag=C").get();
			Elements link=doc.select("div.box_movie ul.list_movieranking div.item_poster strong.tit_item a");
			
			for(int i=0;i<link.size();i++) 
			{
				String sublink="https://movie.daum.net"+link.get(i).attr("href");
				//System.out.println(sublink);//상세페이지 링크 모음
				
				//상세페이지
				Document doc2=Jsoup.connect(sublink).get();
				
				//상세페이지_제목
				Element title=doc2.selectFirst("div.info_detail h3.tit_movie span");
				System.out.println(title.text());
				
				//상세페이지_etc
				Elements etc=doc2.select("div.detail_cont dl.list_cont dt");
				//System.out.println(etc.text());//상세페이지_etc 데이터 모음
				
				String regdate="개봉일 없음",genre="장르 없음",nation="국가 없음",
						grade="등급 없음",time="상영시간 없음",score="평점 없음",make_share="누적관객수 없음";
				
				for(int j=0;j<etc.size();j++)
				{
					String ss=etc.get(j).text();
					//System.out.println(ss);//상세페이지_etc 데이터 모음
					//개봉 1993.05.15 장르 판타지/로맨스/멜로 국가 프랑스, 서독 등급 12세이상관람가 러닝타임 128분 평점 8.6 누적관객 1,347명
					
					if(ss.equals("개봉"))
					{
						Element regdate1=doc2.select("div.detail_cont dl.list_cont dd").get(j);
						regdate=regdate1.text();
						System.out.println(regdate);
					}
					else if(ss.equals("장르"))
					{
						Element genre1=doc2.select("div.detail_cont dl.list_cont dd").get(j);
						genre=genre1.text();
						System.out.println(genre);
					}
					
					else if(ss.equals("국가"))
					{
						Element nation1=doc2.select("div.detail_cont dl.list_cont dd").get(j);
						nation=nation1.text();
						System.out.println(nation);
					}
					else if(ss.equals("등급"))
					{
						Element grade1=doc2.select("div.detail_cont dl.list_cont dd").get(j);
						grade=grade1.text();
						System.out.println(grade);
					}
					else if(ss.equals("러닝타임"))
					{
						Element time1=doc2.select("div.detail_cont dl.list_cont dd").get(j);
						time=time1.text();
						System.out.println(time);
					}
					else if(ss.equals("평점"))
					{
						Element score1=doc2.select("div.detail_cont dl.list_cont dd").get(j);
						score=score1.text();
						System.out.println(score);
					}
					else if(ss.equals("누적관객"))
					{
						Element make_share1=doc2.select("div.detail_cont dl.list_cont dd").get(j);
						make_share=make_share1.text();
						System.out.println(make_share);
					}
					
					//String regdate="개봉일 없음",genre="장르 없음",nation="국가 없음",
					//		grade="등급 없음",time="상영시간 없음",score="평점 없음",make_share="누적상영수 없음";
					
				}
				String msg=title.text()+"|"+regdate+"|"+genre+"|"+nation+"|"+grade+"|"+time+"|"+score+"|"+make_share+"\r\n";
				fw.write(msg);
			}
			System.out.println("파일 저장 완료!");
		}catch(Exception ex){
			ex.printStackTrace();
		}
		finally
		{
			try {
				fw.close();
			}catch(Exception ex) {}
		}
	}

}
