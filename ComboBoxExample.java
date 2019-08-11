import javax.swing.*;
import java.awt.*;
public class ComboBoxExample
{
	JFrame f;
	ComboBoxExample()
	{
		f=new JFrame("combobox example");
		String Country[]={"india","US","AUS"};
		JComboBox cb=new JComboBox (Country);
		cb.setBounds(30,40,100,100);
		f.add(cb);
		f.setLayout(null);
		f.setSize(400,500);
		f.setVisible(true);
	}
	public static void main(String args[])
	{
		new ComboBoxExample();
	}
}