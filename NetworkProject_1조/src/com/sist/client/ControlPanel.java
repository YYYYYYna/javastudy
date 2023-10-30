package com.sist.client;


import java.awt.CardLayout;

//다른 패널들을 한번에 관리하는 곳이 여기 control패널

//new로 생성하면 계속 매뉴 이동마다 새로운 control창이 만들어지는거니까
//화면 이동 요청시 해당 패널(=레이어)을 보여주는거임
//==> 이 (보여주는)기능을 컨트롤 패널에서 해주는거임
//==> 그리고 (현재 요청한 창=this) 임

import javax.swing.*;

public class ControlPanel extends JPanel{
	
	public HomePanel hp=new HomePanel();
	public ChatPanel cp=new ChatPanel();
	public BoardListPanel blp;
	public NewsPanel np=new NewsPanel();
	public BoardInsertPanel bip;
	
	public CardLayout card=new CardLayout();
	public ControlPanel() {
		blp=new BoardListPanel(this); //화면 이동
		bip=new BoardInsertPanel(this);
		setLayout(card);
		add("home",hp);
		add("chat",cp);
		add("board",blp);
		add("news",np);
		add("insert",bip);
	}

}
