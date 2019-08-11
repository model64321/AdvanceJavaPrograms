import java.awt.*;
import javax.swing.*;

public class JTabbedExample extends JFrame
{

	
	
	JTabbedExample()
	{
			JFrame f =new JFrame("JTabbedPane");
			JPanel p1=new JPanel();
			JPanel p2=new JPanel();
			JPanel p3=new JPanel();
			
			String colors []={"Red","Green","Blue"};
			JList list=new JList(colors);
			
			String fruits []={"Banana","Apple","Orange"};
			JComboBox cb=new JComboBox(fruits);
			
			JButton b1=new JButton("A");
			JButton b2=new JButton("B");
			JButton b3=new JButton("C");
			
			p1.add(list);
			p2.add(cb);
			p3.add(b1);p3.add(b2);p3.add(b3);
			
			JTabbedPane j=new JTabbedPane();
			j.add(p1);j.add("Fruits",p2);j.add(p3);
			f.add(j);
			f.setSize(400,400);
			f.setVisible(true);
			
	}		
			public static void main(String args []){	
				
					new JTabbedExample();
			}
	
	


}