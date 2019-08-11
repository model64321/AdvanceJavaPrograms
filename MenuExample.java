import java.awt.*;
import javax.swing.*;
class MenuExample extends JFrame
{
	MenuExample()
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
	
	JMenuItem ma1=new JMenuItem("New          Ctrl+N ");
	m1.add(ma1);
	JMenuItem ma2=new JMenuItem("Open       Ctrl+O");
	m1.add(ma2);
	JMenu ma3=new JMenu("Option");
	m2.add(ma3);
	JMenuItem ma4=new JMenuItem("Copy");
	ma3.add(ma4);

	
	
	}
	public static void main(String args[])
	{
		new MenuExample();
	}

}