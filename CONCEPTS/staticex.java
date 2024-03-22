//satic block and Static Variable and static inner class

public class staticex
{	
	public static class StaticInnerClass
	{
		public static void display1()
		{
				
			System.out.println("Static inner class");
			
		}
	}
	
	

	static int a=display();
	static int b=10;
	static {
				System.out.println("Static Block");
				//staticex e=new staticex();
				a=a+b+1;
		}
	static int display()
	{
		
		System.out.println("Static Method");
		return 10;
	}
	
	public static void main(String []args)
	{	
		staticex.StaticInnerClass sic=new staticex.StaticInnerClass();
		//sic.display1();
		staticex.display();

		System.out.println("From Main");
		staticex ex=new staticex();
		System.out.println(ex.a);
		
	}
	
}

		