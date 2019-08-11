import java.io.*;
import java.net.*;

public class Client
{

	public static void main(String args [])
	{
			try{
			Socket s=new Socket("localhost",2000);
			DataOutputStream dout=new DataOutputStream(s.getOutputStream());
			BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
			System.out.println("Enter a number :- ");
			String no=br.readLine();
			dout.writeUTF(no);
			dout.flush();
			dout.close();
			}
			catch(Exception e)
			{
				System.out.println(e);
			}
	
	}


}