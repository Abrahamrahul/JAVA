import java.io.*;  
import java.util.*;
class ReadInFile 
{  
		public static void main(String[] args) 
		{   
        		 
        		try 
			{   
                       		File obj = new File("File.txt"); 
                    		Scanner fr = new Scanner(obj);
				while (fr.hasNextLine())
				{
					
					String s1=fr.nextLine();
					System.out.println(s1);
				}
				fr.close();
			}	 
			catch (Exception e) 
			{  
                              	System.out.println("An unexpected error is occurred.");  
                              	e.printStackTrace();  
                  	}     
        		  
			 	
        		 
    			
		} 
  
}  
