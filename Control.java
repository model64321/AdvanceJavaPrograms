import java.awt.*;
import javax.swing.*;
public class Control extends JFrame
{
 	JFrame f;
 	JLabel l1,l2,l3,l4,l5,l6;
	 JTextField t1;
 	JTextArea ta1;
 	JComboBox cb;
 	JRadioButton rb1;
 	JButton b1;
 	JList j1;
 	public Control()
	{
		  f=new JFrame("Controls ");
		  l1=new JLabel("Textarea :-");
 		 l2=new JLabel("Textfield:-");
 		 l3=new JLabel("combo box :-");
 		 l4=new JLabel("radio button :-");
		  l5=new JLabel(" button:-");
		  l6=new JLabel("list  :-");
		  rb1=new JRadioButton("radio button1");
		 String[] colors={"Red","Blue","Green","Yellow"};
		 cb=new JComboBox(colors);
 		j1=new JList(colors);
 		 t1=new JTextField(20);
  		ta1=new JTextArea(20,20);
  		b1=new JButton("button");
  		JPanel p=new JPanel();
		  p.setLayout(null);
		  l1.setBounds(80,80,150,30);
		  l2.setBounds(80,130,150,30);
		  l3.setBounds(80,200,150,30);
 		 l4.setBounds(80,240,150,30);
  		l5.setBounds(80,280,150,30);
 		 l6.setBounds(80,320,150,30);
 		 ta1.setBounds(250,80,200,25);
 		 t1.setBounds(250,130,200,25);
  		cb.setBounds(250,200,200,25);
  		rb1.setBounds(250,240,200,25);
		  b1.setBounds(250,280,200,25);
  		j1.setBounds(250,320,120,100);
  		 p.add(l1);
 		p.add(l2);
		 p.add(l3);
		 p.add(l4);
		 p.add(l5);
 		p.add(l6);
		 p.add(t1);
 		p.add(ta1);
	 	p.add(cb);
		 p.add(rb1);
 		p.add(b1);
 		p.add(j1);
		 f.add(p,BorderLayout.CENTER);
	 	f.add(p);
		 f.setSize(650,780);
 		f.setVisible(true);
 
 }
  public static void main(String args[])
 	{
 		  new Control(); 
 	}

}
