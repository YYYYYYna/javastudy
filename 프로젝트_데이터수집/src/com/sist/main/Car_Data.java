package com.sist.main;
//https://car.sarangbang.com/conts/linead/

import java.util.*;
import java.io.*;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

//[국산차-전체-최근등록순]
public class Car_Data {
	
	public static void main(String[] args) {
		//파일저장,생성
		FileWriter fw=null;
		try {
			//파일저장,생성
			fw=new FileWriter("c:\\java_data\\used_car_data.txt",true);
			
			//전체 페이지 목차(1~10)
			for(int i=1;i<11;i++)
			{
				//전체페이지(1) : link
				Document doc=Jsoup.connect("https://car.sarangbang.com/conts/linead/?p="+i).get();
				Elements link=doc.select("div.linead_box div.col-3 div.thumb a");//상세페이지링크
				
				for(int j=0;j<link.size();j++) 
				{	
					//상세페이지 : sublink
					String sublink="https://car.sarangbang.com"+i+link.get(j).attr("href");
					//System.out.println(sublink);//상세페이지링크

					//상세페이지 연결
					Document docSub=Jsoup.connect(sublink).get();
					
					// 차종:name(String) |  할부구입시:monthPrice(월 00000원)  
					// 연식:modelYear(2013/10) | 주행거리:distance(303,771 KM) | 차량가격:totalPrice(0000만원)
					// 색상:color(String) | 연료:fuel(String) | 변속기:transmission(String)
					// 차량번호:carNumber(String) | 사고유무:accident(String) | 제시번호:enrollNumber(String)
					// 압류:seizure/저당:mortgage(String) | 세금미납:taxArrears(String) | 연락처:callNumber(String)
					
					//전체페이지_차종:name(String)
					Element name=docSub.selectFirst("div.detail_head h2");
					System.out.println(name.text());
					
					/*
					//전체페이지_할부구입시:monthPrice(월 00000원) 
					Element monthPrice=doc.selectFirst("div.listcar li.carso div.text ul.homecarinfo li.money dd");
					System.out.println(monthPrice.text());
					
					
					//전체페이지_연식:modelYear(2013/10)
					Element modelYear=doc.selectFirst("div.listcar li.carso div.text ul.homecarinfo li");
					System.out.println(modelYear.text());
					
					//전체페이지_주행거리:distance(303,771 KM)
					Element distance=doc.selectFirst("div.listcar li.carso div.text ul.homecarinfo li");
					System.out.println(distance.text());
					
					//전체페이지_차량가격:totalPrice(0000만원)
					Element totalPrice=doc.selectFirst("div.listcar li.carso div.text ul.homecarinfo li");
					System.out.println(totalPrice.text());
					*/
					
					
				}
				
			}
		}catch(Exception ex)
		{
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
