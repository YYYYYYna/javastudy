package com.sist.vo;

import java.io.Serializable;
//그대들은 어떻게 살 것인가|https://img1.daumcdn.net/thumb/C408x596/?fname=https%3A%2F%2Ft1.daumcdn.net%2Fmovie%2F814364da4037f74217243eeee6b4648d7dc2fc79|2023.10.25|애니메이션/어드벤처/판타지/드라마|일본|전체관람가|123분|5.6|1,007,648명
public class MovieReservationVO implements Serializable{
	private int mno;
	private String title;
	private String image;
	private String regdate;
	private String genre;
	private String nation;
	private String grade;
	private String time;
	private String score;
	private String make_share;
	
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
	public String getImage() {
		return image;
	}
	public void setImage(String image) {
		this.image = image;
	}
	public String getRegdate() {
		return regdate;
	}
	public void setRegdate(String regdate) {
		this.regdate = regdate;
	}
	public String getGenre() {
		return genre;
	}
	public void setGenre(String genre) {
		this.genre = genre;
	}
	public String getNation() {
		return nation;
	}
	public void setNation(String nation) {
		this.nation = nation;
	}
	public String getGrade() {
		return grade;
	}
	public void setGrade(String grade) {
		this.grade = grade;
	}
	public String getTime() {
		return time;
	}
	public void setTime(String time) {
		this.time = time;
	}
	public String getScore() {
		return score;
	}
	public void setScore(String score) {
		this.score = score;
	}
	public String getMake_share() {
		return make_share;
	}
	public void setMake_share(String make_share) {
		this.make_share = make_share;
	}
}