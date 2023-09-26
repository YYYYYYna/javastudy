/*
 * 
 */
import java.util.*;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;
public class 지니뮤직 {
                                           //=>예외처리
	public static void main(String[] args) throws Exception{
		Scanner scan=new Scanner(System.in);
		String url="";
		while(true)
		{
			System.out.println("===== 매뉴 =====");
			System.out.println("1. TOP50");
			System.out.println("2. 가요");
			System.out.println("3. POP");
			System.out.println("4. OST");
			System.out.println("5. 트롯");
			System.out.println("6. JAZZ");
			System.out.println("7. CLASSIC");
			System.out.println("8. CONTAINS");
			System.out.println("9. StratsWith");
			System.out.println("10. EndsWith");
			System.out.println("11. EXIT");
			System.out.println("===============");
			System.out.println("매뉴선택 : ");
			int menu=scan.nextInt();
			
			if(menu==11)
			{
				System.out.println("프로그램 종료!");
				break;
			}
			else if(menu==1)
			{
				url="https://www.genie.co.kr/chart/top200";
			}
			else if(menu==2)
			{
				url="https://www.genie.co.kr/chart/genre?ditc=D&ymd=20230925&genrecode=M0100";
			}
			else if(menu==3)
			{
				url="https://www.genie.co.kr/chart/genre?ditc=D&ymd=20230925&genrecode=M0200";
			}
			else if(menu==4)
			{
				url="https://www.genie.co.kr/chart/genre?ditc=D&ymd=20230925&genrecode=M0300";
			}
			else if(menu==5)
			{
				url="https://www.genie.co.kr/chart/genre?ditc=D&ymd=20230925&genrecode=M0107";
			}
			else if(menu==6)
			{
				url="https://www.genie.co.kr/chart/genre?ditc=D&ymd=20230925&genrecode=M0500";
			}
			else if(menu==7)
			{
				url="https://www.genie.co.kr/chart/genre?ditc=D&ymd=20230925&genrecode=M0600";
			}
			
			System.out.println("검색어 입력 : ");
			String msg=scan.next();
			
			Document doc=Jsoup.connect(url).get();
			Elements title=doc.select("table.list-wrap a.title");
			for(int i=0;i<title.size();i++)
			{
				String name=title.get(i).text();
				
				//contains : 제목중에 검색하는 단어가 들어가면 출력하도록
				/*if(name.contains(msg))
				{
					System.out.println((i+1)+"."+name);
					Thread.sleep(500); //0.5초지연되게 하는부분
				}*/
				
				//startsWith : 제목중에 검색하는 단어로 시작하면 출력하도록
				/*if(name.startsWith(msg))
				{
					System.out.println((i+1)+"."+name);
				}*/
				
				//equals : 검색어와 해당단어가 완전히 똑같아야 출력함
				         //대소문자 구분함
				/*if(name.equals(msg))
				{
					System.out.println((i+1)+"."+name);
				}*/
				
				//equalsIgnoreCase : 검색어와 해당단어가 완전히 똑같아야 출력함
				                   //대소문자 구분 안함
				if(name.equalsIgnoreCase(msg))
				{
					System.out.println((i+1)+"."+name);
				}
				
				//endsWith : 제목중에 검색하는 단어로 끝나면 출력하도록
				           //만약에 물음표로 끝나면 물음표로 검색해야 나옴
				/*if(name.endsWith(msg))
				{
					System.out.println((i+1)+"."+name);
				}*/
				   
			}
					
		}

	}

}
