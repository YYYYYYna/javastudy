package com.sist.exception;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

/*
 *    예외처리
 *      = 예외복구 : try-catch
 *           try => 정상수행문장
 *           catch => 에러문장 대체수행문장
 *                    1)확인 => getMessage()
 *                          => printStackTrace()
 *                    2)복구 후 처음부터 수행
 *                 : 여러번 사용 가능
 *                 : 순서가 존재한다(계층구조)
 *           
 *      = 예외회피 : throws
 *      
 */

//UpDown게임만들기
//1. 난수발생
//2. 사용자입력값받기
//= 정수아닌값 입력시 예외처리 해야함
//3. 값 비교
//4. 결과값 출력
public class MainClass_4 extends JFrame implements ActionListener{
	                                                //버튼관련
	JTextField tf;//=문자열입력
	JTextArea ta; //=도스창:결과값을 여기에 출력한다는뜻
	JButton b1,b2;
	
	//1. 난수발생
	int com; //0이니까 초기값 줄필요 없음
	
	//b1,b2에 초기값 줘야함 => 생성자사용
	public MainClass_4() {
		
		tf=new JTextField(10);//10글자만 입력하도록
		tf.setEditable(false);//일단 버튼 누르기 전이니까 비활성화 시킴
		
		ta=new JTextArea();
		
		JScrollPane js=new JScrollPane(ta);//스크롤바 생성
		
		b1=new JButton("Start");//버튼생성
		b2=new JButton("Exit");//버튼생성
		
		//[윈도우배치]
		JPanel p=new JPanel();//패널로 입력창과 버튼을 1열로 묶어줌
		p.add(tf);
		p.add(b1);
		p.add(b2);
		
		add("North",p);
		add("Center",js);
		
		setSize(300,450);
		setVisible(true);
		
		//버튼 클릭시에 => actionPerfomed 호출 요청
		//이벤트 처리
		b1.addActionListener(this); //b1에서 actionPerfomed 호출 요청
		//
		b2.addActionListener(this); //b2에서 actionPerfomed 호출 요청
		
		tf.addActionListener(this); //엔터치면 실행되는 부분
		
	}
	public static void main(String[] args) {
		new MainClass_4();

	}

	//버튼처리, 엔터처리 인터페이스 불러온거 메소드 오버라이딩
	@Override
	public void actionPerformed(ActionEvent e) {
		
		//b1을 누르면 여기서 처리
		if(e.getSource()==b1){
			com=(int)(Math.random()*100+1);
			b1.setEnabled(false);//b1버튼을 누르면
			tf.setEnabled(true);
			tf.requestFocus();//커서(포커스)를 올려주는 기능
			ta.append("게임을 시작합니다.\n");
		}
		//b2을 누르면 종료처리시킴
		if(e.getSource()==b2) {
			dispose();//메모리 회수후
			System.exit(0);//종료하기
		}
		
		//엔터를 눌러서 게임을 진행하는 경우
		if(e.getSource()==tf) {
			
			//숫자 누른거 아니라서 오류난 경우
			try {
				//정상수행
				String num=tf.getText();//텍스트 필드에 입력값 읽어오는거임
				int user=Integer.parseInt(num);
				
				//이제 user값이 정상입력된 경우
				if(user<1 || user>100) {
					ta.append("1~100까지만 입력이 가능합니다.\n");
				}
				else{
					if(com>user) {
						ta.append("입력값보다 큰 값을 입력하세요\n");
					}
					else if(com<user) {
						ta.append("입력값보다 작은 값을 입력하세요\n");
					}
					else {
						//정상종료시점
						ta.append("Game Over\n"); 
						
						//값을 맞추면 다시 시작하도록 만듬
						tf.setText("");
						b1.setEnabled(true);
						tf.setEnabled(false);
					}
				}
				tf.setText("");//엔터치면 입력되었던값을 삭제함
				
			}catch(Exception ex)
			{
				//이제 user값이 잘못입력된 경우
				//에러발생 복구 => 잘못입력하면 알려주고 try문으로 돌리면됨
				
				//[오류안내부분]
				JOptionPane.showInternalMessageDialog(this, "1~100까지 정수만 입력하세요");
				
				//[복구부분]
				tf.setText("");
				tf.requestFocus();
				
			}
		}
														
	}

}
