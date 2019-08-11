import java.sql.*;
import java.util.*;
import sun.jdbc.odbc.*;
import java.lang.*;

class DemoDB3
{
	public static void main(String arg[])
	{
		
		String url="jdbc:odbc:AA";

	try  
		{
		
		Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
		Connection c=DriverManager.getConnection(url);
		//JdbcOdbcDriver d=new JdbcOdbcDriver();
		PreparedStatement p=c.prepareStatement(" update AA set ID=?,Marks=? where Name=?");
		Scanner sc=new Scanner(System.in);
		int ID;
		String Name;
		int Marks;
		System.out.println("Connection Successful...");

		String choice="Y";
		while(choice.equals("Y"))
		{
			
			System.out.println("Enter name:");
			Name=sc.nextLine();
			System.out.println("Enter ID to update:");
			ID=sc.nextInt();
			sc.nextLine();
			System.out.println("Enter marks:");
			Marks=sc.nextInt();
			sc.nextLine();
			
			p.setInt(1,ID);
			p.setString(2,Name);
			p.setInt(3,Marks);
			
			
			int result=p.executeUpdate();
			if(result==0)
			{
				System.out.println("Data updated succesfully");
			}
			else
			{
				System.out.println("Data unsuccesful");
			}
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