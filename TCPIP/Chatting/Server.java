import java.io.*;
import java.net.*;

public class Server
{

	public static void main(String args [])
	{
			try{
			ServerSocket ss=new ServerSocket(2000);
			Socket s=ss.accept();
			DataOutputStream dout=new DataOutputStream(s.getOutputStream());
			DataInputStream din=new DataInputStream(s.getInputStream());
			BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
			String out="";
			String in="";
			while(!out.equals("stop"))
			{
				in=din.readUTF();
				System.out.println("Client says :- "+in);
				out=br.readLine();
				dout.writeUTF(out);
				dout.flush();
			
			}
			
			dout.close();
			ss.close();
			}
			catch(Exception e)
			{
				System.out.println(e);
			}
	
	}


}