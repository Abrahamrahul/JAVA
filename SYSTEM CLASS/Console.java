import java.util.*;
import java.io.*;
public class TestConsole
{
	public static void main(String[] args)
	{
		Console console=System.console();
		
		String str1 = console.readLine("Enter String : ");

		System.exit(0);		//ends the program limit of int
	
		char[] password = console.readPassword("Enter Password : ");
	
		PrintWriter writer=console.writer();
		for(char a : password)
			writer.print(a);

		console.printf("\nHello %s!", "World");

		//console.flush();       //------> not clear yet
	}
}