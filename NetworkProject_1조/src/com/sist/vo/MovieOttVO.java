package com.sist.vo;

import java.io.Serializable;

/*
 *   
 */
public class MovieOttVO implements Serializable{
	
	private int mno;
	
	private String title;
	private String image;
	private String regdate;
	private String genre;
	private String nation;
	private String grade;
	private String time;
	private double score;
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
	public double getScore() {
		return score;
	}
	public void setScore(double score) {
		this.score = score;
	}
	public String getMake_share() {
		return make_share;
	}
	public void setMake_share(String make_share) {
		this.make_share = make_share;
	}
	
	
	
	
	
	
	
}
