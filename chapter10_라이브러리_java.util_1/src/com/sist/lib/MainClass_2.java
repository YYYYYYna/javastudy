package com.sist.lib;
/*
 *       9장~12장 라이브러리
 *       라이브러리 : 클래스명 (사용도)
 *                 => 기능(메소드)만 외우면됨!!! ヾ(^▽^*))
 *                    -------- 리턴형 / 매개변수
 *                    -------- 신뢰성이 뛰어나다 => 에러가 없다
 *                    -------- 표준화(이미만들어져있음으로모두가동일하게사용함)
 *                    -------- 자바는 80%가 라이브러리임 나머지 20%가 객체지향프로그램
 *                    
 *       라이브러리의 공부하는 법 : 사용위치를 기준으로 어떤 메소드가 필요한지 외우는것!
 *       
 *       java.lang : Object, String, StringBuffer, Wrapper, Math, System
 *       java.util : Random(예약일,예약시간), date/Calendar, StringTodenizer, List/Set/Map
 *       java.text : SimpleDateFormet(날짜변경), DecimalFormat(숫자변경:가격에서,찍는역할), MessageFormat, ChoiceFormat
 *       java.io
 *       java.net
 *       java.sql
 *       ------------
 *       javax.xml
 *       javax.http.servlet
 *       ------------
 *       org(자바기본패키지가아님:각기업에서만들어줌)
 *       org.springframework
 *       org.mybatis
 *       org.jpa...
 *       ------------
 *       com.업체명..
 */

import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.*;

public class MainClass_2 {

	public static void main(String[] args) {
		
		//SimpleDateFormet 예제
		Date date=new Date();
		SimpleDateFormat sdf= new SimpleDateFormat("yyyy-MM-dd");
		System.out.println(sdf.format(date));
		
		//DecimalFormat 예제
		int won=321654987;
		DecimalFormat df=new DecimalFormat("#,###,###");
		System.out.println(df.format(won));
		
		//MessageFormat 예제
		String name="홍길동";
		String sex="남자";
		int age=20;
		String addr="서울";
		String tel="010-1111-1111";
		//오라클전송 방법1 : 오류날 가능성 높음
		String sql="INSERT INTO member VALUES('"+name+"','"+sex+"','"+age+"','"+addr+"','"+tel+")";
		System.out.println(sql);
		//오라클전송 방법2 : 이게 훨씬 간편함
		//INSERT INTO member VALUES(?,?,?,?)
	}

}
