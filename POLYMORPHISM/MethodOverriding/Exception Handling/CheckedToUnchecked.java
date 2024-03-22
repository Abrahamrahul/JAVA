class Parent 
	{
		void performOperation() throws IOException 
		{
        		throw new IOException("IOException occurred");
    		}
	}

class Child extends Parent 
	{
   
    		@Override void performOperation() 
		{
        		try {
            			super.performOperation();
        		    } 
			catch (IOException e) 
			{
            			throw new RuntimeException("Unchecked exception occurred", e);
        		}
    		}
}

public class CheckedToUnchecked 
{
    	public static void main(String[] args) 
	{
        	Child child = new Child();
        
        	try 
		{
            		child.performOperation();
        	} 
		catch (RuntimeException e) 
		{
            		System.out.println("Unchecked exception caught: " + e.getMessage());
                        System.out.println("Original cause: " + e.getCause().getMessage());
        	}
    	}
}
