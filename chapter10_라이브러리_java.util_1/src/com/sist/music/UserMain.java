package com.sist.music;

//사용자가 보는위치 (브라우저)

public class UserMain {

	public static void main(String[] args) {
		
        MusicManager m=new MusicManager();
        Music[] music=m.musicAllData();

        for(Music mm:music)
        {
        	System.out.println(mm.getRank()+"."+mm.getTitle());
        }
	}

}