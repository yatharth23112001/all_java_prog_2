class nomatch extends Exception{

}
class Throweg
{
	void check(String s1) throws nomatch
	{
		char ch;
		ch = s1.charAt(0);
		if(ch == 'M')
		{
			System.out.println("valid Id");
		}
		else
		{
			throw new nomatch();
		}
	}
}
class user_exp
{
	public static void main(String args[])
	{
		Throweg ob = new Throweg();
		try
		{
			ob.check("icrosoft");
		}
		catch(nomatch e)
		{
			System.out.println("Invalid id");
		}
		finally
		{
			System.out.println("Thanks");
		}
	}
}