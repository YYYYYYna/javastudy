package com.sist.main;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;



public class MainClass_1 {

	public static void main(String[] args) {
		try {
			String html="<html>"
					+"<body>"
					+"<div id=aaa>"
					+"<div class=bbb>Hello Java 1</div>"
					+"<a href=daum.net>"
					+"</a>"
					+"</div>"
					+"<div id=ccc>"
					+"<div class=ddd>Hello Java 2</div>"
					+"<img src=aaa.png>"
					+"</div>"
					+"<div class=kkk>"
					+"<div>Java</div>"
					+"</div>"
					+"<div class=kkk>"
					+"<div>Oracle</div>"
					+"</div>"
					+"<div class=kkk>"
					+"<div>HTML</div>"
					+"</div>"
					+"<div class=kkk>"
					+"<div>JSP</div>"
					+"</div>"
					+"<div class=kkk>"
					+"<div>Spring</div>"
					+"</div>"
					+"</body>"
					+"</html>";
			Document doc=Jsoup.parse(html,"UTF-8");
			//테그 한개를 가져올때는 Element
			Element elem=doc.selectFirst("div#aaa div.bbb");//selectFrist():테그를 선택할때 사용
			System.out.println(elem.text());//text():해당 테그의 텍스트값을 가져오기
			
			Element elem1=doc.selectFirst("div#ccc div.ddd");
			System.out.println(elem1.text());//text():해당 테그의 텍스트값을 가져오기
			
			Element elem2=doc.selectFirst("div#ccc img");
			System.out.println(elem2.attr("src"));//attr("위치"):해당 테크의 값을 가져옴
			
			Element elem3=doc.selectFirst("div#aaa a");
			System.out.println(elem3.attr("href"));//attr("위치"):해당 테크의 값을 가져옴
			
			//같은 테그 여러개를 가져와야할때는 Elements와 for문을 쓴다
			Elements div=doc.select("div.kkk div");
			//System.out.println(div);
			for(int i=0;i<div.size();i++)
			{
				System.out.println(div.get(i).text());
			}
		}catch(Exception ex)
		{
			
		}

	}

}
