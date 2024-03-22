import java.util.*;
import java.io.*;
public class GetEnv
{
	public static void main(String[] args)
	{
		String Value = System.getenv("os");
		if (Value != null) 
		{
    			System.out.println("OS: " + Value);
		} 
		else 
		{
    			System.out.println("environment variable is not set.");
		}
	}
	
}