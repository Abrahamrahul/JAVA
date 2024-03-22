/*
public class NewUpCasting
{
	
	public static void display1()
	{
		
		System.out.println("From display1");
	}
}
public class UpCasting 
{

	//UpCasting a=new UpCasting();
	//a.display1();
	NewUpCasting.display1();
	
	public static void main(String[] args){
		
		System.out.println("From Main");
	}
	public static void display(){
		
		System.out.println("From display");
	}
}

/*
public class UpCasting
	{
		public static void main(String []args)
		{
		
			A obj1 = (A) new B();
			A obj2 = (A) new B();
			obj1.display();
			obj2.display();	
			
		}
	}	
public class A
	{
		
		void display()
		{
			System.out.println("A Display");
		}
	}
public class B extends A
	{
		void display()
		{
			System.out.println("B Display");
		}
	}

























































	