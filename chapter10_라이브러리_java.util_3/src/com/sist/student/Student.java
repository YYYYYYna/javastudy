package com.sist.student;
//학생 한명에 대한 데이터를 모아서 한번에 관리
//학생이라는 데이터형을 제작 => 사용자정의데이터형
//데이터 은닉화 => 읽기/쓰기 기능 추가
public class Student {
	
	private int hakbun;
	private String name;
	private int kor,math,eng;
	
	
	public int getHakbun() {
		return hakbun;
	}
	public void setHakbun(int hakbun) {
		this.hakbun = hakbun;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getKor() {
		return kor;
	}
	public void setKor(int kor) {
		this.kor = kor;
	}
	public int getMath() {
		return math;
	}
	public void setMath(int math) {
		this.math = math;
	}
	public int getEng() {
		return eng;
	}
	public void setEng(int eng) {
		this.eng = eng;
	}
	
	//객체생성을 하면 매개변수가 또 필요하니까 매개변수가 없는 생성자도 하나 생성하기
	//총 생성자 2개 생성됨 => 생성자오버로딩 : 한개의 메소드로 여러개의 기능 설정
	public Student()
	{
		
	}
	
	//constructor Using field 사용하면 생성자도 만들수 있음
	public Student(int hakbun, String name, int kor, int math, int eng) {
		super();
		this.hakbun = hakbun;
		this.name = name;
		this.kor = kor;
		this.math = math;
		this.eng = eng;
	}
	
	

}
