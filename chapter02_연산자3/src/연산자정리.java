/*
 *    필수로 알아야 하는 연산자만 정리
 *                   -----메소드(기능수행)
 *                   
 *    <각각의 연산자가 주로 사용되는 곳>
 *    증감연산자 : 반복문에서 주로 사용 (++,--)
 *    부정연산자 : 반대효과
 *    형변환연산자 : 클래스 형변환
 *    -----------------------------------
 *    산술연산자 : + (문자열 결합)
 *               % (연도 계산, 페이지)
 *    비교연산자 : 반복문, 조건문 
 *    논리연산자 : 기간, 범위 ==> &&
 *    대입연산자 : =, +=
 *    -----------------------------------
 *    
 */

//예시로 지니뮤직의 TOP200의 노래제목리스트를 가져옴
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;
import java.util.*;
public class 연산자정리 {

	public static void main(String[] args) throws Exception
	{
		 Scanner scan=new Scanner(System.in);
		 System.out.println("검색어 입력: ");
		 String fd=scan.next();
		Document doc=Jsoup.connect("https://www.genie.co.kr/chart/top200").get();
		Elements title=doc.select("a.title");
		Elements artist=doc.select("a.artist");
		for(int i=0;i<50;i++)
		{
			if(title.get(i).text().contains(fd))
			{
			  System.out.println(title.get(i).text()
			   +"("+artist.get(i).text()+")"
		     );
			}
		}

	}

}
