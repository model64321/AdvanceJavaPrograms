import java.sql.*;
import java.util.*;
import sun.jdbc.odbc.*;
import java.lang.*;

class DemoDB2
{
	public static void main(String arg[])
	{
		
		String url="jdbc:odbc:STUD";

	try  
		{
		
		Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
		Connection c=DriverManager.getConnection(url);
		//JdbcOdbcDriver d=new JdbcOdbcDriver();
		PreparedStatement p=c.prepareStatement("insert into AA values(?,?,?)");
		Scanner sc=new Scanner(System.in);
		int ID;
		String Name;
		int Marks;
		System.out.println("Connection Successful...");

		String choice="Y";
		while(choice.equals("Y"))
		{
			
			System.out.println("Enter ID:");
			ID=sc.nextInt();
			sc.nextLine();
			System.out.println("Enter name:");
			Name=sc.nextLine();
			System.out.println("Enter marks:");
			Marks=sc.nextInt();
			sc.nextLine();
			
			p.setInt(1,ID);
			p.setString(2,Name);
			p.setInt(3,Marks);
			
			p.executeUpdate();
			System.out.println("Data inserted succesfully");
			sc.nextLine();
			
			
			
			
		
		
		}//end while
		c.close(); 
		
		}
		
		catch(Exception e)
			{
				System.out.println(e);
			}
			
		                     						


	}//end main

}//end class