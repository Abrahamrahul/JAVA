public class AbstractMethod extends AbstractClass
{	
	public static void main(String[] args)
	{
		AbstractClass obj=new AbstractMethod();
		obj.display();
	}
	void display()
	{
		System.out.println("OVERRIDE");
	}
	
	
}


abstract class AbstractClass
{
	
	abstract void display();
	
}




















	