public class StaticExample2 
{	
	
	static int a=staticMethod();

	static int b=10;
	
	public static void main(String []args)
	{		
			new StaticBlockCheck();
			System.out.println("From Main");
			System.out.println(a);	
		
	}
	static int staticMethod()
	{
		System.out.println("From Static Method");
		return 10;
	}
		
}
public class StaticBlockCheck extends StaticExample2        //----> doesnt need to be in inherentance
{
		
		static {
				System.out.println("From Static Block");
				//a=a+b+1;
		}
	
		
	
}
