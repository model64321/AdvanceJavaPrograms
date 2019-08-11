import java.sql.*;
import java.io.DataInputStream;
import java.util.*;

class MyDB
{
	public static void main(String[] args) 
	{
		String DSN_URL="jdbc:odbc:myDSN";
		String name, year;
		int id;
		try{
			DataInputStream in=new DataInputStream(System.in);
			Scanner objScanner = new Scanner(System.in);


			Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
			Connection connect=DriverManager.getConnection(DSN_URL);
			Statement statement=connect.createStatement();
			
			boolean b=false;

			System.out.println("Enter ID, NAME and YEAR : \n");
			id=Integer.parseInt(in.readLine());
			name=in.readLine();
			year=in.readLine();
			
			b=statement.execute("INSERT INTO STUD_TABLE VALUES ("+id+", '"+name+"', '"+year+"')");
			
			ResultSet rs=statement.executeQuery("SELECT * FROM STUD_TABLE");

			while(rs.next())
			{
				System.out.println(rs.getString(1)+"\t"+rs.getString(2)+"\t"+rs.getString(3));
			}

			System.out.println("To Truncate table\n enter y to truncate...\n");
			System.out.println("To Update table\nenter u to update...\n");
			char c = objScanner.next().charAt(0);
			
			switch(c)
			{
				case 'y':
				case 'Y':
					b=statement.execute("DELETE * FROM STUD_TABLE");
				case 'u':
				case 'U':
					b=statement.execute("UPDATE STUD_TABLE SET id=1");
			}

			connect.close();
		}
		catch(Exception e){
			System.out.println("Error occured : "+e);
		}
	}
}
