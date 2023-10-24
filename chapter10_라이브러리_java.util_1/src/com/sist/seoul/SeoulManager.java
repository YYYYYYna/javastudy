package com.sist.seoul;

//1|양화진외국인선교사묘원|양화진외국인선교사묘원은 서울 마포구 합정동에 위치한 외국인 선교사들의 공동묘지이다.|04084 서울 마포구 양화진길 46 (합정동, 양화진홍보관)
//1|도봉산|하늘을 깎아세운 만길 봉우리도봉(道峰)산은 이름 그대로 봉우리가 길인 산|132-010 서울특별시 도봉구 도봉동 경기 의정부시, 양주시 장흥면 일대

import java.io.*;
import java.util.*;

public class SeoulManager {
	
    public Seoul[] seoulAllData(int i)
    {
    	Seoul[] seoul=null;
    	String path="c:\\javaDev\\";
    	if(i==1) {
    		path+="seoul_location.txt";
    	}
    	else{
    		path+="seoul_nature.txt";
    	}
    
    
    FileReader fr=null;
    try {
    	fr=new FileReader(path);
    	String data="";
    	int j=0;
    	while((j=fr.read())!=-1) 
    	{
    		//read() => 한글자 읽기 => 정수로 읽는다
    		data+=(char)j;
    	}
    	
    	StringTokenizer st=new StringTokenizer(data,"\n");//행 갯수로 자름
    	seoul=new Seoul[st.countTokens()];//행 갯수만큼 배열생성(1번:273, 2번:110)
    	
    	//데이터 분리 => 분리 후 데이터를 Seoul[]에 첨부
    	i=0;
    	String[] seouls=data.split("\n");
    	for(String s:seouls)
    	{
    		st=new StringTokenizer(s,"\\|"); //이부분 다르게함
    		seoul[i]=new Seoul();
    		seoul[i].setNo(Integer.parseInt(st.nextToken()));
    		seoul[i].setName(st.nextToken());
    		seoul[i].setContent(st.nextToken());
    		seoul[i].setAddr(st.nextToken());
    		i++;
    	}
    }
    catch(Exception ex){
    	ex.printStackTrace();
    }
    finally
    {
    	
    }
	return seoul;
    
    }

}
