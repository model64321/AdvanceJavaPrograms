import java.io.*;
import  java.net.*;
import java.util.*;
class ClientIF2
{
	public static void main(String args[])
	{
		try
		{
			Socket s=new Socket("localhost",6666);
			DataOutputStream dout=new DataOutputStream(s.getOutputStream());
			String str;
			dout.writeUTF("Hello Server");
			dout.flush();
			dout.close();
			s.close();
		}
		catch(Exception e)
		{	
		}
	}
}
