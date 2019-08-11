import java.sql.*;
import java.util.*;
import java.net.*;

class DBConn
{
	public static void main(String args[])
	{
		try	
		{
					//String database = 
                     // "jdbc:odbc:DRIVER={Microsoft Access Driver (*.mdb)};DBQ=C:\\Users\\HP\\Documents\\MyDB1.accdb";
					//String url="Jdbc:Odbc:mydsn","","";
					Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
					//Connection con=DriverManager.getConnection("jdbc:ucanaccess://C:\\Users\\HP\\Documents\\DBConn.accdb");
					Connection con=DriverManager.getConnection("Jdbc:Odbc:mydsn","","");
					Statement st=con.createStatement();
					ResultSet rs=st.executeQuery("Select * from stud_info");
					
					while(rs.next())
					{
						System.out.println(rs.getString(1));
					}
			
		}
		catch(Exception e){System.out.println(e);}
	
	}

}