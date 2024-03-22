public class ConversionThroughObject
{
	public static void main(String[] args) 
	{
        	ConversionThroughObject obj = new ConversionThroughObject();
        	Parent p1 = new Parent();
        	Son s1 = new Son();
        	Daughter d1 = new Daughter();
        
        	obj.method(p1); 
        	obj.method(s1);    
        	obj.method(d1);    
    	}
    	public void method(Parent p1) 
	{
        	System.out.println("By parent"+ p1.getClass().getSimpleName());   //returns in string and getSimpleName - return class name but getName -returns along with Packge name
        }

    	public void method(Son s1) 
	{
        	System.out.println("By son");
   	}

    	public void method(Daughter d1) 
	{
        	System.out.println("By daughter");
    	}

    
}

public class Parent {}

public class Son extends Parent {}

public class Daughter extends Parent {}

