import java.io.*;  

class DeleteFile 
{  
                public static void main(String args[]) 
		{  
               		try 
			{   
                       		File obj = new File("File.txt");   
                       		obj.delete();
				System.out.println(obj);	//file name
                     	} 
			catch (Exception e) 
			{  
                              System.out.println("An unexpected error is occurred.");  
                              e.printStackTrace();  
                  	}   
        	}  
}  
