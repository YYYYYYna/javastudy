package com.sist.client;
import javax.swing.*;
/*
 *   상속은 가장 큰것을 받아야함
 *   윈도우의 경우엔 버튼같은 작은 부분이 아니라 윈도우가 상속받아야함
 */
//1. 상속 : 시작과 동시에 실행함
public class MyWindow2 extends JFrame{
	
	public MyWindow2() {
		
		//이부분은 JFrame에서 상속받은 메소드들 사용하는거임
		setSize(800,600);
		setVisible(true);
	}

	public static void main(String[] args) {
		new MyWindow2();

	}

}
