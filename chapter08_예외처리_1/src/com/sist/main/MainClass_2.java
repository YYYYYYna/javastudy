package com.sist.main;
/*
 *      인터페이스의 다형성
 *               ----
 *               = 한개 메소드를 이용해서 다른 내용으로 구현 (=오버라이딩)
 *               = 화면에서 뮤직,영화,맛집이란 "내용"은 다르지만 "출력"하는 동작은 같음
 */

//다형성 예제 : 한개의 기능을 가지고 여러개의 내용을 출력하는것
interface II{
	public void print();
}

class Music implements II{
	public void print() {
		System.out.println("음악 목록 출력");
	}
}

class Movie implements II{
	public void print() {
		System.out.println("영화 목록 출력");
	}
}

class Food implements II{
	public void print() {
		System.out.println("영화 목록 출력");
	}
}
public class MainClass_2 {

	public static void main(String[] args) {
		//인터페이스로 정리했는데
		//Food f=new Food(); //이렇게 또 따로따로 메모리 생성하면
		//인터페이스로 묶은 이유가 없음...
		
		//인터페이스로 한번에 정리하는법
		II i=new Music();
		i.print();
		
		i=new Movie();
		i.print();
		
		i=new Food();
		i.print();

	}

}
