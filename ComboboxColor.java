import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class ComboboxColor extends JFrame implements ItemListener
{
	 JComboBox cb;
	Container c;
 	 ComboboxColor()
 	{
   	 c=getContentPane();
 	setSize(300,400);
 	
	setLayout(new FlowLayout());
	setVisible(true);
 	String color[]={"Red","Blue","Green"};
  	cb=new JComboBox(color);
	 c.add(cb);
	cb.addItemListener(this);
    	}
 public void itemStateChanged(ItemEvent e)
 {
	 if(e.getItem().equals("Red"))
	 {
 	 c.setBackground(Color.red);
	}
	if(e.getItem().equals("Blue"))
	 {
  	c.setBackground(Color.blue);
	}
	if(e.getItem().equals("Green"))
 	{
 	 c.setBackground(Color.green);
	}
}
public static void main(String arg[])
 {
 	new ComboboxColor();
}
}