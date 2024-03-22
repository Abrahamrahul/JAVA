class ExceptionOverriding extends ClassWithMethod
{    
  	@Override void method() throws ArithmeticException    //throws Unchecked exception Only 
	{    
    		System.out.println("After Override");    
  	}   
  	public static void main(String args[]) 
	{    
   		ClassWithMethod obj = new ExceptionOverriding();    
   		obj.method();    
  	}   
}   
   
class ClassWithMethod
{    
  	void method()throws ArithmeticException
	{  
    		System.out.println("Before Override");  
  	}    
} 
