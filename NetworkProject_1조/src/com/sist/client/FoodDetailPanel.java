package com.sist.client;
//상세보기
import javax.swing.*;
import javax.swing.table.*;
import java.awt.*;
import java.awt.event.*;
import java.lang.reflect.Array;
import java.util.*;
import com.sist.vo.*;
import com.sist.common.ImageChange;
import com.sist.manager.*;
import java.net.*;
public class FoodDetailPanel extends JPanel implements ActionListener{
	
	JLabel posterLa;
	JLabel nameLa,scoreLa;
	JLabel addressLa,phoneLa,typeLa;
	JLabel timeLa,parkingLa,priceLa;
	JLabel menuLa;
	JButton b;//다시 목록으로 돌아가게 하는 버튼
	ControlPanel cp;
	
	JLabel la1,la2,la3,la4,la5,la6,la7,la8;
	
	public FoodDetailPanel(ControlPanel cp)
	{
		this.cp=cp;
  	  posterLa=new JLabel();
  	  nameLa=new JLabel();
  	  scoreLa=new JLabel();
  	  addressLa=new JLabel();
  	  phoneLa=new JLabel();
  	  typeLa=new JLabel();
  	  timeLa=new JLabel();
  	  parkingLa=new JLabel();
  	  priceLa=new JLabel();
  	  menuLa=new JLabel();
  	  
  	  b=new JButton("목록");
  	  la1=new JLabel("주소");
  	  la2=new JLabel("전화");
  	  la3=new JLabel("음식종류");
  	  la4=new JLabel("가격대");
  	  la5=new JLabel("주차");
  	  la6=new JLabel("영업시간");
  	  la7=new JLabel("메뉴");
  	  la8=new JLabel("평점");
  	  
  	  // 배치 
  	  setLayout(null);
  	  posterLa.setBounds(320, 125, 300, 400);
  	  add(posterLa);
  	  
  	  ////제목
  	  nameLa.setBounds(700, 125, 700, 45);
  	  nameLa.setFont(new Font("맑은 고딕",Font.BOLD,30));
  	  add(nameLa);
  	  
      ////주소
  	  la1.setBounds(700, 200, 30, 35);
  	  la1.setFont(new Font("맑은 고딕",Font.BOLD,13));
  	  la1.setForeground(Color.gray);
  	  addressLa.setBounds(770, 200, 400, 35);
  	  addressLa.setFont(new Font("맑은 고딕",Font.PLAIN,13));
  	  add(la1);add(addressLa);
  	  
  	  ////전화
  	  la2.setBounds(700, 240, 70, 35);
  	  la2.setFont(new Font("맑은 고딕",Font.BOLD,13));
	  la2.setForeground(Color.gray);
  	  phoneLa.setBounds(770, 240, 400, 35);
  	  phoneLa.setFont(new Font("맑은 고딕",Font.PLAIN,13));
  	  add(la2);add(phoneLa);
  	  
  	  ////음식종류
  	  la3.setBounds(700, 280, 70, 35);
  	  la3.setFont(new Font("맑은 고딕",Font.BOLD,13));
	  la3.setForeground(Color.gray);
  	  typeLa.setBounds(770, 280, 400, 35);
  	  typeLa.setFont(new Font("맑은 고딕",Font.PLAIN,13));
  	  add(la3);add(typeLa);
  	  
  	  ////가격대
  	  la4.setBounds(700, 320, 70, 35);
      la4.setFont(new Font("맑은 고딕",Font.BOLD,13));
	  la4.setForeground(Color.gray);
  	  priceLa.setBounds(770, 320, 400, 35);
  	  priceLa.setFont(new Font("맑은 고딕",Font.PLAIN,13));
  	  add(la4);add(priceLa);
  	  
      ////평점
  	  la8.setBounds(1100, 200, 70, 35);
  	  la8.setFont(new Font("맑은 고딕",Font.BOLD,13));
	  la8.setForeground(Color.gray);
  	  scoreLa.setBounds(1170, 200, 100, 35);
  	  scoreLa.setFont(new Font("맑은 고딕",Font.PLAIN,13));
  	  add(la8);add(scoreLa);
  	  
  	  ////주차
  	  la5.setBounds(1100, 240, 70, 35);
  	  la5.setFont(new Font("맑은 고딕",Font.BOLD,13));
	  la5.setForeground(Color.gray);
  	  parkingLa.setBounds(1170, 240, 400, 35);
  	  parkingLa.setFont(new Font("맑은 고딕",Font.PLAIN,13));
  	  add(la5);add(parkingLa);
  	  
  	  ////영업시간
  	  la6.setBounds(1100, 280, 70, 35);
  	  la6.setFont(new Font("맑은 고딕",Font.BOLD,13));
	  la6.setForeground(Color.gray);
  	  timeLa.setBounds(1170,280, 400, 35);
  	  timeLa.setFont(new Font("맑은 고딕",Font.PLAIN,13));
  	  add(la6);add(timeLa);
  	  
  	  ////메뉴
  	  la7.setBounds(1100, 320, 70, 35);
  	  la7.setFont(new Font("맑은 고딕",Font.BOLD,13));
	  la7.setForeground(Color.gray);
  	  menuLa.setBounds(1170, 320, 400, 35);
  	  menuLa.setFont(new Font("맑은 고딕",Font.PLAIN,13));
  	  add(la7);add(menuLa);
  	  
  	  ////뒤로버튼
  	  b.setBounds(1000, 480, 100, 35);
  	  add(b);
  	  
  	  b.addActionListener(this);
		
	}
	
	public void foodPrint(FoodHouseVO vo)
	{
		try {
			nameLa.setText(vo.getName());
			scoreLa.setText(String.valueOf(vo.getScore()));
			addressLa.setText(vo.getAddress());
			phoneLa.setText(vo.getPhone());
			typeLa.setText(vo.getType());
			timeLa.setText(vo.getTime());
			parkingLa.setText(vo.getParking());
			menuLa.setText(vo.getMenu());
			
			//la8.setText("<html>"+"<p>"+"<font color=\"gray\">"+la8+"</font>"+"</p>"+"</html>");
			
			URL url=new URL(vo.getPoster());
  		  Image image=ImageChange.getImage(new ImageIcon(url), 300, 500);
  		  posterLa.setIcon(new ImageIcon(image));
		}catch(Exception ex){}
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==b)
		{
			cp.card.show(cp, "catefood");
		}
		
	}
}
