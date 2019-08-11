import java.io.*;
import  java.net.*;
import java.util.*;
class MyClient
{
	public static void main(String args[])
	{
		try
		{
			Socket s=new Socket("localhost",6666);
			DataOutputStream dout=new DataOutputStream(s.getOutputStream());
			String str;
			Scanner sc=new Scanner(System.in);
			str=sc.nextInt()+"";
			dout.writeUTF(str);
			dout.flush();
			dout.close();
			s.close();
		}
		catch(Exception e)
		{	
		}
	}
}
