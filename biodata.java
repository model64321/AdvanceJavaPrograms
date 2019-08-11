import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;
public class Biodata extends JFrame 
{
  	JFrame f;
 	JLabel l,l1,l2,l3,l4,l5,l6;
	 JTextField t1,t2,t3,t4,t5,t6,t7,t8,t9;
	 JButton b1,b2;
 	ButtonGroup bg1;
 	public Biodata()
	 {
	  f=new JFrame("BIODATA");
 	 l=new JLabel("BioData");
	  l.setFont(new Font("Algerian",Font.ITALIC,30));
	  l1=new JLabel("Name                            :");
  	l2=new JLabel("Address                       :");
  	l3=new JLabel("Contact Number         :");
  	l4=new JLabel("E-Mail Address           :");
  	l5=new JLabel("Date OF Birth               :");
 	 l6=new JLabel("Qualification                :");
 	 t1=new JTextField(20);t2=new JTextField(20); t3=new JTextField(20);
 	 t4=new JTextField(20);t5=new JTextField(20); t6=new JTextField(20);
  	b1=new JButton("Submit");b2=new JButton("Cancel");
  	JPanel p=new JPanel();
	p.setBackground(Color.PINK);
	  p.setLayout(null);
	  l.setBounds(200,30,200,50);     l1.setBounds(80,80,150,30);       l2.setBounds(80,130,150,30);
  	l3.setBounds(80,180,150,30);   l4.setBounds(80,220,150,30);     l5.setBounds(80,260,150,30);
  	l6.setBounds(80,300,150,30);    t1.setBounds(250,80,200,25);     t2.setBounds(250,130,200,25);
 	 t3.setBounds(250,180,200,25);  t4.setBounds(250,220,200,25);  t5.setBounds(250,260,200,25);
  	t6.setBounds(250,300,200,25) ; b1.setBounds(200,400,100,30);  b2.setBounds(350,400,100,30);
  	p.add(l); p.add(l1); p.add(l2); p.add(l3); p.add(l4); p.add(l5); p.add(l6); p.add(t1); p.add(t2); p.add(t3); p.add(t4); p.add(t5); p.add(t6); p.add(b1); p.add(b2);
  	f.add(p,BorderLayout.CENTER);   f.add(p);   f.setSize(650,780);   f.setVisible(true);
  	f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
   }
      public static void main(String args[])
{
      Biodata b=new Biodata(); 
}
}
 

