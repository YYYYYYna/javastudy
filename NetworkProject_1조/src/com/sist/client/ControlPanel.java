package com.sist.client;

import java.awt.CardLayout;

//다른 패널들을 한번에 관리하는 곳이 여기 control패널

import javax.swing.*;

public class ControlPanel extends JPanel{
	
	public HomePanel hp=new HomePanel();
	public ChatPanel cp=new ChatPanel();
	public BoardListPanel blp=new BoardListPanel();
	public NewsPanel np=new NewsPanel();
	
	public CardLayout card=new CardLayout();
	public ControlPanel() {
		setLayout(card);
		add("home",hp);
		add("chat",cp);
		add("board",blp);
		add("news",np);
	}

}
