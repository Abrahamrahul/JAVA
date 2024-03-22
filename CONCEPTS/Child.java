public class StaticExample1
{	
	public void staticMethod()
	{
		
		System.out.println("Hello");
		
	}
}
	
public class Child extends StaticExample1
{
		
		@Override void staticMethod()
		{
			System.out.println("World");
		}
		public static void main(String []args)
		{	
		
			Child a=new Child();
			a.staticMethod();
			
		}		
}