package com.sist.client;

import java.awt.CardLayout;

//다른 패널들을 한번에 관리하는 곳이 여기 control패널

//new로 생성하면 계속 매뉴 이동마다 새로운 control창이 만들어지는거니까
//화면 이동 요청시 해당 패널(=레이어)을 보여주는거임
//==> 이 (보여주는)기능을 컨트롤 패널에서 해주는거임
//==> 그리고 (현재 요청한 창=this) 임

import javax.swing.*;

public class ControlPanel extends JPanel{
	
	//여기서 새로 하나 만들면
	public HomePanel hp;
	public ChatPanel cp=new ChatPanel();
	public BoardListPanel blp;
	public NewsPanel np=new NewsPanel();
	public BoardInsertPanel bip;
	public BoardDetailPanel bdp;
	public BoardDeletePanel bdel;
	public BoardUpdatePanel bup;
	public MovieDetailPanel mdp;
	public MovieFindPanel mfp;
	
	
	public CardLayout card=new CardLayout();
	
	//이게 MVC구조라 하시네용... 
	//C(control)=>해당클래스를찾아서처리후화면이동
	//V(view)=>보여주는Panel역할             ==> 프론트
	//M(manager)=>현재manager와같음         ==> 백엔드
	public ControlPanel() {
		//여기서 메모리 할당하는거 잊지마삼.....
		blp=new BoardListPanel(this); //화면 이동
		bip=new BoardInsertPanel(this); // 취소하거나 하면 다시 돌아와야함
		bdp=new BoardDetailPanel(this);
		bdel=new BoardDeletePanel(this);
		bup=new BoardUpdatePanel(this);
		mdp=new MovieDetailPanel(this);
		mfp=new MovieFindPanel(this);
		hp=new HomePanel(this);
		setLayout(card);
		add("home",hp);
		add("chat",cp);
		add("board",blp);
		add("news",np);
		add("insert",bip); 
		add("detail",bdp); // 화면 이동
		add("delete",bdel); // delete 이름을 주면 bdel로 화면보여줘
		add("update",bup);
		add("mdetail",mdp);
		add("find",mfp);
		// Spring => @RequestMapping("update.jsp") 
		// NodeJS => app.get("update")
	}

}
