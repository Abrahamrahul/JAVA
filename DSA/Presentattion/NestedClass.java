class OuterClass
{
	int a = 5;
	
	class InnerClass
	{
		int b = 10;
		
		void innerMethod()
		{
			System.out.println("innerMethod");
		}
	}
	
	void outerMethod()
	{
		InnerClass ic = new InnerClass();
		ic.innerMethod();
		System.out.println("outerMethod");
	}
}
public class NestedClass
{
	public static void main(String[] args)
	{
		OuterClass oc = new OuterClass();
		oc.outerMethod();

		OuterClass.InnerClass oi = new OuterClass().new InnerClass();
		oi.innerMethod();
	}
}