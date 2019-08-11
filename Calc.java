import java.awt.*;
import java.awt.event.*;
import java.applet.Applet;
/*<applet code=Calc width=400 height=400>
</applet>*/
public class Calc extends Applet implements ActionListener
{
	Button b1,b2,b3,b4;
	Label l1,l2,l3;
	TextField t1,t2,t3;
	
	public void init()
	{
		setLayout(new FlowLayout());
		l1=new Label("First number ");
		l2=new Label("Second number ");
		l3=new Label("Result");
		
		t1=new TextField(20);
		t2=new TextField(20);
		t3=new TextField(20);
		
		b1=new Button("Add");
		b2=new Button("Subtract");
		b3=new Button("Multiply");
		b4=new Button("Divide");
		
		add(l1);
		add(t1);
		add(l2);
		add(t2);
		add(l3);
		add(t3);
		add(b1);
		add(b2);
		add(b3);
		add(b4);
		b1.addActionListener(this);
		b1.setBackground(Color.blue);
		//b1.setFont(new Font("Monotype Corsiva",Font.ITALIC,20));
		b2.addActionListener(this);
		b2.setBackground(Color.red);
		b3.addActionListener(this);
		b3.setBackground(Color.yellow);
		b4.addActionListener(this);
		b4.setBackground(Color.orange);
		
	}
	
	public void actionPerformed(ActionEvent e)
	{
	
		int n1=Integer.parseInt(t1.getText());
		int n2=Integer.parseInt(t2.getText());
		
		if(e.getSource()==b1)
		{
			int r=n1+n2;
			t3.setText(String.valueOf(r));
		}
		
		if(e.getSource()==b2)
		{
			int r=n1-n2;
			t3.setText(String.valueOf(r));
		}
		
		if(e.getSource()==b3)
		{
			int r=n1*n2;
			t3.setText(String.valueOf(r));
		}
		
		if(e.getSource()==b4)
		{
			int r=n1/n2;
			t3.setText(String.valueOf(r));
		}
	}
	
	
}