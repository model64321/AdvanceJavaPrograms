import java.sql.*;

class Demo
{
	public  static void main(String[] args)
	{
		try{
		Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
		Connection con=DriverManager.getConnection("jdbc:odbc:empDSN");
		System.out.println("Connection Successfull");
		}catch(Exception e){}
	}
}