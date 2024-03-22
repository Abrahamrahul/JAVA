
public class ConstructorOverloading
{	/*
	ConstructorOverloading()
	{
		System.out.println("Constructor");
	}
	*/
	ConstructorOverloading(int x)
	{
		System.out.println("Int:"+x);
	}

	ConstructorOverloading(int x,float y)
	{
		System.out.println("Int & Float:"+x+" & "+y);
	}

	ConstructorOverloading(float x,int y)
	{
		System.out.println("Float & Int:"+x+" & "+y);
	}
	public static void main(String[] args)
	{
		new ConstructorOverloading();		//default constructor is erased once we define a parameterized constructor
   		new ConstructorOverloading(10,10.0f);	//ambiguity occurs coz compiler changes int to float vice versa (widening) & also for int and double
	}

}