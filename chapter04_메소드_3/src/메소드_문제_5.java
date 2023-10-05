// 년 월 일을 입력받아서 요일을 출력

import java.util.Scanner;

public class 메소드_문제_5 {
	static int userInput(String str)
	{
		Scanner scan=new Scanner(System.in);
		System.out.print(str+"를/을 입력헤주세요 : ");
		int num=scan.nextInt();
		return num;
	}
	static String cal(int year,int month,int day)
	{
		//전년도까지의총날수
		int total=(year-1)*365
				+(year-1)/4
				-(year-1)/100
				+(year-1)/400;
		//전일까지의총날수
		int[] lastday= {31,28,31,30,31,30,
				31,31,30,31,30,31};
		if((year%4==0 && year%100!=0) || year%400==0)
		{
			lastday[1]=29;
		}
		else
		{
			lastday[1]=28;
		}
		for(int i=0;i<month-1;i++)
		{
			total+=lastday[i];
		}
		//------------+ +day 입력날짜더하기
		total+=day;
		//요일 총날수%7=>요일 출력이 가능
		int week=total%7;
				
		String[] strWeek= {"일","월","화","수","목","금","토"};
		return strWeek[week];
		
	}
	static void print(int year,int month,int day,String week)
	{	
		System.out.println(year+"년도 "+month+"월 "+day+"일은 "+week+"요일입니다.");
	}
	
	static void process()
	{
		//반복~~기법
		int year=userInput("년도");
		int month=userInput("월");
		int day=userInput("일");
		
		String week=cal(year,month,day);
		print(year,month,day,week);
	}

	public static void main(String[] args) {
		/*
		//입력
		//요일구하기
		//전년도까지의총날수
		int total=(year-1)*365
				+(year-1)/4
				-(year-1)/100
				+(year-1)/400;
		//전일까지의총날수
		int[] lastday= {31,28,31,30,31,30,
				31,31,30,31,30,31};
		if((year%4==0 && year%100!=0) || year%400==0)
		{
			lastday[1]=29;
		}
		else
		{
			lastday[1]=28;
		}
		for(int i=0;i<month-1;i++)
		{
			total+=lastday[i];
		}
		//------------+ +day 입력날짜더하기
		total+=day;
		//요일 총날수%7=>요일 출력이 가능
		int week=total%7;
		
		String[] strWeek= {"일","월","화","수","목","금","토"};
		System.out.println(year+"년도 "+month+"월 "+day+"일은 "+strWeek[week]+"요일입니다.");
		*/
		process();

	}

}
