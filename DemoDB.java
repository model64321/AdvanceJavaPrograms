import java.sql.*;
import java.util.*;
import java.io.DataInputStream;
import java.lang.*;

class DemoDB
{
	public static void main(String arg[])
	{
		
		String url="jdbc:odbc:STUD";

	try  
		{
		
		Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
		Connection myConnection=DriverManager.getConnection(url);
		Statement mystmt=myConnection.createStatement();
		







		
		
			/*mystmt.close();
			myConnection.close();*/
		
		System.out.println("Connection Successful...");
		
		}
		catch(Exception e)
			{
				System.out.println(e);
			}
			
		                       						


	}

}