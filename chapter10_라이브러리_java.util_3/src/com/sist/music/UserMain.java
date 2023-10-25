package com.sist.music;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;

import javax.swing.table.*;

public class UserMain extends JFrame implements ActionListener{
	
	JTextField tf;
	JButton b,b2;
	JTable table;
	DefaultTableModel model;
	MusicManager mm=new MusicManager(); //포함클래스
	
	//하나의 값을 공유할때는 무조건 static
	public UserMain() 
	{
		tf=new JTextField(10);
		b=new JButton("검색");
		b2=new JButton("목록");
		JPanel p=new JPanel();
		p.add(tf); p.add(b); p.add(b2);
		
		String[] col= {"순위","곡명","가수명"};
		String[][] row=new String[0][3];
		
		model=new DefaultTableModel(row,col);
		table=new JTable(model);
		JScrollPane js=new JScrollPane(table);
		
		//윈도우에 올리기
		add("North",p);
		add("Center",js);
		
		musicPrint();
		setSize(800,600);
		setVisible(true);
		
		b.addActionListener(this);
		b2.addActionListener(this);
		tf.addActionListener(this); //this안에 있는걸 실행한다는뜻
	}
	
	public void musicPrint() 
	{
		ArrayList<Music> list=mm.musicAllData();
		
		for(int i=model.getRowCount()-1;i>=0;i--)//0부터 지우면 하나가 남아서 뒤에서부터 지워나감
		{
			model.removeRow(i);//한번 지움
		}
		
		for(Music m:list)
		{                 //int => String으로 변환 (형변환불가능)
			String[] data={String.valueOf(m.getRank()),m.getTitle(),m.getSinger()};//데이터3개를
			model.addRow(data);//한줄씩 추가
		}
	}
	
	public void musicFindData(String title) 
	{
		ArrayList<Music> list=mm.MusicFindData(title);
		
		for(int i=model.getRowCount()-1;i>=0;i--)//0부터 지우면 하나가 남아서 뒤에서부터 지워나감
		{
			model.removeRow(i);//한번 지움
		}
		
		for(Music m:list)
		{                 //int => String으로 변환 (형변환불가능)
			String[] data={String.valueOf(m.getRank()),m.getTitle(),m.getSinger()};//데이터3개를
			model.addRow(data);//한줄씩 추가
		}
	}
	
	public static void main(String[] args) {
		new UserMain(); 
	}

	//여기가 버튼 눌렀을때 행동하는 부분
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==b||e.getSource()==tf)//버튼을누르거나? 엔터를눌러서! 검색실행
		{
			//검색출력
			String title=tf.getText();
			if(title.length()<1)//~예외처리부~
			{
				JOptionPane.showMessageDialog(this, "검색어를 입력하세요");//showMessageDialog=alt경고창
				tf.requestFocus();
				return;
			}
			musicFindData(title);
		}
		else if(e.getSource()==b2)
		{
			//목록출력
			musicPrint();
		}
		
	}

}
