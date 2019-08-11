import java.awt.*;
import javax.swing.*;
class MenuExample1 extends JFrame
{
	MenuExample1()
	{
	
	setSize(300,300);
	setVisible(true);
	JMenuBar mb= new JMenuBar() ;
	setJMenuBar(mb);
	JMenu m1= new JMenu("file");
	JMenu m2= new JMenu("edit");
	JMenu m3= new JMenu("format");
	JMenu m4= new JMenu("view");
	JMenu m5= new JMenu("Help");
	
	mb.add(m1);
	m1.addSeparator();
	
	mb.add(m2);
	m2.addSeparator();
	
	mb.add(m3);
	m3.addSeparator();
	
	mb.add(m4);
	m4.addSeparator();
	
	mb.add(m5);
	m5.addSeparator();
	
	

	
	
	}
	public static void main(String args[])
	{
		new MenuExample1();
	}

}