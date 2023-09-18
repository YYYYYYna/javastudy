import javax.swing.*;
import java.awt.*;
public class GameView extends JPanel{
   Image back,star;
   int x=20,y=560;
   public GameView()
   {
	   back=Toolkit.getDefaultToolkit().getImage("c:\\javaDev\\back.jpg");
	   star=Toolkit.getDefaultToolkit().getImage("c:\\javaDev\\star.gif");
   }
   public void paint(Graphics g)
   {
	   g.drawImage(back,0,0,getWidth(),getHeight(),this);
	   g.drawImage(star,x,y,100,100,this);
   }
}