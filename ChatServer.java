import java.io.*;
import  java.net.*;
import java.util.*;

class ChatServer
{
	public static void main(String args[])
	{
		try
		{
			String send=null;
			
			//System.out.println("press 0 to stop chatting");	
			while(send!="bye")
			{
			ServerSocket ss=new ServerSocket(6666);
			Socket s=ss.accept();
			DataInputStream dis=new DataInputStream(s.getInputStream());
			String rcv=(String)dis.readUTF();
			System.out.println(rcv);
			ss.close();
			
			DataOutputStream dout=new DataOutputStream(s.getOutputStream());
			//String send;
			Scanner sc=new Scanner(System.in);
			send=sc.nextLine();
			dout.writeUTF("Server="+send);
			dout.flush();
			dout.close();
			
			}
			
		
		}catch(Exception e){
		}
	}

}