package com.sist.client;
/*
 *    //Home : 들어가면 맛집 카테고리를 출력하도록 
 * 
 *    //검색
 * 
 *    //채팅
 * 
 *    //오늘의뉴스 => 오픈API생성
 * 
 *    //커뮤니티 => 파일입출력을 위해 실습진행

 *    => 각각 상단 버튼으로 구현할 예정임
 */

import javax.swing.*;
import java.awt.*;

public class MenuPanel extends JPanel{
	
	//**Panel하나가 홈페이지(아마HTML?) 하나라고 생각하면됨
	//**캡슐화를 하는건 데이터 관련 정보만 하면됨!!
	
	//**버튼을 만드는데 패키지가 달라지면 접근을 못할수도 있으니까 버튼은 꼭 public으로 만들기 , 버튼은 보안과 관련없으니까 ㄱㅊ
	
	//필드 "생성"
	public JButton b1,b2,b3,b4,b5;
	
	public MenuPanel() {
		//생성자 이용해서 버튼 "구현"
		b1=new JButton("HOME");
		b2=new JButton("맛집 검색");
		b3=new JButton("실시간 채팅");
		b4=new JButton("커뮤니티"); //파일입출력
		b5=new JButton("뉴스"); //오픈API생성
		
		//레이아웃 잡기
		setLayout(new GridLayout(5, 1,10,10)); //매뉴사이의 간격을 조정하는것...margin값 주는거임
		add(b1);add(b2);add(b3);add(b4);add(b5);
	}
	
	
}
