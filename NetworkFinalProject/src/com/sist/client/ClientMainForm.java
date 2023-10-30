package com.sist.client;

import javax.swing.*;
import java.awt.*;

public class ClientMainForm extends JFrame{
	
	MenuPanel mp=new MenuPanel();
	
	//배치를 위해 public
	public ClientMainForm() {
		
		//레이아웃지원 : null로 설정시 지원안받는다는뜻(=직접배치)
		setLayout(null);
		mp.setBounds(10, 15, 100, 250);
		add(mp);
		setSize(1024, 768);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);//이부분이 있어야 창이 닫힘
		/*
		 * 지원되는 레이아웃 종류
		 * FlowLayout : JPanel
		 *    => 한줄로 상단에 매뉴 출력
		 * GridLayout
		 *    => 계산기 숫자칸처럼 일정간격으로 크기를 주는것
		 * BorderLayout : JFrame
		 *    => 동,서,남,북,중앙 기준으로 한곳에 배치하는것
		 * CardLayout
		 *    => 아 매뉴를 감춰놨다가 클릭하면 휘리릭 하면서 해당위치를 보여주는거
		 */
	}
	
	public static void main(String[] args) {
		try
		{
			//UI종류중에 mint로 고름
			 UIManager.setLookAndFeel("com.jtattoo.plaf.mint.MintLookAndFeel");
		}catch(Exception ex) {}
	    new ClientMainForm();

	}

}
