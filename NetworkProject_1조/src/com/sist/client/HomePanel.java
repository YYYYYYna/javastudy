package com.sist.client;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;

//import java.awt.Color;

import javax.swing.*;

import com.sist.manager.*;
import com.sist.vo.FoodCategoryVO;
import com.sist.vo.FoodHouseVO;

public class HomePanel extends JPanel implements ActionListener,MouseListener{
	
	JButton b1,b2,b3;
	PosterCard[] pcs=new PosterCard[12];
	FoodManager fm=new FoodManager();
	JPanel pan=new JPanel();//이미지 출력부
	ControlPanel cp;
	
	public HomePanel(ControlPanel cp) {
		
		this.cp=cp;
		
		//setBackground(Color.pink);
		
		JPanel p=new JPanel();
		
		p.setLayout(new GridLayout(1,3,20,20));
		
		b1=new JButton("예매순위");
		//이제 해당 버튼을 누르면 해당 맛집리스트를 출력하도록 구성
		b2=new JButton("박스오피스");
		b3=new JButton("OTT");
		p.add(b1);
		p.add(b2);
		p.add(b3);
		pan.setLayout(new GridLayout(2,5,0,0));//위아래 5간격으로 이미지 5줄에 3장씩 넣기
		
		//배치
		setLayout(new BorderLayout());
		add("North",p);
		add("Center",pan);
		b1.setPreferredSize(new Dimension(300,45));
		b2.setPreferredSize(new Dimension(300,45));
		b3.setPreferredSize(new Dimension(300,45));
		
		//액션
		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
		
		/*
		//마우스
		for(int i=0;i<pcs.length;i++)
		{
			if(pcs[i]!=null)
			{
				pcs[i].addMouseListener(this);
			}
		}
		*/
	}
	
	public void cardPrint(ArrayList<FoodCategoryVO> list)
	{
		int i=0;
		for(FoodCategoryVO vo:list)
		{
			pcs[i]=new PosterCard(vo);
			pan.add(pcs[i]);
			pcs[i].addMouseListener(this);
			i++;
			
		}
	
	}
	//Label은 텍스트는 변환이 가능한데 image는 삭제하고 다시 넣어야함
	public void cardInit(ArrayList<FoodCategoryVO> list) 
	{
		
		for(int i=0;i<list.size();i++)
		{
			pcs[i].poLa.setIcon(null);
			pcs[i].tLa.setText("");
		}
		
		
		pan.removeAll();//pan안에 있는 데이터 모두 제거
		pan.validate();//pan안에 있는 데이터 재배치
		//pan.repaint();
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==b1)
		{
			ArrayList<FoodCategoryVO> list=fm.foodCategoryData(1);
			cardInit(list);
			cardPrint(list);
		}
		else if(e.getSource()==b2)
		{
			ArrayList<FoodCategoryVO> list=
					fm.foodCategoryData(2);
			   
			   FoodCategoryVO fvo=
					   new FoodCategoryVO();
			   fvo.setPoster("c:\\javaDev\\def.png");
			   fvo.setTitle("");
			   for(int j=0;j<6;j++)
			   {
				   list.add(fvo);
			   }
			cardInit(list);
			cardPrint(list);
		}
		else if(e.getSource()==b3)
		{
			ArrayList<FoodCategoryVO> list=fm.foodCategoryData(3);
			cardInit(list);
			cardPrint(list);
		}
		
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		for(int i=0;i<pcs.length;i++)
		{
			if(e.getSource()==pcs[i])
			{
				if(e.getClickCount()==2)//더블클릭하면
				{
					String title=pcs[i].tLa.getText();
					FoodCategoryVO vo=fm.categoryInfoData(title);
					cp.fcp.la1.setText(vo.getTitle());//카테고리 정보 가져오고
					cp.fcp.la2.setText(vo.getSubject());
					ArrayList<FoodHouseVO> list=fm.foodHouseListData(vo.getCno());
					cp.fcp.foodPrint(list);//해당 리스트 출력함
					cp.card.show(cp, "catefood");
				}
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
