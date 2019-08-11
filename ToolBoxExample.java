import javax.swing.*;
import java.awt.*;
import java.awt.event.*; 

class ToolBoxExample extends JFrame implements ActionListener,ItemListener
{
	JButton b1=new JButton("First Button",new ImageIcon("Koal.jpg"));
	JButton b2=new JButton("Second Button",new ImageIcon("Koal.jpg"));
	JComboBox cb=new JComboBox();
	JLabel l=new JLabel();
	public void ToolBoxExample()
	{	
		setSize(300,300);
		setVisible(true);
		Container op=getContentPane();
		JToolBar jbb=new JToolBar();
		b1.addActionListener(this);
		b2.addActionListener(this);
		cb.addItem("One");
		cb.addItem("two");
		cb.addItem("Three");
		cb.addItem("Four");
		op.add(jbb);
		jbb.add(b1);
		jbb.add(b2);
		jbb.addSeparator();
		jbb.add(cb);
	}
	public void actionPerformed(ActionEvent e)
	{
		if(e.getSource()==b1)
		{	
			l.setText("You have Pressed Button 1");
		}
		else
		{
			l.setText("You have Pressed Button 2");	
		}

	}

	public void itemStateChanged(ItemEvent e1)
	{
		String str="";
		if(e1.getStateChange()==ItemEvent.SELECTED)
		{
			str +="Selected"+(String)e1.getItem();
		}
		else
		{
			str ="Deselected"+(String)e1.getItem();	
		}
		l.setText(str);
	}
	public static void main(String args[])
	{
	ToolBoxExample t=new ToolBoxExample();
	t.ToolBoxExample();
	}
}
