package com.sist.client;
import javax.swing.*;

//2. 포함
//결과적으로 1.상속과 결과는 동일한걸 알수 있음
public class MyWindow {
	JFrame fr=new JFrame();//캡슐화는 이부분에 적용할 필요가 없음
	                       //캡슐화는 "데이터"를 감추는 역할을 하기 때문에
	                       //윈도우 부분은 굳이 캡슐화 시킬필요없음
	public MyWindow() {
		//상속을 안받아서 JFrame의 메소드사용불가능
		fr.setSize(800,600);
		fr.setVisible(true);
	}

	public static void main(String[] args) {
		new MyWindow();

	}

}
