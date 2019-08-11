import javax.swing.*;
import java.awt.*;

public class TableEx
{
	JFrame f;
	TableEx()
	{
		f=new JFrame();
		String column[]= {"ID","NAME","SALARY"};
		String data[][]={{"1","Amit","10000"},
				 {"2","Jay","10000"},
				 {"3","Sachin","10000"}};
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
		new TableEx();
	}
}