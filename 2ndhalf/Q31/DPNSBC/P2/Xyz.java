package P2;
import P1.*;
public class Xyz
{
	Abc ob = new Abc();
	public void display()
	{
	//	System.out.println(ob.a); //since not in the same package
		System.out.println(ob.b); 
	//	System.out.println(ob.c); // since not same class , private applied hence will not display
	//	System.out.println(ob.d); // since not in the same package nor a subclass
	}
}