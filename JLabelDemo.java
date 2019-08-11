 12:02 AM 01-Jan-07/*<applet code="JLabelDemo.class"
	height=500
	width=500></applet>*/
import javax.swing.*;
import java.awt.*;

public class JLabelDemo extends JApplet
{
	public void init()
	{
		Container c=getContentPane();
		ImageIcon i=new ImageIcon("a.jpg");
		JLabel j=new JLabel("BHARAT", i, JLabel.CENTER);
		c.add(j);
		c.setVisible(true);
	}
}