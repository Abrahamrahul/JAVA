import java.io.*; 
import java.util.*;
import java.nio.file.Files;
import java.nio.file.attribute.PosixFilePermission;
import java.nio.file.attribute.PosixFilePermissions;

class GetFileInfo 
{  
		public static void main(String[] args) 
		{   
        		File obj = new File("File.txt");  
        		try 
			{   
                       		obj.createNewFile();
				//Set<PosixFilePermission> permissions = PosixFilePermissions.fromString("File.txt","write"); //to make writeonly
				//Files.setPosixFilePermissions(obj.toPath(), permissions);	
                    		FileWriter fw = new FileWriter(obj.getName());
				fw.write("First Statement In file.");
				obj.setReadOnly();
				fw.close();
				System.out.println("Is file writeable : " + obj.canWrite());    
            			System.out.println("Is file readable " + obj.canRead());     
				
                     	}	 
			catch (Exception e) 
			{  
                              	System.out.println("An unexpected error is occurred.");  
                              	e.printStackTrace();  
                  	}     
        		  
   			        
            			
        		 
    			
		} 
  
}  





