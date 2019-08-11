import java.io.*;
import java.net.*;

public class Client
{
	public static void main(String args [])
	
	{
		try{
		Socket s=new Socket("localhost",1000);
		DataOutputStream dout=new DataOutputStream(s.getOutputStream());
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter password");
		String pass="";
		pass=br.readLine();
		dout.writeUTF(pass);
		dout.flush();
		dout.close();
		s.close();
		}
		catch(Exception e)
		{
			System.out.println(e);
			}
	
	}
	


}