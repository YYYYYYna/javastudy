package com.sist.client;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

//import java.awt.Color;

import javax.swing.*;

import com.sist.manager.FoodManager;
import com.sist.vo.FoodCategoryVO;

public class HomePanel extends JPanel implements ActionListener{
	
	JButton b1,b2,b3;
	PosterCard[] pcs=new PosterCard[12];
	FoodManager fm=new FoodManager();
	JPanel pan=new JPanel();//이미지 출력부
	
	public HomePanel() {
		//setBackground(Color.pink);
		
		JPanel p=new JPanel();
		p.setLayout(new GridLayout(1,3,20,20));
		b1=new JButton("믿고 보는 맛집 리스트");
		//이제 해당 버튼을 누르면 해당 맛집리스트를 출력하도록 구성
		b2=new JButton("지역별 인기 맛집");
		b3=new JButton("메뉴별 인기 맛집");
		p.add(b1);
		p.add(b2);
		p.add(b3);
		pan.setLayout(new GridLayout(4,3,5,5));//위아래 5간격으로 이미지 4줄에 3장씩 넣기
		
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
	}
	
	public void cardPrint(ArrayList<FoodCategoryVO> list)
	{
		int i=0;
		for(FoodCategoryVO vo:list)
		{
			pcs[i]=new PosterCard(vo);
			pan.add(pcs[i]);
			i++;
		}
	}
	//Label은 텍스트는 변환이 가능한데 image는 삭제하고 다시 넣어야함
	public void cardInit() 
	{
		pan.removeAll();//pan안에 있는 데이터 모두 제거
		pan.validate();//pan안에 있는 데이터 재배치
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==b1)
		{
			ArrayList<FoodCategoryVO> list=fm.foodCategoryData(1);
			cardInit();
			cardPrint(list);
		}
		else if(e.getSource()==b2)
		{
			ArrayList<FoodCategoryVO> list=fm.foodCategoryData(2);
			cardInit();
			cardPrint(list);
		}
		else if(e.getSource()==b3)
		{
			ArrayList<FoodCategoryVO> list=fm.foodCategoryData(3);
			cardInit();
			cardPrint(list);
		}
		
	}

}
