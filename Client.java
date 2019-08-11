import java.net.*;
import java.lang.*;
import java.io.*;

class Client
{
	public static void main(String args[])
{
	try{
		Socket s=new Socket("localhost",2848);
		DataOutputStream dout=new DataOutputStream(s.getOutputStream());
		dout.writeUTF("Hello Server");
		dout.flush();
		dout.close();
		s.close();
		}
		catch(Exception e){}

}

}