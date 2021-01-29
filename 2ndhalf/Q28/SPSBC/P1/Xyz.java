package P1;
public class Xyz extends Abc
{
	public void display()
	{
		System.out.println(a);
		System.out.println(b);
	//	System.out.println(c); // private member cannot be inherited
		System.out.println(d);
	}
}