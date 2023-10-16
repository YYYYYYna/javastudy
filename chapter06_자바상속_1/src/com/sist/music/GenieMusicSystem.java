package com.sist.music;

/*
 *    GenieMusicSystem
 *         ↓상속의 과정을 만들려함
 *    MelonMusicSystem
 *    
 *    상속을 할때 고민할 부분
 *    0. 모든 데이터는 은닉화가 기본이다.
 *    1. 접근지정어 
 *    1-0. default의 경우 : 현재는 접근이 가능하나 default를 하나 만들면? 
 *                        지니와 멜론이 패키지가 동일해야 상속할수 있음
 *    1-1. private : getter/setter를 만들어서 접근이 가능하도록 해야함
 *    1-2. protected : 패키지가 동일해야하지만? 상속의 경우 패키지가 다를수 있음
 *    
 *    
 */
import java.util.Scanner;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

public class GenieMusicSystem {
	//0. 모든 데이터는 은닉화가 기본이다.
	//따라서 protected를 사용함 (private는 사용시 제약이 많음)
	protected Music[] musics=new Music[50];
	
	protected String title="지니뮤직 TOP50";
	
	// 위의 musics 초기화 해야함
	// => 생성자 혹은 초기화블록 이용
	//지금은 생성자로 초기화 하면안됨 외부에서 데이터를 가져올때 
	//선언만 하면서 초기화를 따로하기 위해서 "인스턴스초기화블록"을 이용함
	/*
	 * 외부에서 데이터를 가져올때(=크롤링,파일,오라클)의 경우에는 명시적 초기화가 안됨으로
	 * 아래에는 생성자가 아닌 인스턴스초기화블록을 사용함~~~
	 */
	{
		/*
		 * 초기화블록
		 * => 인스턴스블록 : {} => 인스턴스변수,static변수 사용가능
		 * => 정적(static)블록 : static{} => static변수만 초기화가능
		 *    -------------- 자동인식됨 (호출하는게 아님)
		 *    =상속의 예외조건
		 */
		//이게 인스턴스 초기화 블록~~~
		try {
			//[예시1]~~~만약 위에 아래의 패키지 두개가 import되었을때
			//import java.util.*;
			//import java.sql.*;
			//Date date=new Date(); //이건 오류남 : sql인지 util인지 패키지 충돌되서 그럼
			//[예시2]~~~java.lang은 생략가능~~
			
			Document doc=Jsoup.connect("https://www.genie.co.kr/chart/top200").get();
			//Document : HTML을 저장하는 공간
			//Jsoup : HTML을 읽어서 데이터를 추출하는거~~
			////서버에서 데이터를 저장하는 방식은 HTML,JSON,XML등등이 있는데 방식마다 추출방식이 다름~~
			
			//제목가져오기
			Elements title=doc.select("table.list_wrap td.info a.title");
			//select() : 찾을때 쓰는거
			//Element : HTML에서 테그를 가져오는것
			//Elements : HTML에서 같은테그 여러개를 가져오는것
			////테그 내에 아이디나 클래스를 attribute라고 함
			////id => 테그명#아이디명 => 보통중복이없는경우 / class => 테그명.클래스명 => 보통중복이많은경우
			
			//가수명가져오기
			Elements singer=doc.select("table.list_wrap td.info a.aritst");
			
			//앨범가져오기
			Elements album=doc.select("table.list_wrap td.info a.albumtitle");
			
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
		/*
		 * try-catch : 프로그램의 비정상 종료 방지
		 *           : 에러를 사전에 방지
		 *           : 에러를 무시하고 문장을 수행함
		 *           : network, 파일, 오라클 연동시 예외처리를 반드시 한다!!!!!
		 *           : 수정이 가능한 에러만 사용가능
		 *             예) 파일경로가 틀리다거나 (O) ==> 예외처리의 범위
		 *                메모리가 부족하다거나 (X) ==> 에러의 범위
		 *           
		 *           형식)
		 *               try {
		 *	                 <정상적으로 수행하는 문장>
		 *                   <지금까지 코딩했던 문장>
		 *                   }catch(Exception ex) {<에러시 처리>}  
		 *                    
		 */
	}
	
	/////////////아래는 메소드~~`
	
	public Music[] musicAllData()
	{
		return musics;
	}
	
	
	//제목으로 찾기
	public Music[] musicTitleFindData(String title)
	{
		int count=0;
		for(Music mm:musics)
		{
			if(mm.getTitle().contains(title))
			{
				count++;
			}
		}
		Music[] music=new Music[count];
		int i=0;
		for(Music m:musics)
		{
			if(m.getTitle().contains(title))
			{
				music[i]=m;
				i++;
			}
		}
		return music;
	}
	
	
	//가수로 찾기
	public Music[] musicSingerFindData(String singer)
	{
		int count=0;
		for(Music mm:musics)
		{
			if(mm.getSinger().contains(singer))
			{
				count++; //해당갯수만큼 배열이 생성되어야함
			}
		}
		Music[] music=new Music[count];//해당갯수만큼 배열이 생성되어야함 
		//(=>배열의단점 = 갯수지정이 고정되어있음) : 동적데이터~~~ / 이와 다른건 컬렉션임
		int i=0;
		for(Music m:musics)
		{
			if(m.getSinger().contains(singer))
			{
				music[i]=m;
				i++;
			}
		}
		return music;
	}
	
	
	//상세보기
	public Music musicDetailData(int mno)
	{
		return musics[mno-1];
	}
	/*
	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		
		
		//가수명으로 찾기
		System.out.println("가수명을 입력하세요 : ");
		String singer=scan.next();
		
		GenieMusicSystem gm=new GenieMusicSystem();
		Music[] music=gm.musicSingerFindData(singer);
		System.out.println("검색결과 : "+music.length+"건");
		
		for(Music m:musics)
		{
			System.out.println(mm.getTitle()+"("+mm.getSinger()+")");
		}
		*/
		
		
		
		
	}
	
	

