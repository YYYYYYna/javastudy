package com.sist.client;

import javax.swing.*;
import javax.swing.table.*;
import java.awt.*;

public class ChatPanel extends JPanel{
	
	JTable table1,table2;
	DefaultTableModel model1,model2;
	JTextArea pane;
	JTextField tf;
	JButton b1,b2,b3,b4,b5,b6;
	
	public ChatPanel() {
		
		setLayout(null);
		
		String[] col1={"방이름","상태","인원"};
		String[][] row1=new String[0][3]; //일단 [0]으로 잡고 add()로 추가함
		model1=new DefaultTableModel(row1,col1);
		table1=new JTable(model1);
		JScrollPane js1=new JScrollPane(table1);
		js1.setBounds(320, 15, 700, 500);
		add(js1);
		
		String[] col2={"ID","이름","성별","위치"};
		String[][] row2=new String[0][4]; //일단 [0]으로 잡고 add()로 추가함
		model2=new DefaultTableModel(row2,col2);
		table2=new JTable(model2);
		JScrollPane js2=new JScrollPane(table2);
		js2.setBounds(320, 525, 700, 300);
		add(js2);
		
		pane=new JTextArea();
		JScrollPane js3=new JScrollPane(pane);
		pane.setEditable(false);//채팅 비활성화
		js3.setBounds(1030, 15, 550, 500);
		add(js3);
		
		tf=new JTextField();
		tf.setBounds(1030, 520, 550, 30);
		add(tf);
		
		b1=new JButton("방만들기");
		b2=new JButton("방들어가기");
		b3=new JButton("쪽지보내기");
		b4=new JButton("사용자정보보기");
		b5=new JButton("일대일채팅");
		b6=new JButton("채팅종료");
		JPanel p=new JPanel();
		p.setLayout(new GridLayout(3,2,5,5));
		p.add(b1);
		p.add(b2);
		p.add(b3);
		p.add(b4);
		p.add(b5);
		p.add(b6);
		p.setBounds(1030, 560, 550, 265);
		add(p);
		
	}
}
