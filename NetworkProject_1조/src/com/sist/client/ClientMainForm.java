package com.sist.client;

import javax.swing.*;

import com.sist.common.ImageChange;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ClientMainForm extends JFrame implements ActionListener{
	
	MenuPanel mp=new MenuPanel();
	
	JLabel logo=new JLabel();
	
	ControlPanel cp=new ControlPanel();
	
	Login login=new Login();
	
	//배치를 위해 public
	public ClientMainForm() {
		
		//레이아웃지원 : null로 설정시 지원안받는다는뜻(=직접배치)
		setLayout(null);
		
		logo.setBounds(320, 20, 120, 60);
		logo.setIcon(new ImageIcon(ImageChange.getImage(new ImageIcon("c:\\javaDev\\logo.png"), 120, 60)));
		add(logo);
		
		//화면구현판
		cp.setBounds(0, 120, 1920, 940);
		add(cp);
		
		//매뉴구현판
		mp.setBounds(460, 40, 1120, 40);
		add(mp);
		setSize(1920, 1080);
		//setVisible(true); //로그인이 먼저 보여야 하니까 주석처리
		setDefaultCloseOperation(EXIT_ON_CLOSE);//이부분이 있어야 창이 닫힘
		setResizable(false);
		
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
		
		//등록
		mp.b1.addActionListener(this);
		mp.b2.addActionListener(this);
		mp.b3.addActionListener(this);
		mp.b4.addActionListener(this);
		mp.b5.addActionListener(this);
		mp.b6.addActionListener(this);
		
		login.b1.addActionListener(this);
	}
	
	public static void main(String[] args) {
		try
		{
			//UI종류중에 mint로 고름
			 UIManager.setLookAndFeel("com.jtattoo.plaf.acryl.AcrylLookAndFeel");
			 
		}catch(Exception ex) {}
		System.out.println("111");
	    new ClientMainForm();
	    System.out.println("111");

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==mp.b1)
		{
			cp.card.show(cp, "home");
		}
		else if(e.getSource()==mp.b3)
		{
			cp.card.show(cp, "chat");
		}
		else if(e.getSource()==mp.b4)
		{
			cp.card.show(cp, "board");
		}
		else if(e.getSource()==mp.b5)
		{
			cp.card.show(cp, "news");
		}
		else if(e.getSource()==mp.b6)
		{
			System.exit(0);
		}
		else if(e.getSource()==login.b1)
		{
			//서버연결
			login.setVisible(false);
			setVisible(true);
		}
		
	}

}
