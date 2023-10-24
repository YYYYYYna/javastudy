package com.sist.music;

//Music데이터 제어하는곳 (프로그램)

import java.io.*;
import java.util.*;
public class MusicManager {
	
	//접속하는 모든 유저들에게 공유 => 목록 => static공유변수 이용
	//해당 메모리를 "재생성"보단 "공유"가 효율적임으로 static을 사용함
	private static Music[] musics=new Music[49];
	
	//자 이제 초기화~~
	//일단 1)클래스 불럭에서는 불가능
	//2) 인스턴스 블록 : 인스턴스, static 둘다 가능
	//3) static 블록 : static=>인스턴스를 초기화(객체생성)해야함
	
	//4) 생성자 : 인스턴스, static 둘다 가능
	//일단 메모리 할당을 해줘야 하기때문에 생성자로 진행
	public MusicManager() {
		
		//해당문장이 try문 안에 들어가면 finally에서 사용할 수 없음
		FileReader fr=null;
		
		try {
			fr=new FileReader("c:\\javaDev\\genie.txt");
			
			//데이터 가져오기
			int i=0;
			String music_data=""; //속도가 느리면 StringBuffer로 바꿔야함
			while((i=fr.read())!=-1)
			{
				music_data+=(char)i;
			}
			//한줄씩 자르기
			String[] mds=music_data.split("\n");
			//한행씩 자르기
			i=0;
			for(String s:mds) //s가 한줄씩 자른 데이터임
			{
				try
				{
				StringTokenizer st=new StringTokenizer(s,"|");//행으로잘라줌
				musics[i]=new Music();//배열크기만만들어줌
				musics[i].setRank(Integer.parseInt(st.nextToken())); //nextToken은 String형이니까 rank에 맞추기위해 Integer.parseInt로 변환해야함
				musics[i].setTitle(st.nextToken());
				musics[i].setSinger(st.nextToken());
				musics[i].setAlbum(st.nextToken());
				musics[i].setKey(st.nextToken());
				}catch(Exception ex) {}
			}
			
		}
		catch(Exception ex) 
		{
			//에러 위치 확인
			ex.printStackTrace();
		}
		finally
		{
			//파일 닫기의 역할(보통 닫기의 역할)
			try {
				fr.close();
			}catch(Exception ex) {}
		}
		
		/*
		 * finally안써도 자동으로 닫히는 소스
		 * try(FileReader fr=new FileReader();) {
		 * 	
		 * }
		 * catch(Exception ex) 
		 * {
		 * 
		 * }
		 * 
		 */
	}
	  public Music[] musicAllData()
	  {
		  return musics;
	  }
}
