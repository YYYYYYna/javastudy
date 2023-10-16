package com.sist.music;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

public class MelonMusicSystem extends GenieMusicSystem{
	
	//GenieMusicSystem의 모든 부분을 상속받았지만
	/*
	 * protected Music[] musics=new Music[50];
	 * 
	 * public Music[] musicTitleFindData(String title)
	 * public Music[] musicSingerFindData(String singer)
	 * public Music[] musicDetailData(int mno)
	 * ====> 이부분들은 모두 상속됨
	 * 
	 */
	
	//인스턴스 초기화 블록 부분은 상속받지못함!!! 초기화블록이기때문!!
	/*
	 * 초기화 블록 , static , 생성자 , private는 상속안됨!
	 */
	
	protected String title="멜론 TOP 50";
	{
		try {
			Document doc=Jsoup.connect("https://www.melon.com/chart/index.htm").get();
			
			//제목가져오기
			Elements title=doc.select("div.wrap_song_info div.rank01");
			
			//가수명가져오기
			Elements singer=doc.select("div.wrap_song_info div.rank02");
			
			//앨범가져오기
			Elements album=doc.select("div.wrap_song_info div.rank03");
			
			//for문으로 값채우기
			for(int i=0;i<50;i++)
			{
				musics[i]=new Music();
				musics[i].setMno(i+1);
				musics[i].setTitle(title.get(i).text());
				musics[i].setSinger(singer.get(i).text());
				musics[i].setAlbum(album.get(i).text());
			}
		}catch(Exception ex) {}
	}
}
