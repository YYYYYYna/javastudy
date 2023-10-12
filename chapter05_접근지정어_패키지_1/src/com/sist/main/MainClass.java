package com.sist.main;

import com.sist.manager.*;

//이번에는 public을 안쓰고 은닉화private를 사용해서 진행해봄

public class MainClass {

	public static void main(String[] args) {
		MusicSystem ms=new MusicSystem();
		for(Music m:ms.getMusics()) 
			//값을 읽으려면 get메소드 가져오려면 set메소드
		{
			System.out.println("------------------------------------------------------------");
			System.out.println(m.getMno()+"|"+m.getTitle()+"|"+m.getSinger()+"|"+m.getAlbum());
			System.out.println("------------------------------------------------------------");
			System.out.println(m.getMno());
			System.out.println(m.getTitle());
			System.out.println(m.getSinger());
			System.out.println(m.getAlbum());
		}

	}

}
