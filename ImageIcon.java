import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class ImageIcon extends Frame //implements ListSelectionListener
{
	JList j1;
	JFrame frame;
	JLabel jl;
	ImageIcon i1,i2;
	String [] items = {"Tulips","Desert"};
	ImageIcon()
	{
		 frame = new JFrame("Image Icon");
		frame.setVisible(true);

		//i1= new ImageIcon("Tulips.jpg");
		//i2= new ImageIcon("Desert.jpg");
		jl= new JLabel();
		frame.add(jl);
	frame.add(i1);
	}
		
	
public static void main(String args[])
{
	
	new ImageIcon();
}





	}