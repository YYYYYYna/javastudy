package com.sist.music;

import java.util.*;

public class MusicMain {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.print("선택(Genie(1),Melon(2)) : ");
		int select=scan.nextInt();
		
		//상위클래스로 => 하위클래스 제어가능!
		GenieMusicSystem ms=null;
		if(select==1)
		{
			ms=new GenieMusicSystem();
		}
		else
		{
			ms=new MelonMusicSystem();
		}
		
		//1. 전체목록 가져오기
		//System.out.println(ms.title); //protected로 명명한 각각 제목부분 가져오기
		
		Music[] m=ms.musicAllData();
		for(Music mm:m)
		{
			System.out.println(mm.getMno()+"."+mm.getTitle());
		}
		
		//2.검색하기
		System.out.println("=============================");
		System.out.print("가수명 입력 : ");
		String singer=scan.next();
		Music[] findData=ms.musicSingerFindData(singer);
		for(Music mm:findData)
		{
			System.out.println(mm.getTitle()+"("+mm.getSinger()+")");
		}
		
	}

}
