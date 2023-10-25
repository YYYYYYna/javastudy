package com.sist.music;
//여기가 DAO부분~~ 기능수행부분임
/*
 *  크롤링 => 데이터를 모아서 메모리에 저장
 *                     ---------
 *                     1)배열
 *                     2)컬렉션
 *  크롤링 => 파일
 *  크롤링 => 오라클
 *  ----------------> 브라우저에 출력
 */
import java.util.*;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;
public class MusicManager {
	
	//현재 뮤직 전체 데이터를 가지고 있음
	//클라이언트 접속에게 공유 => static
	
	//1. 데이터 모으는데 하나의 값을 공유할때는 무조건 static
	private static ArrayList<Music> list=new ArrayList<Music>();
	
	//2. 실행과 동시에 여러데이터 저장(크롤링) ==> static블록이용함
	static 
	{
		//네트워크와 관련되어 있으니 예외처리하기
		try {                 //connet링크에서 가져와라(=get) 라는뜻
			Document doc=Jsoup.connect("https://www.genie.co.kr/chart/top200").get();
			//포스터 가져오기 => <img>
			Elements poster=doc.select("table.list-wrap a.cover img");
			//곡명 가져오기
			Elements title=doc.select("table.list-wrap td.info a.title");
			//가수별 가져오기
			Elements singer=doc.select("table.list-wrap td.info a.artist");
			//앨범 가져오기
			Elements album=doc.select("table.list-wrap td.info a.albumtitle");
			
			for(int i=0;i<poster.size();i++)
			{
				Music music=new Music();
				music.setRank(i+1);
				music.setPoster("http:"+poster.get(i).attr("src"));//attr는 src의 값을 가져올때 쓰는 테그
				music.setTitle(title.get(i).text());
				music.setSinger(singer.get(i).text());
				music.setAlbum(album.get(i).text());
				
				//가져온 데이터 한곳에 모으기
				list.add(music);
			}
		}catch(Exception ex) {ex.printStackTrace();}
	}
	
	//3. 기능(메소드) 생성
	//3-1) 목록출력 
	public ArrayList<Music> musicAllData()
	{
		return list;
	}
	
	//3-2) 상세보기 ==> 1개만나옴=Music
	public Music musicDetailData(int no)
	{
		Music music=new Music();
		for(Music m:list)
		{
			if(m.getRank()==no)
			{
				music=m;
				break;
			}
		}
		return music;
	}
	//3-3) 검색 ==> 여러개만나옴=ArrayList<Music>
	public ArrayList<Music> MusicFindData(String title)
	{
		ArrayList<Music> arr=new ArrayList<Music>();
		for(Music m:list)
		{
			if(m.getTitle().contains(title))
			{
				arr.add(m);
			}
		}
		return arr;
	}
	
}
