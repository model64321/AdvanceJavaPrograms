import java.io.*;
import java.net.*;

public class Server
{
	public static void main(String args [])
	
	{
		try{
				ServerSocket ss=new ServerSocket(1000);
				Socket s=ss.accept();
				DataInputStream in=new DataInputStream(s.getInputStream());
				String s1=in.readUTF();
				String success="Sahil";
				
				if(s1.equals(success))
				{
					System.out.println("User Authorised to work");
				}
				else
				{
					System.out.println("You aren't Authorised to work");
				}
				s.close();
		}
		catch(Exception e)
		{
			System.out.println(e);
			}
	
	}
	


}