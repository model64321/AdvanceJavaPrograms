/*<applet code=DB_GUI
	height=500
	width=500></applet>*/

import java.sql.*;
import java.io.DataInputStream;
import java.util.*;
import java.applet.*;
import java.awt.*;
import java.awt.event.*;

class DB_GUI extends Applet implements ActionListener
{

String DSN_URL="jdbc:odbc:myDSN";
DataInputStream in;
Scanner objScanner;
Connection connect;
Statement statement;
TextField t1, t2, t3;
TextArea ta;
Button b1, b2, b3, b4, b5, b6;


public void init()
{
	t1=new TextField();
	t2=new TextField();
	t3=new TextField();
	ta=new TextArea(100, 50);
	b1=new Button("INSERT");
	b2=new Button("UPDATE");
	b3=new Button("DELETE");
	b4=new Button("TRUNCATE");
	b5=new Button("CLOSE CONN");
	b6=new Button("GET ALL ROWS");

	add(t1);
	add(t2);
	add(t3);
	add(b1);
	add(b2);
	add(b3);
	add(b4);
	add(b5);
	add(b6);
	add(ta);

	setSize(500, 500);
	setVisible(true);
	setLayout(new FlowLayout());

	b1.addActionListener(this);
	b2.addActionListener(this);
	b3.addActionListener(this);
	b4.addActionListener(this);
	b5.addActionListener(this);
	b6.addActionListener(this);

	try{
	in=new DataInputStream(System.in);
	objScanner = new Scanner(System.in);
	Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
	connect=DriverManager.getConnection(DSN_URL);
	statement=connect.createStatement();	
	}
	catch(Exception e){}
}

public void actionPerformed(ActionEvent e)
{
	boolean bool=false;
	int _id=Integer.parseInt(t1.getText().toString());
	String _name=t2.getText().toString();
	String _year=t3.getText().toString();
	
	if(e.getSource()==b1)
	{
		bool=addRowToTable(_id, _name, _year);
	}
	if(e.getSource()==b2)
	{
		bool=updateNameAndYear(_id, _name, _year);
	}
	if(e.getSource()==b3)
	{
		bool=deleteRowFromTable(_id);
	}
	if(e.getSource()==b4)
	{
		bool=truncTable();
	}
	if(e.getSource()==b5)
	{
		try{
		connect.close();
		}
		catch(Exception exc){}
	}
	if(e.getSource()==b5)
	{
		String res=getAllRowsFromTable();
		ta.setText(res);
	}
}


public boolean addRowToTable(int id, String name, String year)
{
	boolean b=false;
	try{	
	b=statement.execute("INSERT INTO STUD_TABLE VALUES ("+id+", '"+name+"', '"+year+"')");
	}catch(Exception e){}
	return b;
}

public boolean deleteRowFromTable(int id)
{
	boolean b=false;	
	try{	
	b=statement.execute("DELETE FROM STUD_TABLE WHERE ID="+id);
	}catch(Exception e){}
	return b;
}

public boolean truncTable()
{
	boolean b=false;
	try{
	b=statement.execute("DELETE * FROM STUD_TABLE");
	}catch(Exception e){}
	return b;
}

public boolean updateNameAndYear(int id, String new_name, String new_year)
{
	boolean b=false;
	try{
	b=statement.execute("UPDATE STUD_TABLE SET id=1");
	}catch(Exception e){}
	return b;
}

public String getAllRowsFromTable()
{
	String td="";
	try{
	ResultSet rs=statement.executeQuery("SELECT * FROM STUD_TABLE");
	
	while(rs.next())
	{
	td=td+rs.getString(1)+"\t"+rs.getString(2)+"\t"+rs.getString(3)+"\n";
	}
	}catch(Exception e){}
	return td;
}

}
