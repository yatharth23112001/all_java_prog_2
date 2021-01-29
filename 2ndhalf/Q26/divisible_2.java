import java.io.*;
class imperfect_div extends Exception
{

}
class Throweg
{
	void check(int a,int b) throws imperfect_div
	{
		if(a%b == 0)
		{
			System.out.println("divisible");
		}
		else
		{
			throw new imperfect_div();
		}
	}
}
class divisible
{
	public static void main(String[] args) throws IOException
		{
		DataInputStream ds = new DataInputStream(System.in);
		System.out.println("Input two numbers");
		int a = Integer.parseInt(ds.readLine());
		int b = Integer.parseInt(ds.readLine());
		Throweg ob = new Throweg();
		try
		{
			ob.check(a,b);
		}
		catch(imperfect_div e)
		{
			System.out.println("imperfect division");
		}
		finally
		{
			System.out.println("Thanks");
		}
	}
}