import java.sql.*;
import java.util.*;
import sun.jdbc.odbc.*;
import java.lang.*;
import java.awt.*;
import java.awt.event.*;
 import javax.swing.*;


class Demo62 extends JFrame implements ActionListener
{
	
		TextField t1,t2,t3;
		Button b1,b2;
		Connection c;
		PreparedStatement p;
		
	
		public static void main(String arg[])
		{
			DemoDB4 db=new DemoDB4();
			db.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		}//end main
		
		DemoDB4()
		{
			this.setTitle("Databse");
			this.setSize(300,300);
			GridLayout g=new GridLayout(5,2,5,5);
			this.setLayout(g);
			
			this.add(new Label("Enter ID:"));
			t1=new TextField();
			this.add(t1);
			
			this.add(new Label("Enter Name:"));
			t2=new TextField();
			this.add(t2);
			
			this.add(new Label("Enter Marks:"));
			t3=new TextField();
			this.add(t3);
			
			b1=new Button("Insert");
			this.add(b1);
			b1.addActionListener(this);
			
			b2=new Button("Exit");
			this.add(b2);
			b2.addActionListener(this);
			
			
			
			

			try  
			{
				String url="jdbc:odbc:STUD";
				Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
				 c=DriverManager.getConnection(url);
				 p=c.prepareStatement("insert into AA values(?,?,?)");
				JOptionPane.showMessageDialog(null,"Connection succesful");
						
						
				c.close(); 
					
			}
					
			catch(Exception ex)
			{
				JOptionPane.showMessageDialog(null,"ex");
			}
			
			this.setVisible(true);
				
			}
			
			public void actionPerformed(ActionEvent e)
			{
				try
				{
					if(e.getSource()==b1)
					{
						String ID="",Name,Marks;
					
						ID=	t1.getText();
						if(ID.equals(""))
						{
							JOptionPane.showMessageDialog(null,"ID must be inserted");
						}
						
						Name=t2.getText();
						if(Name.equals(""))
						{
							JOptionPane.showMessageDialog(null,"Name must be inserted");
						}
						
						Marks=t3.getText();
						if(ID.equals(""))
						{
							JOptionPane.showMessageDialog(null,"Marks must be inserted");
						}
						
						p.setString(1,ID);
						p.setString(2,Name);
						p.setString(3,Marks);
						
						p.executeUpdate();
						
						JOptionPane.showMessageDialog(null,"Data inserted");
					}
					
					if(e.getSource()==b2)
					{
						System.exit(0);
					}
				}
				catch(Exception ex)
				{
					JOptionPane.showMessageDialog(null,"ex");
				}
						
		                     						
		}
		

	
}