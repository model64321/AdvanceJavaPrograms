import javax.swing.*;
import java.awt.*;
public class PanelExp  
{
	PanelExp()
	{
	 	JFrame f=new JFrame("PanelExp");
		JPanel p=new JPanel();
		p.setBounds(40,80,200,200);
		p.setBackground(Color.ORANGE);
		JButton b1=new JButton("button1");
		b1.setBounds(100,100,80,30);
		b1.setBackground(Color.CYAN);
		JButton b2=new JButton("button2");
		b2.setBounds(100,100,80,30);
		b2.setBackground(Color.CYAN);
		p.add(b1);
		p.add(b2);
		f.add(p);
		f.setSize(300,400);
		f.setLayout(null);
		f.setVisible(true);
	}
	public static void main(String args[])
	{
		new PanelExp();	
	}
}