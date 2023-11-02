package com.sist.exam;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class MainClass_3 extends JFrame implements ActionListener{

	JProgressBar[] bar=new JProgressBar[5];
	JButton b1,b2;
	static int rank;
	BarThread[] bt=new BarThread[5];
	public MainClass_3()
	{
		b1=new JButton("시작");
		b2=new JButton("종료");
		
		JPanel p=new JPanel();
		p.setLayout(new GridLayout(5,1,5,5));
		Color[] color={Color.cyan,Color.yellow,
				Color.pink,Color.orange,Color.magenta};
		for(int i=0;i<5;i++)
		{
			bar[i]=new JProgressBar();
			bar[i].setMinimum(0);
			bar[i].setMaximum(100);
			bar[i].setStringPainted(true);//1~100까지 진행도 보여주는창
			bar[i].setForeground(color[i]);
			bar[i].setBackground(Color.white);
			p.add(bar[i]);
		}
		
		JPanel p2=new JPanel();
		p2.add(b1);p2.add(b2);
		
		add("Center",p);
		add("South",p2);
		
		setSize(640,350);
		setVisible(true);
		
		b1.addActionListener(this);
		b2.addActionListener(this);
	}
	public static void main(String[] args) {
		new MainClass_3();
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==b2)
		{
			System.exit(0);
		}
		else if(e.getSource()==b1)
		{
			for(int i=0;i<5;i++)
			{
				bt[i]=new BarThread(i);
				bt[i].start();
			}
		}
		
	}
	/*
	 *   내부클래스
	 *   1. 멤버클래스 : 쓰레드,서버개발
	 *      class A
	 *      {
	 *         class B
	 *         {
	 *            A가 가지고 있는 모든 데이터 공유
	 *         }
	 *      }
	 *   2. 익명의 클래스 : 오버라이딩 없이 상위클래스의 메소드 사용이 가능
	 *   
	 *   3. 지역클래스 : 자주사용하지않음
	 *      class A
	 *      {
	 *         public void disp()
	 *         {
	 *            class B
	 *            {
	 *               //이부분
	 *            }
	 *         }
	 *      }
	 */
	//Thread => bar를 이용해야하기 때문에 멤버클래스로 사용함(=클래스안에 클래스) : 객체생성 필요없음
	//윈도우가 가지고 있는 모든 데이터를 사용할수 있게됨 객체생성없이 => 내부클래스(서버개발,빅데이터개발,쓰레드개발 에 주로쓰임)
	class BarThread extends Thread{
		//프로그래스바 한개만 동작하도록
		int index;
		public BarThread(int index)
		{
			this.index=index; //쓰레드
		}
		public void run()
		{
			for(int i=0;i<=100;i++)
			{
				bar[index].setValue(i);
				int a=(int)(Math.random()*300);//일시정지
				try {
					Thread.sleep(a);
				}catch(Exception ex) {}
				if(i==100)
				{
					rank++;
					interrupt();
				}
			}
			System.out.println((index+1)+"번째:"+rank+"등");
		}
	}

}
