package com.sist.music;

//가져와야하는 예시
//1|Love Lee|AKMU (악뮤)|Love Lee|EIz09kLzN9k\u0026pp=ygUITG92ZSBMZWU%3D

public class Music {
	
	//사용자정의 데이터형 생성 => 캡슐화가 기본(private)
	private int rank;
	private String title;
	private String singer;
	private String album;
	private String key;
	
	//프로젝트에서는 lombok사용하기
	//변수 => 읽기/쓰기 기능을 만들어서 접근이 가능
	public int getRank() {
		return rank;
	}
	public void setRank(int rank) {
		this.rank = rank;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getSinger() {
		return singer;
	}
	public void setSinger(String singer) {
		this.singer = singer;
	}
	public String getAlbum() {
		return album;
	}
	public void setAlbum(String album) {
		this.album = album;
	}
	public String getKey() {
		return key;
	}
	public void setKey(String key) {
		this.key = key;
	}
	

}
