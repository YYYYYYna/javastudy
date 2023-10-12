package com.sist.manager;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

//이번에는 public을 안쓰고 은닉화private를 사용해서 진행해봄

//이건 lombok.jar로 다운받아서 getter/setter 쉽게 설치한 과정
//@바로 아래부분을 적용시킴
@Getter
@Setter 
//@NoArgsConstructor //디폴트생성자
//@AllArgsConstructor //매개변수생성자
public class Music {
	//구분자
	private int mno;
	
	//변수
	private String title;
	//@Setter 이렇게두면 singer부분만 만들어짐
	private String singer;
	private String album;
	private int idcrement;
	private String state;
	//private=은닉화
	//은닉화 상태라도 클라이언트가 볼수 있게 만들어야함
	//=> 변수의기능 메모리에서데이터읽기(읽기)/메모리에저장(쓰기)==읽기/쓰기 기능추가 => getter/setter
	
	//아래가 lombok.jar없이 getter/setter를 이용한 캡슐화 코딩
	/*
	public int getMno() {
		return mno;
	}
	public void setMno(int mno) {
		this.mno = mno;
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
	public int getIdcrement() {
		return idcrement;
	}
	public void setIdcrement(int idcrement) {
		this.idcrement = idcrement;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}*/
	
}
