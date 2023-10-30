package com.sist.client;

//import java.awt.Color;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.table.*;
import java.util.*;
import java.text.*;

//사용자정의
import com.sist.vo.*;
import com.sist.manager.*;

public class BoardListPanel extends JPanel implements ActionListener{
	
	JLabel la,pageLa;
	JButton b1,b2,b3,b4;
	JTable table;
	DefaultTableModel model;
	
	ControlPanel cp;//화면변경==> JSP : include
	
	int curpage=1;
	int totalPage=0;
	BoardManager bm=new BoardManager();
	
	public BoardListPanel(ControlPanel cp) {
		//setBackground(Color.cyan);
		
		//화면변경 좌표값 저장
		this.cp=cp;
		
		//기본 테이블 형식
		String[] col={"번호","제목","이름","작성일","조회수"};
		String[][] row=new String[0][5];
		model=new DefaultTableModel(row,col)
		         //익명의 클래스 사용(오버라이딩)	
		        {
			//편집 방지를 해놔야함 [소스-오버라이드-iscell]
					@Override
					public boolean isCellEditable(int row, int column) {
						return false;
					}
				};
				
		table=new JTable(model);
		table.getTableHeader().setReorderingAllowed(false);//맨위에 목록 못움직이게 설정함
		table.setShowVerticalLines(false);//표에 세로선 안보이게함
		table.setRowHeight(58);//표에 height값 넓힘
		
		table.getColumn("번호").setPreferredWidth(30); //표에 항목별 width값 수정
		table.setFont(new Font("맑은 고딕",Font.PLAIN,14)); // 게시판 글들 폰트 크기
		table.getColumn("제목").setPreferredWidth(400);
		table.getColumn("이름").setPreferredWidth(100);
		table.getColumn("작성일").setPreferredWidth(150);
		table.getColumn("조회수").setPreferredWidth(50);
		table.getTableHeader().setPreferredSize(new Dimension(30,30)); // 방이름 탭 높이 
		JScrollPane js=new JScrollPane(table);
		
		//버튼 처리
		b1=new JButton("새글"); //이 버튼을 누르면 입력창으로 넘어가도록 해야함
		b1.setFont(new Font("맑은 고딕",Font.PLAIN,15)); // 새글 폰트 크기
		b2=new JButton("검색");
		b3=new JButton("이전");
		b3.setFont(new Font("맑은 고딕",Font.PLAIN,15)); // 이전 폰트 크기 
		b4=new JButton("다음");
		b4.setFont(new Font("맑은 고딕",Font.PLAIN,15)); // 다음 폰트 크기 
		la=new JLabel("자유게시판");
		pageLa=new JLabel("1 page / 1 pages");
		pageLa.setFont(new Font("맑은 고딕",Font.PLAIN,15)); // page 폰트 크기 
		
		//배치
		setLayout(null); //사용자 정의 배치
		la.setHorizontalAlignment(JLabel.CENTER);
		la.setFont(new Font("맑은 고딕",Font.BOLD,35));
		la.setBounds(320, 15, 1260, 50);
		add(la);
		
		b1.setBounds(1480, 75, 100, 30);
		add(b1);
		
		js.setBounds(320, 115, 1260, 610); // 번호,제목,이름,작성일,조회수 
		add(js);
		
		JPanel p=new JPanel();
		p.setFont(new Font("굴림체",Font.PLAIN,15)); // 페이지 쪽 폰트 크기
		p.add(b3);
		p.add(pageLa);
		p.add(b4);
		
		p.setBounds(600, 765, 710, 35);
		add(p);
		
		b1.addActionListener(this);
		b3.addActionListener(this);//이전 버튼
		b4.addActionListener(this);//다음 버튼
		
		boardList();
	}
	public void boardList() {
		//전체를 지우고
		for(int i=model.getRowCount()-1;i>=0;i--)
		{
			model.removeRow(i);
		}
		//새로운 내용 출력
		ArrayList<BoardVO> list=bm.boardListData(curpage);
		totalPage=bm.boardTotalPage();
		pageLa.setText(curpage+"page / "+totalPage+" pages");
		for(int i=list.size()-1;i>=0;i--)
    	{
    		BoardVO vo=list.get(i);
    		String[] data= {
    			String.valueOf(vo.getNo()),
    			vo.getSubject(),
    			vo.getName(),
    			new SimpleDateFormat("yyyy-MM-dd").format(vo.getRegdate()),
    			String.valueOf(vo.getHit())
    		};
    		
    		model.addRow(data);
    	}
	}
	
	//b1.addActionListener(this); b1을 누르면 this메소드(=지금오버라이딩중인메소드)를 호출해라
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==b1)//b1을 누르면?
		{
			cp.bip.tf1.setText("");
			cp.bip.tf2.setText("");
			cp.bip.tf3.setText("");
			cp.bip.ta.setText("");
			cp.card.show(cp, "insert");
		}
		else if(e.getSource()==b3)//이전 버튼
		{
			if(curpage>1)
			{
				curpage--;
				boardList();
			}
		}
		else if(e.getSource()==b4)//다음 버튼
		{
			if(curpage<totalPage)
			{
				curpage++;
				boardList();
			}
		}
	}

}
