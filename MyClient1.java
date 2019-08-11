import java.io.*;
import java.net.*;
public class MyClient1
{    
	public static void main(String args[])
	{   
 	try
	{
          	  Socket s=new Socket("localhost",6666);
          	  DataOutputStream d=new DataOutputStream(s.getOutputStream());
	  DataInputStream di=new DataInputStream(s.getInputStream());
	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));	
	String in="";
	String out="";
	while(!out.equals("exit"))
	{
	out=br.readLine();
            	d.writeUTF(out);
            	d.flush();
	in=di.readUTF();
	System.out.println("Server says: "+in);
	}
            	d.close();
            	s.close();
        	}
        	catch(Exception e)
      	  {
          	  System.out.println(e);
        	}
	}
}