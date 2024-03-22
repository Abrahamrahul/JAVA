// method overriding in the concept of Anonymous class 

//Anonymous class helps to override without being extended And helps to override the method in same class

class AnonymousOverriding extends Parent
{    	
	void method(){System.out.println("B");}
  	public static void main(String args[])
	{  
 		AnonymousOverriding obj=new AnonymousOverriding()
		{
			@Override void method(){super.super.method();System.out.println("C");}
		};  
		obj.method();
		
		
  	} 	
	
} 
class Parent
{    	
	void method(){System.out.println("A");}
  	
	
} 
