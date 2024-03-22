class This4
{  	
 	void a(This4 obj)
	{  
  		System.out.println("method is invoked");  
 	}  
  	void b()
	{  
 		 a(this);  
 	} 

 
  	public static void main(String args[])
	{  
  		This4 obj = new This4();  
  		obj.b();  
  	}  
}  