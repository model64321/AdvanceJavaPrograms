import java.net.*;
import java.io.*;

public class Server
{
	public static void main(String args[])
	{
		try{
				DatagramSocket ds=new DatagramSocket(1000);
				byte[] buf=new byte[1024];
				DatagramPacket dp=new DatagramPacket(buf,1020);
				ds.receive(dp);
				String str=new String(dp.getData(),0,dp.getLength());
				System.out.println("Hello "+str);
				
			ds.close();
		
		
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	
	
	
	}

	


}