import javax.swing.*;
import javax.swing.event.*;
import java.awt.*;

class JTabbedPaneEx extends JFrame
{
	JTabbedPaneEx(){
		JFrame jf=new JFrame();
		JPanel p1=new JPanel();
		JPanel p2=new JPanel();
		JPanel p3=new JPanel();
		JTabbedPane jtb=new JTabbedPane();
		jtb.add("1", p1);
		jtb.add("2", p2);
		jtb.add("3", p3);
		jf.add(jtb);

		Label l1=new Label("You're on 1st tab", JLabel.CENTER);
		Label l2=new Label("You're on 2nd tab", JLabel.CENTER);
		Label l3=new Label("You're on 3rd tab", JLabel.CENTER);

		p1.add(l1);
		p2.add(l2);
		p3.add(l3);

		jf.setVisible(true);
		jf.setSize(300, 300);
	}
	public static void main(String a[]){ new JTabbedPaneEx(); }
}