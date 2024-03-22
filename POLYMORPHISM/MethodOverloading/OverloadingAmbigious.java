//ambigious error occur in all the below cases
/*
	int 	float  & float   int
	short   Double & Double  short
	byte	""     & ""	 byte
	long	""     & ""	 long
  
*/

public class OverloadingAmbigious
{
	public static void main(String[] args)
	{
		displayOne(1L,2L);	
	}

	public static void displayOne(long x,double y)
	{
		System.out.println("By Int,Double");
	}

	public static void displayOne(double x,long y)
	{
		System.out.println("By Double,Int");
	}
}