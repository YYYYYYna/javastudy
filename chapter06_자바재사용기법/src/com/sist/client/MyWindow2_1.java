package com.sist.client;
import javax.swing.*;
import java.net.*;
import java.awt.*;

//JLabel 실습 : 영화 포스터 이미지 가져오기
public class MyWindow2_1 extends JFrame{
	
	JLabel la=new JLabel();
	
	public MyWindow2_1() {
		
		setLayout(null);
		la.setBounds(10,15,350,500);
		add(la);
		try {
			URL url=new URL("https://img.cgv.co.kr/Movie/Thumbnail/Poster/000087/87433/87433_320.jpg");
			la.setIcon(new ImageIcon(url));
			
		}catch (Exception ex) {}
		
		//이부분은 JFrame에서 상속받은 메소드들 사용하는거임
		setSize(800,600);
		setVisible(true);
	}

	public static void main(String[] args) {
		new MyWindow2_1();

	}

}
