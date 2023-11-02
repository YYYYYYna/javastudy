package com.sist.client;
import java.awt.*;
import javax.swing.*;
import java.net.*;

import com.sist.common.ImageChange;
import com.sist.vo.*;
public class PosterCard extends JPanel{
	
	JLabel poLa=new JLabel();
	JLabel tLa=new JLabel();
	public PosterCard(MovieReservationVO vo)
	{
		//배치
		setLayout(null);
		poLa.setBounds(5, 5, 365, 400);
		tLa.setBounds(5, 5, 365, 400);
		
		add(poLa);
		add(tLa);
		
		try {//URL주소 사용해서 try-catch 사용한듯
			if(vo.getImage()!=null)
			{
				URL url=new URL(vo.getImage()); // 이미지
				Image image=ImageChange.getImage(new ImageIcon(url), 365, 400); // 이미지 크기를 고정
				poLa.setIcon(new ImageIcon(image));
			}
			tLa.setText(vo.getTitle());
		}catch(Exception ex) {}
	}
}
