package P1;
public class Xyz 
{
	Abc ob = new Abc();
	public void display()
	{
		System.out.println(ob.a); //same package
		System.out.println(ob.b); //same package
	//	System.out.println(ob.c); // since not same class , private applied hence will not display
		System.out.println(ob.d); // since saved under same package though not a subclass will be displayed
	}
}