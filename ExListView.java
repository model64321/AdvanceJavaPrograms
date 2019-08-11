import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class ExListView
{
	Label label;
	Button b;
	List l;
	ExListView()
	{
		label=new Label("Select an item and press OK");
		b=new Button("OK");
		Frame f=new Frame();
		l=new List(4, false);
		l.setBounds(100, 100, 70, 70);
		l.add("C");
		l.add("C++");
		l.add("Java");
		l.add("PHP");
		f.add(l);
		f.add(b);
		f.add(label);
		f.setSize(512, 512);
		f.setLayout(new FlowLayout());
		f.setVisible(true);
		b.addActionListener(new ActionListener(){public void actionPerformed(ActionEvent e){
			label.setText(l.getItem(l.getSelectedIndex())+" is selected.");
		}});
	}
	public static void main(String a[])
	{
		new ExListView();
	}
}