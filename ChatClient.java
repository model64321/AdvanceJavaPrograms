import java.io.*;
import  java.net.*;
import java.util.*;
class ChatClient
{
	public static void main(String args[])
	{
		try
		{ 
			
			String send=null;
			//System.out.println("press 0 to stop chatting");
			while(send!="bye")
			{
				
			Socket s=new Socket("localhost",6666);
			DataOutputStream dout=new DataOutputStream(s.getOutputStream());			
			Scanner sc=new Scanner(System.in);
			send=sc.nextLine();
			dout.writeUTF("Client="+send);
			
			DataInputStream dis=new DataInputStream(s.getInputStream());
			String rcv=(String)dis.readUTF();
			System.out.println(rcv);
			s.close();
			dout.flush();
			dout.close();
			
			
			}
			
			
		}
		catch(Exception e)
		{	
		}
	}
}
