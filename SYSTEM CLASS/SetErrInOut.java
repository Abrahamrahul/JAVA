import java.util.*;
import java.io.*;
public class SetErrInOut
{
	/*public static void main(String[] args) throws IOException
	{
		
		
				
	}*/
	
    	public static void main(String[] args) throws IOException  //Local DB
	{  
        	File f=new File("JAVA.txt");  
        	/*
        	InputStream i=new FileInputStream(f);  
        	System.setIn(i);  
        	System.out.println("OK");  

		Scanner fr = new Scanner(f);
		while (fr.hasNextLine())
		{
					
			String s1=fr.nextLine();
			System.out.println(s1);
		}
		fr.close();
		*/
		System.out.println("A");
		FileOutputStream fo = new FileOutputStream("JAVA.txt");

		System.setOut(new PrintStream(fo));
		System.setErr(new PrintStream(fo));

		System.out.println("B");
		System.err.println("Error1");		
		
		System.err.println("Error2");
		System.out.println("C");
		
		fo.close();
		
		
    	}  
  
}
