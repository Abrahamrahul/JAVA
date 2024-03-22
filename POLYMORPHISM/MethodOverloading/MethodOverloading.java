//method overloading see only method signature of method not the return type

//the method is selected at runtime


public class MethodOverloading
{
	public static void main(String[] args)
	{
		displayOne(1,2);	
	}

	public static void displayOne(int x,int y)
	{
		System.out.println("DisplayOne: "+x+y);
	}

	public static int displayOne(int x,int y)
	{
		System.out.println("DisplayOne: "+(x+y));
		return x;
	}
}