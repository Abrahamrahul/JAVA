import java.io.Console;
import java.util.*;
public class ConsolePassword
{
	public static void main(String[] args)
		{
		Console c=System.console();
		System.out.println("Enter any String: ");
		char[] a=c.readPassword();
//method 1	//String z=String.valueOf(a);
		//System.out.print(z);



 /*method 2							
		StringBuffer sb=new StringBuffer("");
		for(int i=0 ; i<a.length;i++)
			sb.append(a[i]);		
		System.out.println(sb);
*/		


//method 3     
			
		
		
		System.out.println(a);
		}
}
