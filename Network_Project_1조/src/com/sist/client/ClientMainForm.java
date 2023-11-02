package com.sist.client;

import javax.swing.*;

import com.sist.common.Funtion;
import com.sist.common.ImageChange;
import com.sist.manager.*;
import com.sist.vo.*;

import java.util.*;
import java.io.*;
import java.net.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class ClientMainForm extends JFrame implements ActionListener,Runnable{
	
	MenuPanel mp=new MenuPanel();
	ControlPanel cp=new ControlPanel();
	JLabel logo=new JLabel();
	Login login=new Login();
	MovieManager mm=new MovieManager();
	
	//네트워크와 관련된 서버 구축
	//1.연결선이 필요
	Socket s;
	//2.송신에 필요한거 가져옴
	OutputStream out;
	//3.데이터받기:수신
	BufferedReader in;
	
	//배치를 위해 public
	public ClientMainForm() {
		
		//레이아웃지원 : null로 설정시 지원안받는다는뜻(=직접배치)
		setLayout(null);
		
		logo.setBounds(320,20,1120,60);
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
		
		ArrayList<MovieReservationVO> list=mm.MovieReservationData(1);
		cp.hp.cardPrint(list);
	}
	
	public static void main(String[] args) {
		try
		{
			//UI종류중에 mint로 고름
			 UIManager.setLookAndFeel("com.jtattoo.plaf.acryl.AcrylLookAndFeel");
			 
		}catch(Exception ex) {}
	    new ClientMainForm();

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==mp.b1)
		{
			cp.card.show(cp, "home");
		}
		else if(e.getSource()==mp.b2)
		{
			cp.card.show(cp,"find");
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
			//서버연결해야함
			//login.setVisible(false);
			//setVisible(true);
			//이제 연결되서 주석처리함
			
			//서버연결
			String id=login.tf1.getText();
			if(id.trim().length()<1)
			{
				login.tf1.requestFocus();
				return;
			}
			
			String name=login.tf2.getText();
			if(name.trim().length()<1)
			{
				login.tf2.requestFocus();
				return;
			}
			
			String sex="";
			if(login.rb1.isSelected())
			{
				sex="남자";
			}
			else
			{
				sex="여자";
			}
			
			// 서버 연결
			connect(id, name, sex);
		}
		
	}
	
	//서버연결부분
	public void connect(String id,String name,String sex)
	{
		try {           //이부분이 로컬호스트부분,포트번호 가 적혀야함
			s=new Socket("localhost",3355);
			out=s.getOutputStream();
			in=new BufferedReader(new InputStreamReader(s.getInputStream()));
			
			//아래는 보내는값
			out.write((Funtion.LOGIN+"|"+id+"|"+name+"|"+sex+"\n").getBytes());
		}catch(Exception ex) {}
		//여기서부터는 서버로부터 들어오는 데이터를 받아서 처리해야함
		new Thread(this).start();
	}

	//이부분이 받아온 데이터를 "어떻게" 처리할건지 결정함
	//Thread의 내용~~ 프로그램을 별도로 동작할 수 있도록 => 서버에서 들어오는 값만 처리
	@Override
	public void run() {
		// TODO Auto-generated method stub
		try {
			while(true)
			{
				String msg=in.readLine();
				StringTokenizer st=new StringTokenizer(msg,"|");
				int protocol=Integer.parseInt(st.nextToken());
				
				//Funtion.LOGIN+"|"+id+"|"+name+"|"+sex+"|"+pos
				//지금 받아온값이 위부분임. switch로 아래서 자름
				switch(protocol)
				{
				//로그인 처리 과정
				case Funtion.LOGIN:
				{
					String[] data= {
							st.nextToken(),
							st.nextToken(),
							st.nextToken(),
							st.nextToken()
					};
					cp.cp.model2.addRow(data);
				}
				break;
				//로그인 후 정리를 하는 2개 과정
				case Funtion.MYLOG:
				{
					//1.로그인창 닫기
					login.setVisible(false);
					//2.새창열기
					setVisible(true);
				}
				break;
				case Funtion.WAITCHAT:
				{
					cp.cp.pane.append(st.nextToken()+"\n");
				}
				break;
				}
			}
		}catch(Exception ex) {}
		
	}

}
