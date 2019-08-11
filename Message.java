import java.applet.Applet;
import java.awt.*;
/*<applet code=Message width=400 height=400>
</applet>*/
public class Message extends Applet
{
	String msg;
	
	public void init()
	{
		Color c=new Color(100,122,223);
		setBackground(c);
		setForeground(Color.yellow);
		setFont(new Font("Arial Black",Font.BOLD,20));
	}
	
	public void paint(Graphics g)
	{
	
		msg="Sahil";
		g.fillOval(155,155,200,200);
		g.setColor(Color.pink);
		g.fillRect(200,200,100,100);
		g.setColor(Color.black);
		g.drawString(msg,220,250);
	}
}