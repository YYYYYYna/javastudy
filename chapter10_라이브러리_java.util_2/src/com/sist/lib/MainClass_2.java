package com.sist.lib;
import java.text.*;
import java.util.*;

/*
 *    Format 형식
 *    
 *    날짜변환 실습
 */
public class MainClass_2 {

	public static void main(String[] args) {
		
		//형식3 : 현재의 시간을 읽어온다 (Date)
		Date date=new Date();
		System.out.println(date); //오늘날짜출력해줌
		//==> 데이터 베이스 호환(오라클)
		
		SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd-hh-mm-ss");//형식을 생성자에서 만들어야함
		/*
		 *  형식 기준
		 *  년도: y(소문자)
		 *  월 : M(대문자) M 1~12 /  MM 01~12
		 *  일 : d(소문자) 
		 *  시간 : h(소문자)
		 *  분 : m(소문자)
		 *  초 : s(소문자)
		 */
		System.out.println(sdf.format(date));
		

	}

}
