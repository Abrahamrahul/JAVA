//Promotion happens when suitable datatype is missing so implicit type conversion to larger data type

//byte<short<int<long<float<double


public class Promotion
{
	public static void main(String[] args)
	{
		//displayOne(1.5f,2.0f); 	   -> to Double
		//displayOne(5l,10l);	  	   -> to Double
		//displayOne((short)5,(short)10);  -> to short
	}

	public static void displayOne(double x,double y)
	{
		System.out.println("By Double "+(x+y));
	}

	public static void displayOne(int x,int y)
	{
		System.out.println("By Integer "+(x+y));
	}
	
	public static void displayOne(short x,short y)
	{
		System.out.println("By Short "+(x+y));
	}

}