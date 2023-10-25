package com.sist.lib;
import java.util.*;
/*
 *    332page
 *    
 *    날짜 관련(시간 포함)
 *    Date
 *    Calendar
 *      
 */
class A
{
	static A a;
	public static A newInstance() {
		if(a==null)
			a=new A();
		return a;
	}
}

public class MainClass_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		//class A가 static이기 전에는 메모리 주소가 다 다름
		A aa=new A();
		System.out.println(aa);
		A bb=new A();
		System.out.println(bb);
		*/
		
		//이렇게 하면 메모리 주소가 다 같아짐 : 싱글턴
		A aa=A.newInstance();
		A bb=A.newInstance();
		A cc=A.newInstance();
		
		System.out.println(aa);
		System.out.println(bb);
		System.out.println(cc);
		
		Scanner scan=new Scanner(System.in);
		System.out.print("년 월 일 입력(2023 10 24) : ");
		int year=scan.nextInt();
		int month=scan.nextInt();
		int day=scan.nextInt();
		
		Calendar cal=Calendar.getInstance();
		//날짜지정
		cal.set(Calendar.YEAR, year);
		cal.set(Calendar.MONTH, month-1);
		cal.set(Calendar.DATE, day);
		String[] strWeek={"","일","월","화","수","목","금","토"};
		int week=cal.get(Calendar.DAY_OF_WEEK);
		System.out.println(year+"년도 "+month+"월 "+day+"일은 "+strWeek[week]+"요일입니다.");

	}

}
