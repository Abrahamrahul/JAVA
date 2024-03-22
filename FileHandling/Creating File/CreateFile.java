import java.io.*;  

class CreateFile 
{  
                public static void main(String args[]) 
		{  
               		try 
			{   
                       		File obj = new File("Filecreate.txt");   
                       		if (obj.createNewFile()) 
				{  
                                  System.out.println("File " + obj.getName() + " is created successfully.");  
                       		} 
				else 
				{  
                                  System.out.println("File is already exist in the directory.");  
                       		}  
                     	} 
			catch (Exception e) 
			{  
                              System.out.println("An unexpected error is occurred.");  
                              e.printStackTrace();  
                  	}   
        	}  
}  
