package com.sist.client;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import com.sist.vo.*;
import com.sist.manager.BoardManager;

public class BoardUpdatePanel extends JPanel implements ActionListener{
	ControlPanel cp;
    JLabel titleLa;
    JLabel la1,la2,la3,la4,la5;
    JTextField tf1,tf2;
    JPasswordField pf;
    JTextArea ta;
    JButton b1,b2;
    BoardManager bm=new BoardManager();
    public BoardUpdatePanel(ControlPanel cp)
    {
   	     this.cp=cp;
   	     titleLa=new JLabel("수정하기");
    	 titleLa.setFont(new Font("맑은 고딕",Font.BOLD,45));
    	 titleLa.setHorizontalAlignment(JLabel.CENTER);
    	 
    	 la1=new JLabel("이름");//<label for="name">이름</label>
    	 la2=new JLabel("제목");
    	 la3=new JLabel("내용");
    	 la4=new JLabel("비밀번호");
    	 
    	 //이부분이 hidden한거임
    	 la5=new JLabel("");
    	 la5.setVisible(false);
    	 
    	 tf1=new JTextField();//<input type=text>
    	 tf2=new JTextField();
    	 ta=new JTextArea();//<textarea></textarea>
    	 JScrollPane js=new JScrollPane(ta);
    	 pf=new JPasswordField();//<input type=password>
    	 
    	 b1=new JButton("        수정        ");//<input type=button>
    	 b2=new JButton("        취소        ");
    	 
    	 // 배치 
    	 setLayout(null);// css
    	 titleLa.setBounds(10, 15, 720, 60);
    	 titleLa.setHorizontalAlignment(JLabel.CENTER);
    	 titleLa.setFont(new Font("맑은 고딕",Font.BOLD,40)); // 보통의 글자크기 default 20
    	 titleLa.setBounds(610, 15, 700, 50);
	   	 add(titleLa);
	   	 
	    la1.setBounds(320, 125, 70, 30);
		la1.setFont(new Font("맑은 고딕",Font.BOLD,14));
		tf1.setBounds(400, 125, 1180, 30); // 이름입력칸
	   	 
		la2.setBounds(320, 165, 450, 30);
		la2.setFont(new Font("맑은 고딕",Font.BOLD,14));
		tf2.setBounds(400, 165, 1180, 30); // 제목입력칸
	   	 
		la3.setBounds(320, 205, 70, 30);
		la3.setFont(new Font("맑은 고딕",Font.BOLD,14));
		js.setBounds(400, 205, 1180, 500); // 글쓰기창
	   	 
		la4.setBounds(320, 715, 70, 30);
		la4.setFont(new Font("맑은 고딕",Font.BOLD,14));
		pf.setBounds(400, 715, 1180, 30); // 비번입력칸
	   	 
	   	 JPanel p=new JPanel();
	   	b1.setFont(new Font("맑은 고딕",Font.BOLD,15));
		b2.setFont(new Font("맑은 고딕",Font.BOLD,15));
		b1.setBackground(Color.GRAY);
		p.setLayout(new FlowLayout(FlowLayout.CENTER,30,5));
	   	 p.add(b1);
	   	 p.add(b2);
	   	p.setBounds(0, 755, 1920, 35);
	   	 add(la5);
	   	 // 추가
	   	 add(la1);add(tf1);
	   	 add(la2);add(tf2);
	   	 add(la3);add(js);
	   	 add(la4);add(pf);
	   	 add(p);
	   	 
	   	 b1.addActionListener(this);
	   	 b2.addActionListener(this);
    }
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==b2)
		{
			cp.card.show(cp, "detail");
		}
		else if(e.getSource()==b1)
		{
			String name=tf1.getText();
			String subject=tf2.getText();
			String content=ta.getText();
			String pwd=String.valueOf(pf.getPassword());
			if(pwd.trim().length()<1)//입력이 안되었다면?
			{
				//사용자 오류 발생 예외처리
				JOptionPane.showMessageDialog(this, "비밀번호를 입력하세요");//alert창 띄우는거임
				pf.requestFocus();
				return;
			}
			String no=la5.getText();
			BoardVO vo=new BoardVO();
			vo.setName(name);
			vo.setSubject(subject);
			vo.setContent(content);
			vo.setPwd(pwd);
			vo.setNo(Integer.parseInt(no));
			
			//BoardManager연결
			// 만약 웹이라면? sendRedirect("detail.jsp")
			String res=bm.boardUpdate(vo);
			if(res.equals("YES"))
			{
				pf.setText("");
				cp.card.show(cp, "board");
				cp.blp.boardList();
			}
			else if(res.equals("NO"))
			{
				JOptionPane.showMessageDialog(this, "비밀번호가 틀립니다.");
				pf.setText("");
				pf.requestFocus();
			}
			
		}
		
	}
}