import java.net.*;
import java.io.*;
class UClient
{
	public static void main(String args[])
	{
		try{
		DatagramSocket ds = new DatagramSocket();
		String str = "Welcome java";
		InetAddress ip = InetAddress.getByName("127.0.0.1");
		DatagramPacket dp = new DatagramPacket(str.getBytes(),str.length(),ip,3000);
		ds.send(dp);
		ds.close();
		}catch(Exception e){}
	}
}