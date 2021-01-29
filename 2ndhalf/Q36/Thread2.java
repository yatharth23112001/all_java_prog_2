class A1 extends Thread //step1
{
	A1()
	{
		start(); //step2
	}
	public void run() //step3
	{
		for(int i=0;i<10;i++)
		{
			System.out.println("A1's i="+i);
		}
	}
}
class Thread2
{
	public static void main(String[] args) {
		new A1();
		for(int i=0;i<10;i++)
		{
			System.out.println("Main i="+i);
		}
	}
}