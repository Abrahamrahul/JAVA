import java.util.*;
import java.lang.*;
public class SystemMethods{
	public static void main(String[] z){
		//int a=10,b=30;
		//int c=a^b;
		//System.out.println(System.currentTimeMillis());
		
		//ARRAY COPY

		String a[]={"A","B","C","D","E","F","G","H","I"};
		String b[]={"a","b","c","d","e","f","g","h","i","j","k"}; 
		int srcPos,destPos,length;  
		srcPos=0; //start 
		destPos=2; //end of a and start of b 
		length=5;  //from b to length

               	System.arraycopy(a,srcPos,b,destPos, length); //use of arraycopy() method  
        	System.out.println("Destination array after use of arraycopy()");  
		for(int i=0;i<b.length;i++)  
        	System.out.print(b[i]);  
         
	
	}
}
		
		
		