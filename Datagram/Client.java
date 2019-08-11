import java.net.*;
import java.io.*;

public class Client
{
	public static void main(String args[])
	{
		try{
				DatagramSocket ds=new DatagramSocket();
				BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
				System.out.println("Enter Your Name :- ");
				String str=br.readLine();
				InetAddress ip=InetAddress.getByName("localhost");
				DatagramPacket dp=new DatagramPacket(str.getBytes(),str.length(),ip,1000);
				ds.send(dp);
				ds.close();
		
		
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	
	
	
	}

	


}