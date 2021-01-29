class Test
{
	public static void main(String[] args) {
		for(int i =1;i<=10;i++)
		{
			try
			{
				System.out.println(i);
				Thread.sleep(2000); //milliseconds
			}
			catch(InterruptedException e)
			{
				System.out.println(e);
			}
		}
	}
}