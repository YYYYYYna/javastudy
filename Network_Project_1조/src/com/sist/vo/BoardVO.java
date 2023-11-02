package com.sist.vo;
import java.io.Serializable;
import java.util.*;
// 게시판 실습
//게시판=파일입출력

//vo=value object=값만가지고있음:변수=사용자정의데이터형
//반드시 캡슐화를 통해서 데이터를 보호해야함 => 웹에서도 동일한 코딩함
//"한개"의 게시물에 대한 정보를 가지고 있음
public class BoardVO implements Serializable{
	//구분자
	private int no; //게시물 번호 => 중복이 없어야함!!(수정,삭제를위해)
	//변수
	private String name;//작성자
	private String subject;//제목
	private String content;//내용
	private Date regdate; //등록일
	private String pwd;//비밀번호 => 수정/삭제시 게시자 본인여부 확인
	private int hit;//조회수
	//getter,setter
	public int getNo() {
		return no;
	}
	public void setNo(int no) {
		this.no = no;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public Date getRegdate() {
		return regdate;
	}
	public void setRegdate(Date regdate) {
		this.regdate = regdate;
	}
	public String getPwd() {
		return pwd;
	}
	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
	public int getHit() {
		return hit;
	}
	public void setHit(int hit) {
		this.hit = hit;
	}
	
	
}
