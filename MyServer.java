import java.io.*;
import  java.net.*;
class MyServer
{
	public static void main(String args[])
	{
		try
		{
			ServerSocket ss=new ServerSocket(6666);
			Socket s=ss.accept();
			DataInputStream dis=new DataInputStream(s.getInputStream());
			String str=(String)dis.readUTF();
			int g=Integer.parseInt(str);

			int i=2;
			while(i<g)
			{
				if(g%i==0)
					break;
				i++;
			}
			
			if(i==g)
				System.out.println(g+" is prime");
			else
				System.out.println(g+" isn't prime");
		
			ss.close();
		}
		catch(Exception e)
		{	
		}
	}
}
