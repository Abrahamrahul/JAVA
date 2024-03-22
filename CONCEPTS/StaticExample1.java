class StaticExample1
{
	public static void main(String []args)
		{	
		
			Parent a=new Child();
			a.staticMethod();
			
		}
}
public class Parent
{	
	public static void staticMethod()
	{
		
		System.out.println("Hello");
		
	}
}
	
public class Child extends Parent
{
		
		@Override public static void staticMethod()
		{
			System.out.println("World");
		}
				
}
