// method overriding in the concept of Anonymous class 

//Anonymous class helps to override without being extended and also the overridden is applicable only for that object

class AnonymousOverriding 
{    	
	
  	public static void main(String args[])
	{  
 		 ClassWithMethod obj = new ClassWithMethod()
		{
			@Override void method(){System.out.println("After Override");}
		}; 
 		 obj.method(); 
		
  	}  
} 


class ClassWithMethod
{  
	void method(){System.out.println("Before Override");}  
}  
