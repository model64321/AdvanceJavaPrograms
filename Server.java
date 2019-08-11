import java.net.*;
import java.lang.*;
import java.io.*;

class Server
{

	public static void main(String args[])
{
	try{
		ServerSocket ss=new ServerSocket(2848);
		Socket s=ss.accept();
		DataInputStream dis=new DataInputStream(s.getInputStream());
		String str=(String) dis.readUTF();
		System.out.println("Message = "+str);	
		ss.close();

		}	
	catch(Exception e){}

}    
}