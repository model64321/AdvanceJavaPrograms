import javax.swing.*;
import java.awt.*;

public class TableExample
{
	JFrame f;
	TableExample()
	{
		f=new JFrame();
		String column[]= {"ID","NAME","SALARY"};
		String data[][]={{"1","Sahil","900000"},
				 {"2","Shiv","800000"},
				 {"3","Anyao","700000"}};
		JTable jt = new JTable(data,column);
		jt.setBounds(30,40,200,300);
		JScrollPane sp = new JScrollPane(jt);
		f.add(sp);
		f.setLayout(new FlowLayout());
		f.setSize(400,500);
		f.setVisible(true);
	}
	
	public static void main(String a[])
	{
		new TableExample();
	}
}