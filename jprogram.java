/*<applet code="jprogram.class"
	height=500
	width=500></applet>*/
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class jprogram extends JApplet
{
	JLabel j;JButton b;
	public void init()
	{
		Container c=getContentPane();
		j=new JLabel("BHARAT");
		b=new JButton("Click this");
		b.setRolloverIcon(new ImageIcon("bharat.png"));
		b.setPressedIcon(new ImageIcon("bharat.png"));
		b.setSelectedIcon(new ImageIcon("bharat.png"));
		b.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				j.setIcon(new ImageIcon("bharat.png"));
				b.setEnabled(false);
			}
		});
		c.setLayout(new FlowLayout());
		c.add(b);
		c.add(j);
	}
}