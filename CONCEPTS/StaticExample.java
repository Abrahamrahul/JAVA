public class StaticExample
{	
	public static class StaticInnerClass
	{
		public static void staticInnerMethod()
		{
				
			System.out.println("Static Method inside Inner Class");
			
		}
	}

	public static void main(String []args)
	{	
		System.out.println("From Main");
		StaticExample.StaticInnerClass sic=new StaticExample.StaticInnerClass();
		StaticExample.StaticInnerClass.staticInnerMethod(); //or sic.staticInnerMethod();
		System.out.println(a);	
		System.out.println(a);	
	}
	
	
	static int a=staticMethod();

	static int b=10;

	static {
				System.out.println("From Static Block");
				a=a+b+1;
		}
	static int staticMethod()
	{
		
		System.out.println("From Static Method");
		return 10;
	}
		
}
