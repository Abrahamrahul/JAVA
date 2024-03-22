class This3
{  
	public static void main(String args[])
	{  
		A a=new A(10); 
		 
	}
	}
class A extends This3
{  
	
	A(){System.out.println("This Called Default constructor");}
	A(int x)
	{  
		this(); 
		System.out.println(x);  
	}  
	
}  
 