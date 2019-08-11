import java.net.*;
import java.io.*;
import java.util.*;



class Client58
{
	public  static void main(String[] args)
	{
		try{
		Scanner sc=new Scanner(System.in);
		DatagramSocket ds=new DatagramSocket();
		System.out.println("Enter a valid username");
                                  String str=" ";
		str=sc.nextLine();
		InetAddress ip=InetAddress.getByName("127.0.0.1");
		DatagramPacket dp= new  DatagramPacket(str.getBytes(),str.length(),ip,3000);
		ds.receive(dp);
		ds.close();

		}catch(Exception e){}
	}
}