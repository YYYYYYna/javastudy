// 페이징 기법 예제!!!!

import java.io.*;
import java.util.*;
/*
 * 271|구하산방|인사동 구하산방은 1915년 문을 열었다. 고종 황제와 순종 황제가 찾았던 붓집으로 100년이 지난 지금까지 문방사우를 팔고 있다.|03162 서울 종로구 인사동5길 11 (인사동)
 * ↑seoulData의 한 행에 해당되는 데이터
 */
public class 문자열_6 {
	static String seoulData="";//아래 static부분은 txt파일을 읽어들여서 해당줄 변수에 저장한거임
	static//시작시 자동실행되는영역
	{
		try//예외처리
		{
			FileReader fr=new FileReader("C:\\javaDev\\seoul_location.txt");
			int i=0;
			while((i=fr.read())!=-1)
			{
				seoulData+=(char)i;
			}
		}catch(Exception ex){}
	}

	public static void main(String[] args) {
		//System.out.println(seoulData);
		
		//1.페이징 기법 : 사용자가 페이지 입력시 해당페이지 출력 => 10page 출력
		String[] seoul=seoulData.split("\n");//seoulData를 행에 따라 나눈 배열생성
		Scanner scan=new Scanner(System.in);
		int curpage=1;//현재페이지=1을 디폴트로
		int total=(int)(Math.ceil(seoul.length/10.0));
		                   //ceil() : 올림함수 / 27.3=>28로만듬
		//System.out.println("총 페이지 : "+total);
		while(true)//계속 페이지를 선택할수 있도록
		{
			System.out.print("페이지 선택(1~"+total+") : ");
			curpage=scan.nextInt();
			if(curpage<1 || curpage>28)//범위 외의 숫자를 입력시 종료
			{
				System.out.println("프로그램 종료");
				break;
			}
			final int ROW=20;//20상수생성
			int j=0;//10개씩 나눠주는 변수 : 10보다 커지면 빠져나올수 있도록
			int pagecnt=(curpage*ROW)-ROW;//for문의 시작위치(출력)를 잡아주는 변수
			                    //↑20개씩 나오도록 상수넣음
			/*
			 *   1 page 요청시 0~9
			 *   2 page 요청시 10~19
			 *   3 page 요청시 20~29
			 *   ------      -----
			 *     =j        =pagecnt => 이부분 틀릴수도...
			 */
			for(int i=0;i<seoul.length;i++)
			{
				String[] ss=seoul[i].split("\\|");//나눠진 행에서 |를 기준으로 한번더 자름
				    //↓20개씩 나오도록 상수넣음
				if(j<ROW && i>=pagecnt)
				{
					System.out.println(ss[0]+"."+ss[1]);
					j++;
				}
			}
			
		}
	    
	    

	}

}
