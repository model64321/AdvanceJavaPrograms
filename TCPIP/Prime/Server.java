import java.io.*;
import java.net.*;

public class Server
{

	public static void main(String args [])
	{
			try{
			
			ServerSocket ss=new ServerSocket(2000);
			Socket s=ss.accept();
			DataInputStream din=new DataInputStream(s.getInputStream());
			int n=Integer.parseInt(din.readUTF());
			int count=0;
			for(int i=1;i<=n;i++)
			{
				if(n%i==0)
				{	count++;	}
			}
			if(count==2)
			{
				System.out.println("The no is Prime");
			}
			else{
				System.out.println("The no is not Prime");
			}
			s.close();
			
			}
			catch(Exception e)
			{
				System.out.println(e);
			}
	
	}


}