/*
 *  기존의 달력만들기 메소드를
 *  전역변수를 사용해서 리턴형/매개변수 상관안쓰고
 *  더 쉽게 만드는 방법...
 */

import java.util.*;

public class MainClass_2 {
	
	//1. 전역변수 생성 : 클래스 안에 있는 모든 메소드에서 사용가능 
	static int[] lastday={
		31,28,31,30,31,30,
		31,31,30,31,30,31
	};
	static String[] strWeek= {"일","월","화","수","목","금","토"};
	static int year,month,week;
	//이로써 메소드 리턴형을 만들 필요가 없음...
	
	//2. 년도와 월 입력
	static void userInput()
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("년도 입력 : ");
		year=scan.nextInt();
		
		System.out.println("월 입력 : ");
		month=scan.nextInt();
	}
	
	//3. 요일구하기
	static void dayTotal()
	{
		int total=(year-1)*365
				 +(year-1)/4 //윤년조건
				 -(year-1)/100//윤년조건
				 +(year-1)/400;//윤년조건
		
		if((year%4==0 && year%100!=0)||(year%400==0))//윤년확인공식꼭외우기
		{
			lastday[1]=29;
		}
		else
		{
			lastday[1]=28;
		}
		//드디어 전달까지의 합
		for(int i=0;i<month-1;i++)
		{
			total+=lastday[i];
		}
		total++; //1일자의합

		week=total%7; //전역변수로 저장됨
	}
	
	//4. 출력하기
	static void print()
	{
		System.out.println(year+"년도 "+month+"월 ");
		System.out.println();
		for(int i=0;i<strWeek.length;i++)
		{
			System.out.print(strWeek[i]+"\t");
		}
		System.out.println();

		for(int i=1;i<=lastday[month-1];i++)
		{
			if(i==1)//1일이 일요일이 아닐경우 앞에 공백을 줘야함
			{
				for(int k=0;k<week;k++)
				{
					System.out.print("\t");
				}
			}
			System.out.printf("%2d\t",i);
			week++;
			if(week>6)
			{
				week=0;
				System.out.println();
			}
		}
	}
	public static void main(String[] args) {
		userInput();
		dayTotal();
		print();
	}

}
