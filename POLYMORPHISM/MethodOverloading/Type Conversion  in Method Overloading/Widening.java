//Widening is similar to promotion 
/*

int --> long  Widening
int --> float promotion
if Float ----> int {error}lossy conversion
byte -->short-->int--->long-->double
*/

public class Widening
{
	public static void main(String[] args)
	{
		displayOne(2,4);
	}
	
	public static void displayOne(float x,float y)
	{
		System.out.println("By Float "+(x+y));
	}
	
	public static void displayOne(double x,double y)
	{
		System.out.println("By Double "+(x+y));
	}
	/*
	public static void displayOne(int x,int y)
	{
		System.out.println("By Integer "+(x+y));
	}
	*/
	public static void displayOne(short x,short y)
	{
		System.out.println("By Short "+(x+y));
	}

	public static void displayOne(long x,long y)
	{
		System.out.println("By Long "+(x+y));
	}

	
}






