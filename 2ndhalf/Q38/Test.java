import java.io.*;
class Test
{
	public static void main(String[] args) throws IOException{
		// int a = 5;
		// int b = 6;
		int c;
		DataInputStream ds = new DataInputStream(System.in);
		System.out.println("Input two numbers");
		int a = Integer.parseInt(ds.readLine());
		int b = Integer.parseInt(ds.readLine());
		try
		{
			Thread.sleep(10000);
		}
		catch(InterruptedException e)
		{
			System.out.println(e);
		}
		c = a+b;
		System.out.println(c);
	}
}