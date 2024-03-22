import java.util.*;
class Assertion
{	

	public static void main(String[] args)
	{
		System.out.println("Assertion is Assumption");
		Scanner input=new Scanner(System.in);

		System.out.println("\nEnter My age: ");
		double age=input.nextDouble();
		
		assert age<18:"User Not Valid";
		System.out.println("Welcome you are authorized");
	}	
}
	
