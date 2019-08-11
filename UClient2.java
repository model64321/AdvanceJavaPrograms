import java.net.*;
import java.io.*;
import java.util.*;
class UClient2
{
	public static void main(String args[])
	{
		try{
		Scanner sc=new Scanner(System.in);
		DatagramSocket ds = new DatagramSocket();
		System.out.println("Enter a valid username");
		String str = "";
		str=sc.nextLine();
		lnetAddress ip = InetAddress.getByName("127.0.0.1");
		DatagramPacket dp = new DatagramPacket(str.getBytes(),str.length(),ip,3000);
		ds.send(dp);
		ds.close();
		}catch(Exception e){}
	}
}