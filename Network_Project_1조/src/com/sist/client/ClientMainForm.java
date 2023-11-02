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
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;

public class ClientMainForm extends JFrame implements ActionListener,Runnable,MouseListener{
	
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
	
	// ID 저장
    String myId;
    // 테이블 선택 인덱스
    int selectRow=-1;
    
    // 쪽지 클래스
    String myid;
    SendMessage sm=new SendMessage();
    GetMessage rm=new GetMessage();
	
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
		
		//채팅등록
		cp.cp.tf.addActionListener(this);
		cp.cp.b6.addActionListener(this);//=프로그램 종료(채팅종료)
		
		//윈도우창의 x표시를 비활성화 시킴
		setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
		
		//사용자 정보보기
		cp.cp.b4.addActionListener(this);
		
		// 쪽지 등록
		cp.cp.table1.addMouseListener(this);
		cp.cp.b3.addActionListener(this);//쪽지보내기
    	sm.b1.addActionListener(this);
    	sm.b2.addActionListener(this);
    	rm.b1.addActionListener(this);
    	rm.b2.addActionListener(this);

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
			//System.exit(0);//그냥 종료하는게 아니라
			
			//창 닫기시 서버에서도 나오는걸로 코딩바꿈
			try {
				out.write((Funtion.EXIT+"|\n").getBytes());
			}catch(Exception ex) {}
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
		
		else if(e.getSource()==cp.cp.tf)
		{
			String msg=cp.cp.tf.getText();
			if(msg.trim().length()<1)
			{
				return;
			}
			//채팅메세지 전송
			try {
				out.write((Funtion.WAITCHAT+"|"+msg+"\n").getBytes());
			}catch(Exception ex) {}
			cp.cp.tf.setText("");
		}
		else if(e.getSource()==cp.cp.b6)
		{
			try {
				//서버를 나간다는 요청
				out.write((Funtion.EXIT+"\n").getBytes());//=허락을 받아야 가능함
			}catch(Exception ex){}
		}
		//메세지보내기
		else if(e.getSource() == cp.cp.b3) {
			int row = cp.cp.table2.getSelectedRow();
			sm.tf.setText(cp.cp.table2.getValueAt(row, 0).toString());
			sm.tf.setEditable(false);
			sm.ta.setText("");
			sm.setVisible(true);
		}
		else if(e.getSource()==sm.b1) {
			String id = sm.tf.getText();
			String content = sm.ta.getText();
			if(content.length()<1) {
				sm.ta.requestFocus();
				return;
			}
			
			String msg = Funtion.MSGSEND+"|"+id+"|"+content+"\n";
			
			try {
				out.write(msg.getBytes());
			}catch(Exception ex){
				ex.printStackTrace();
			}
			sm.setVisible(false);
		}
		else if(e.getSource() == sm.b2) { //취소
			sm.setVisible(false);
		}
		else if(e.getSource() == rm.b1) { // 답장하기
			sm.tf.setText(rm.tf.getText()); 
			sm.ta.setText("");
			sm.setVisible(true);
			rm.setVisible(false);
			
		}
		else if(e.getSource() == rm.b2) { // 취소
			rm.setVisible(false);
		}
		
		//사용자정보보기
		else if(e.getSource() == cp.cp.b4) { // 정보 보기
			int row = cp.cp.table2.getSelectedRow();
			String id = cp.cp.table2.getValueAt(row, 0).toString();
			String msg = Funtion.INFO+"|"+id+"|"+"\n";
			try {
				out.write(msg.getBytes());
			}catch (Exception ex) {
				System.out.println("사용자정보보기오류");
				ex.printStackTrace();
			}
		}
		
	}
	
	//서버연결부분
	public void connect(String id,String name,String sex)
	{
		try {           //이부분이 로컬호스트부분,포트번호 가 적혀야함
			s=new Socket("192.168.0.124",1024);
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
					cp.cp.bar.setValue(cp.cp.bar.getMaximum());;
					cp.cp.pane.append(st.nextToken()+"\n");
				}
				break;
				case Funtion.MYEXIT:
				{
					System.exit(0);//퇴장시 나의 창 종료
				}
				break;
				case Funtion.EXIT:
				{
					String id=st.nextToken();//퇴장시 더이상 받을값이 없음
					//이번에는 데이터를 받는게 아닌 삭제함
					for(int i=0;i<cp.cp.model2.getRowCount();i++)
					             //=>모델안에 출력한 모든 값을 뜻함
					{
						String temp=cp.cp.model2.getValueAt(i, 0).toString();
						if(id.equals(temp))
						{
							cp.cp.model2.removeRow(i);//접속시 보냈던 데이터 삭제
							break;
						}
					}
				}
				break;
				case Funtion.MSGSEND:{
					String id = st.nextToken();
					String content = st.nextToken();
					rm.tf.setText(id);
					rm.ta.setText(content);
					rm.setVisible(true);
				}
				break;
				case Funtion.INFO:{
					String data="아이디:"+st.nextToken()+"\n"
						     +"이름:"+st.nextToken()+"\n"
						     +"성별:"+st.nextToken();
					JOptionPane.showMessageDialog(this, data);
				}
				break;
				}
			}
		}catch(Exception ex) {}
		
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		
		if(e.getSource()==cp.cp.table2)
		{
			//if(e.getClickCount()==2)// 더블 클릭
			//{
			    selectRow=cp.cp.table2.getSelectedRow();
				String id=cp.cp.table2.getValueAt(selectRow, 0).toString();
				//JOptionPane.showMessageDialog(this, "선택된 ID:"+id);
				if(id.equals(myId))// 본인이면 
				{
					cp.cp.b1.setEnabled(false);
					cp.cp.b2.setEnabled(false);
				}
				else //본인이 아닌 경우 
				{
					cp.cp.b1.setEnabled(true);
					cp.cp.b2.setEnabled(true);
				}
		}
		
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

}
