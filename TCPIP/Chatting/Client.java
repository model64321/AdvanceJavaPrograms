import java.io.*;
import java.net.*;

public class Client
{

	public static void main(String args [])
	{
			try{
			Socket s=new Socket("localhost",2000);
			DataOutputStream dout=new DataOutputStream(s.getOutputStream());
			DataInputStream din=new DataInputStream(s.getInputStream());
			BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
			String out="";
			String in="";
			while(!out.equals("stop"))
			{
				out=br.readLine();
				dout.writeUTF(out);
				in=din.readUTF();
				System.out.println("Server says :- "+in);
				dout.flush();
			
			}
			
			dout.close();
			s.close();
			}
			catch(Exception e)
			{
				System.out.println(e);
			}
	
	}


}