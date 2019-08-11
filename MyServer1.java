import java.io.*;
import java.net.*;
public class MyServer1
{
	public static void main(String args[])
	{
	try
	{
		ServerSocket s1=new ServerSocket(6666);
		Socket s=s1.accept();
		DataOutputStream d=new DataOutputStream(s.getOutputStream());
		 DataInputStream di=new DataInputStream(s.getInputStream());
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));	
		String in="";
		String out="";
		while(!out.equals("exit"))
		{
		in=di.readUTF();
		System.out.println("Clients says: "+in);
		out=br.readLine();
		d.writeUTF(out);
		d.flush();
		}
		d.close();
		s1.close();
		}
	catch(Exception e)
	{
		System.out.println(e);
	}
	}
}

	