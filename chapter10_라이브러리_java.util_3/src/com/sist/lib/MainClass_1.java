package com.sist.lib;
/*
 *     자바에서 많이 사용하는 패키지
 *     => java.lang(9) / java.util(10) / java.io(11) / java.sql(12)
 *     
 *     Spring/React를 해야 연봉이 300정도 올라감...
 *     
 *     java.lang : Object, String, Math, Wrapper
 *     java.util : Date, StringTokenizer, ***List(ArrayList), ***Map(HashMap)
 *     
 *     오늘 배울거는 Calendar 클래스~~
 *     기본 달력과 예약시스템 실습
 */

import java.util.*;

public class MainClass_1 {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		                       //=표준입출력(입력시:System.in 혹은 출력시:System.out)
	    System.out.print("년 월 일 입력(2023 10 25) : ");
	    int year=scan.nextInt();
	    int month=scan.nextInt();
	    int day=scan.nextInt();
	    
	    //요일,입력날의 마지막 날짜를 구할수 있음 => Calendar에 설정해줘야함
	    //설정시 사용 = set
	    //값을 얻을때 사용 = get
	    //1. 연도 설정시 앞에 set(Calendar.YEAR,year)
	    //2. 월 설정시 set(Calendar.MONTH,month-1) : 0번부터 시작해서 -1하는거임
	    //3. 일 설정시 set(Calendar.DATE,1) : 달력을 만들때 1일자부터 알아야 하기 때문에
	    
	    //Calendar는 추상클래스(=미완성:메소드구현이안됨)라서 new를 이용해서 메모리할당 불가능
	    //new를 사용하지 않고 메모리를 할당한다면?(추상클래스 혹은 인터페이스)
	    
	    
	    //Calendar 객체 생성
	    Calendar cal=Calendar.getInstance(); //new생성 불가능!
	    
	    //요청한 달의 날짜설정
	    cal.set(Calendar.YEAR,year);
	    cal.set(Calendar.MONTH,month-1);
	    cal.set(Calendar.DATE,1);
	    
	    //요일구하기
	    int week=cal.get(Calendar.DAY_OF_WEEK)-1;//DAY_OF_WEEK:요일을 가져온다는뜻
	                                         //-1을 하는 이유는 인덱스값을 쉽게 사용하기 위해 0(일)~6(토)로 변경해서 사용하도록
	    
	    //해당달의 마지막일을 가져오기
	    int lastday=cal.getActualMaximum(Calendar.DATE);
	    
	    //달,요일 출력하기
	    String[] strWeek={"일","월","화","수","목","금","토"};//1~7로 시작했으면 앞을 공백" "으로 줘야함 0~6이라 "일"로시작가능
	    System.out.println(year+"년도 "+month+"월 ");
	    
	    for(String w:strWeek)
	    {
	    	System.out.print(w+"\t");
	    }
	    System.out.print("\n");//다음줄 이동
	    
	    //날짜 출력하기
	    for(int i=1;i<=lastday;i++)
	    {
	    	if(i==1)//1일앞에 공백출력
	    	{
	    		for(int j=0;j<week;j++)
	    		{
	    			System.out.print("\t");//ln빼줘야함
	    		}
	    	}
	    	System.out.printf("%2d\t",i);
	    	week++; //0(일)~6(월)
	    	if(week>6)
	    	{
	    		week=0;
	    		System.out.println();
	    	}
	    }
	}

}
