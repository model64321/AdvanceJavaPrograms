import java.io.*;
import  java.net.*;
class MyServer2
{
	public static void main(String args[])
	{
		try
		{
			ServerSocket ss=new ServerSocket(6666);
			Socket s=ss.accept();
			DataInputStream dis=new DataInputStream(s.getInputStream());
			String str=(String)dis.readUTF();
			
			if(str.equals("lol"))
				System.out.println("******** is right");
			else
				System.out.println("******** isn't right");
		
			ss.close();
		}
		catch(Exception e)
		{	
		}
	}
}
