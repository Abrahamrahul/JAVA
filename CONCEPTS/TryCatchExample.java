import java.util.*;
public class TryCatchExample
{
	public static void main(String[] args) 
	{	//method1();
		method2();
	
		/*
		try
		{
			//int a=10/0;
			throw new ArithmeticException("Error");	
		}
		catch(Exception e)
		{
			System.out.println("Manual Exception");
			System.out.println(e.getMessage());

		}*/
	}
	
	public static void method1() throws ArithmeticException
	{
		throw new ArithmeticException("Error");	
	
	}
	public static void method2() 
	{		
		try
		{	
			method1();
		}
		catch(ArithmeticException e)
		{
			System.out.println("Error Rectified"+ e);
		}
		
		
	}
}
