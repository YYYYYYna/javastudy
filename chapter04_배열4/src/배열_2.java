
// 이전 배열_1의 내용을 라이브러리로 보다 간단하게 구현하기
// 그러나 항상 공부하기 전에 라이브러리를 구성하는 구성을 확인하고 숙지가 되면 라이브러리를 사용하는 버릇 들이기
 
import java.util.*;
public class 배열_2 {

	public static void main(String[] args) {
		int year,month;
		Scanner scan=new Scanner(System.in);
		System.out.println("년도를 입력 : ");
		year=scan.nextInt();
		System.out.println("월을 입력 : ");
		month=scan.nextInt();
		
		//라이브러리 이용 (API)
		Calendar cal=Calendar.getInstance();
		//클래스 저장 => 싱글턴
		//셋팅 => year,month,day => 세팅을 안할경우 오늘날짜기준으로 계산됨
		cal.set(Calendar.YEAR, year);
		cal.set(Calendar.MONTH, month-1);
		cal.set(Calendar.DATE, 1);
		
		char[] strWeek= {'일','월','화','수','목','금','토'};
		int week=cal.get(Calendar.DAY_OF_WEEK);
		//week가 1번부터 시작함
		week=week-1; //week를 0번부터 시작하도록함
		
		int lastday=cal.getActualMaximum(Calendar.DATE);//마지막날짜 가져오는것
		
		//System.out.println(year+"년도 "+month+"월 1일자는 "+strWeek[week]+"요일입니다.");//잘 돌아가는지 확인작업
		
		System.out.println(year+"년도 "+month+"월 ");
		System.out.println();
		for(int i=0;i<strWeek.length;i++)
		{
			System.out.print(strWeek[i]+"\t");
		}
		System.out.println();

		for(int i=1;i<=lastday;i++)
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
}
