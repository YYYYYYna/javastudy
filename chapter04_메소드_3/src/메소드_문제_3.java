// 국,영,수 점수 입력 => 총점,평균
import java.util.*;
public class 메소드_문제_3 {
	                //main에서 매개변수값을받을수도있음
	static int score(String msg)
	{
		Scanner scan=new Scanner(System.in);
		System.out.print(msg+" 점수 입력 : ");
		int num=scan.nextInt();
		return num;
	}
	                 //매개변수를 꼭 직전메소드에서 받을필요는없음
	static int total(int kor,int eng,int math)
	{
		return kor+eng+math;
	
	}
	static double avg(int total)
	{
		return total/3.0;
	}
	static char score(int avg)
	{
		char c='A';
		switch(avg)
		{
		case 10:
		case 9:
			c='A';
			break;
		case 8:
			c='B';
			break;
		case 7:
			c='C';
			break;
		case 6:
			c='D';
			break;
		default:
			c='F';
			break;
		}
		return c;
	}
	static void print(int kor,int eng,int math,int total,double avg,char c)
	{
		System.out.printf("%-5d%-5d%-5d%-7d%-7.2f\n%-3c",kor,eng,math,total,avg,c);
	}
	static void process()
	{
		int kor=score("국어");
		int eng=score("영어");
		int math=score("수학");
		int total=kor+eng+math;
		double avg=total/3.0;
		char c=score((int)(avg/10));
		print(kor,eng,math,total,avg,c);
		
	}
	public static void main(String[] args) {
		
		process();

	}

}
