public class Example
{

	private static final Object lock = new Object(); 
	public void method1() 
	{
        	synchronized (this) 
		{	 
         		System.out.println("Method 1"); 
        	}	
	}

	public void method2() 
	{
        	synchronized (this) 
		{
         		System.out.println("Method 2");   
        	}
	}

	public static void main(String[] args) 
	{
        	Example example = new Example();

        	Thread t1 = new Thread(() ->{
        	    	synchronized (lock) 
			{ 
                		for (int i = 0; i < 5; i++) 
                 	   		example.method1();
                		
            		}
        	});

        
        	Thread t2 = new Thread(() ->{
        	    	synchronized (lock) 
			{ 
                		for (int i = 0; i < 5; i++) 
                 	   		example.method2();
                		
            		}
        	});
       
        	t1.start();
        	t2.start();
    	}
}
	