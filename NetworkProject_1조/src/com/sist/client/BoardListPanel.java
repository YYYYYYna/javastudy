package com.sist.client;

//import java.awt.Color;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.table.*;
//사용자정의
import com.sist.vo.*;
import com.sist.manager.*;

public class BoardListPanel extends JPanel{
	
	JLabel la,pageLa;
	JButton b1,b2,b3,b4;
	JTable table;
	DefaultTableModel model;
	
	public BoardListPanel() {
		//setBackground(Color.cyan);
		
		//기본 테이블 형식
		String[] col={"번호","제목","이름","작성일","조회수"};
		String[][] row=new String[0][5];
		model=new DefaultTableModel(row,col);
		table=new JTable(model);
		JScrollPane js=new JScrollPane(table);
		
		//버튼 처리
		b1=new JButton("새글");
		b2=new JButton("검색");
		b3=new JButton("이전");
		b4=new JButton("다음");
		la=new JLabel("자유게시판");
		pageLa=new JLabel("1 page / 1 pages");
		
		//배치
		
		
	}

}
