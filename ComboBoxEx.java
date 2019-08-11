import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.event.*;

public class ComboBoxEx
{
	JFrame f;
	JComboBox cb;
	JLabel l;
	Button b;
	Panel p;
	ComboBoxEx()
	{
		f=new JFrame("ComboBox Example");
		String country[]= {"Orange","Yellow","Red","Blue","Green"};


		l=new JLabel("...");
		l.setText("Select a color");


		p=new Panel();
		cb = new JComboBox(country);		

		b=new Button("Set color");
		b.addActionListener(new ActionListener()
			{
				public void actionPerformed(ActionEvent e)
				{
					String m=cb.getSelectedItem()+" is selected";
					switch(cb.getSelectedIndex())
					{
						case 0:p.setBackground(Color.ORANGE);l.setText(m);break;
						case 1:p.setBackground(Color.YELLOW);l.setText(m);break;
						case 2:p.setBackground(Color.RED);l.setText(m);break;
						case 3:p.setBackground(Color.BLUE);l.setText(m);break;
						case 4:p.setBackground(Color.GREEN);l.setText(m);break;
					}
				}
			}
		);





		p.add(cb);
		p.add(b);
		p.add(l);
		p.setBounds(40, 140, 250, 250);
		f.add(p);
		f.setLayout(new FlowLayout());
		f.setSize(400,500);
		f.setVisible(true);
	}
	
	public static void main(String a[])
	{
		new ComboBoxEx();
	}
}