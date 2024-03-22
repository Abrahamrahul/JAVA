import java.io.*;  

class GetFileInfo 
{  
		public static void main(String[] args) 
		{   
        		File obj = new File("File.txt");  
        		if (!obj.exists()) 						//if file not there creating file
			{    
            			try 
				{   
                       			
                    			obj.createNewFile(); 
			
                     		}	 
				catch (Exception e) 
				{  
                              		System.out.println("An unexpected error is occurred.");  
                              		e.printStackTrace();  
                  		}     
        		}  
			 
			if (obj.exists()) 						// getting fileinfo if exist
			{ 
				System.out.println("File Name : " + obj.getName());     
            			System.out.println("Path of the file is: " + obj.getAbsolutePath());       
   			        System.out.println("Is file writeable : " + obj.canWrite());    
            			System.out.println("Is file readable " + obj.canRead());     
            			System.out.println("The size of the file : " + obj.length() + "bytes");    
        		 
    			} 
		} 
  
}  
