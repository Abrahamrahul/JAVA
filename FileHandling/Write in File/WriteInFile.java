import java.io.*;  

class GetFileInfo 
{  
		public static void main(String[] args) 
		{   
        		File obj = new File("File.txt");  
        		try 
			{   
                       		obj.createNewFile(); 	
                    		FileWriter fw = new FileWriter(obj.getName());
				fw.write("First Statement In file.");
				fw.close();
				
                     	}	 
			catch (Exception e) 
			{  
                              	System.out.println("An unexpected error is occurred.");  
                              	e.printStackTrace();  
                  	}     
        		  
			 	System.out.println("File Name : " + obj.getName());           
   			        System.out.println("Is file writeable : " + obj.canWrite());    
            			System.out.println("Is file readable " + obj.canRead());     
            			System.out.println("The size of the file : " + obj.length() + "bytes");    
        		 
    			
		} 
  
}  
