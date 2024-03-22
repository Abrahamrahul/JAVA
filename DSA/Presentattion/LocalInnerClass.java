public class LocalInnerClass
{
	public static void main(String[] args)
	{
		OuterClass oc = new OuterClass();
		oc.outerMethod();

		//OuterClass.InnerClass oi = new OuterClass.InnerClass();
		//oi.innerMethod();
	}
}
class OuterClass
{
	void outerMethod()
	{
		class InnerClass
		{
			void innerMethod()
			{
				System.out.println("innerMethod");
			}
		}
		
	InnerClass ic = new InnerClass();
	ic.innerMethod();
	}
}