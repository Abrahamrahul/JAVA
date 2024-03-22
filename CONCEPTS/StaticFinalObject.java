//see the file name and class name

public class StaticExample1 
{

	private final static StaticExample1 obj1=new StaticExample1();

    	public static void main(String[] args) 
	{
		System.out.println(obj1);
		obj.method();
    	}
  	public void method() 
	{
        	obj1.method1();
    	}
	public void method1() 
	{
        	System.out.println("method1");
   	}
}