
public class ClassExample
{
	
	
  	public static void main(String[] args)
	{
		ClassExample object = new ClassExample();
		Object obj =new Object();
		System.out.println(obj instanceof Object);
		
		System.out.println(obj.hashCode());       //hash code is a method of class Object
		
  	}
	public void method()
	{	
		notify();
		System.out.println("Method");
  	}
}
