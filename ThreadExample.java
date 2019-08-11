import java.util.*;

class Message extends Thread
{
	public void run()
	{
		try
		{
		Random rn=new Random();
		String msg[]={"Hi","Hello","Welcome","Bye","MorninG","Night","AfternOon","Evening"};
		
		for(int i=0;i<=50;i++)
		{	
			int r=rn.nextInt(7);
			System.out.println(msg[r]);
			Thread.sleep(200);
		}
		}
		catch(Exception ex){}

	}
}

class Name implements Runnable
{
	public void run()
	{
		try
		{
		String name="SAHIL";
		
		for(int i=(name.length()-1);i>=0;i--)
		{
			char c=name.charAt(i);
			System.out.println("\t"+c);
			Thread.sleep(100);
		}
		}
		catch(Exception ex){}
	}
}

class ThreadExample
{
	public static void main(String args [])
	{
		Message m=new Message();
		m.start();
		Name n=new Name();
		Thread t=new Thread(n);
		t.start();
		
		
		
	}
}
