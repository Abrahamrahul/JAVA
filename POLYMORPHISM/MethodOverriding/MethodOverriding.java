// method overriding m1 is in c1 and in c2 ,m1 is override 



class MethodOverriding extends ClassWithMethod
{    
  	@Override protected void method(int a){System.out.println("After Override");} 
	
  
  	public static void main(String args[])
	{  
 		 MethodOverriding obj = new MethodOverriding(); 
 		 obj.method(); 
		 
  	}
	 
} 


class ClassWithMethod
{  
	void method(){System.out.println("Before Override");}  
}  
