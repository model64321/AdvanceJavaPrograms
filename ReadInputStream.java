import java.io.*;

class ReadInputStream
{
	public static void main(String args[])
	{
		try
		{
			FileInputStream file=new FileInputStream(args[0]);
			int x;
			do
			{
					x=file.read();
					if(x!=-1)
					{
						System.out.println((char)x);
					
					}
	
			}while(x!=-1);
			file.close();
		
		}
		catch(IOException ex)
		{
			System.out.println(ex.getMessage());
		}
	
	}
}