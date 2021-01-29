package P2;
import P1.*;
public class Xyz extends Abc
{
	public void display()
	{
	//	System.out.println(a); //since not in the same package
		System.out.println(b); 
	//	System.out.println(c); // since not same class , private applied hence will not display
		System.out.println(d); // since Xyz is subclass will be displayed
	}
}