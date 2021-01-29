class Thread1 implements Runnable
{
	Thread1()
	{
		Thread t = new Thread(this);
		t.start();
	}
	public void run()
	{
		for(int i=0;i<10;i++)
		{
			System.out.println("Thread1's i="+i);
		}
	}
}
class Thread2
{
	public static void main(String[] args) {
		new Thread1();
		//new Thread1(); //if we write this then the this 
						//keyword would refer to the new object
		for(int i=0;i<20;i++)
		{
			System.out.println("Main i="+i);
		}
	}
}