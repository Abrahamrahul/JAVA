class Child extends Parent
{  
	
	 
	
	public static void main(String args[])
	{  
		Child obj=new Child();
		
	} 
	
	Child()
	{   
		System.out.println("child constructor invoked");    
	} 
	 {System.out.println("instance block in child");} 
         
  
	 
}

class Parent
{  	
	{System.out.println("instance block in parent");}  
	Parent()
	{  
		System.out.println("parent constructor invoked");   
	} 
}  
 