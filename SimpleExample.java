import java.sql.*;
import java.util.*;
import java.lang.*;
class SimpleExample
{
	public static void main(String args[])
	{
		String url="jdbc:odbc:tyit";
		try
		{
			Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
			Connection con=DriverManager.getConnection(url);
			System.out.println("Connection successfull");
			con.close();
			
		}
		
		catch(Exception e)
		{
			e.printStackTrace();
			
		}		
	}
}