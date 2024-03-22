public class NestedMethodOverloading 
{
	public static void main(String[] args)
	{
		
		Methods.displayOne(1);	
	}



}
public class Methods 
{
	
	public static void displayOne(int a)
	{
		System.out.println("One Parameter");
		displayOne(1,2);
	}
	private static void displayOne(int a,int b)
	{
		System.out.println("Two Parameter");
		displayOne(1,2,3);
		
	}
	private static void displayOne(int a,int b,int c)
	{
		System.out.println("Three Parameter");
		displayOne(1,2,3,4);
	}
	private static void displayOne(int a,int b,int c,int d)
	{
		System.out.println("Four Parameter");
	}
}