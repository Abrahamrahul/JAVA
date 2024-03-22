public class TryCatchExample{
	public static void main(String[] args)
	{
		try
		{
			int[] a=new a[5];
			a[5]=10/0;
			int b=10/0 ;
		}
		catch(ArithmeticException e || ArrayIndexOutOfBondsException e)
		{
			System.out.println("Error  occured");
			System.out.println(e);
		}
		System.out.println("10");
		
	}
}
