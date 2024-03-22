//there is no max limit for varargs,However Its converted into Array of its type.practical limits imposed by the available memory and the maximum size of arrays in Java. 

public class Varargs
{
	public static void main(String[] args) 
	{
  
		int[] a={1,2,3,4,5};
        
	        System.out.println("Sum if 2 Parameter :"    +	add(1, 2));
        	System.out.println("Sum if 3 Parameter: "    +	add(1, 2, 3));
        	System.out.println("Sum if ... Parameter: "  +	add(a)); 			//same as below line
		// System.out.println("Sum if ... Parameter: "  +	add(1,2,3,4,5));  //find max limit
    	}
   
   	public static int add(int a, int b) 
	{
        	return a + b;
    	}

    
    	public static int add(int a, int b, int c) 
	{
        	return a + b + c;
    	}

   
    	public static int add(int... numbers) 
	{
        	int sum = 0;
        	for (int num : numbers) 
		{
            		sum += num;
        	}
        	return sum;
    	}

    	
}
