/*
 *      문자열
 *      ----
 *        length() => 문자의 갯수
 *        substring() => 문자 자르기
 *        indexOf(), lastIndexOf() => 문자열 번호 찾기
 *        contains() => 포함
 *        startsWith()
 *        valueOf() => 문자열 변환
 *        replace()
 *        split()
 *        ------------------------------------------
 */

//불법으로 유튜브 영상 링크 크롤링 하는법 

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

import java.io.*;
import java.net.URLEncoder;
public class 문자열_1 {

	public static void main(String[] args) throws Exception{
		//동영상 실행
		Document doc=Jsoup.connect("https://www.genie.co.kr/chart/top200").get();
		//=>지니뮤직 서버 HTML값 다 가져옴
		//System.out.println(doc.toString());
		Elements title=doc.select("table.list-wrap a.title");//함수명+.(클래스)#(아이디)+이름
		//System.out.println(title);
		Elements artist=doc.select("table.list-wrap a.artist");//함수명+.(클래스)#(아이디)+이름
		Elements album=doc.select("table.list-wrap a.albumtitle");//함수명+.(클래스)#(아이디)+이름
		for(int i=0;i<title.size();i++)//왜 length가 아니라 size를 쓰는건지??
		{
			System.out.println("순위 : "+(i+1));
			System.out.println("곡명 : "+title.get(i).text());
			System.out.println("가수명 : "+artist.get(i).text());
			System.out.println("앨범명 : "+album.get(i).text());
			String msg=(i+1)+"|"+title.get(i).text()+"|"+artist.get(i).text()+"|"+album.get(i).text()+"|"+youtubeData(title.get(i).text())+"\r\n";
			//=>이게 선생님이 배포해주신 seoul_location같은 파일 형식으로 바꾸는 과정임
			System.out.println(msg);
			FileWriter fw=new FileWriter("c:\\javaDev\\genie.txt",true);
			fw.write(msg);
			fw.close();
		}

	}
	static String youtubeData(String title)
	{
		String key="";
		try
		{
			//https://www.youtube.com/results?search_query=Love+Lee 링크에서 query다음이 인코더 부분
		    String url="https://www.youtube.com/results?search_query="+URLEncoder.encode(title, "UTF-8");
		    Document doc=Jsoup.connect(url).get();
		    Pattern p=Pattern.compile("/watch\\?v=[^가-힣]+");
		    Matcher m=p.matcher(doc.toString());
		    while(m.find())
		    {
		    	String s=m.group();
		    	key=s.substring(s.indexOf("=")+1,s.indexOf("\""));
		    	break;
		    }
		}catch(Exception ex) {}
		
		return key;
	}

}
