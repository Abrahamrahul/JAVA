   

import java.util.*;
public class SetPropertyConsole
{
	public static void main(String[] args)
	{

		/*
		System.out.println(System.getProperty("os.name"));
		System.setProperty("os","linux");
		System.out.println(System.getProperty("os.name"));
		*/
		Properties obj=new Properties();
		
		obj.setProperty("key","Value");
		obj.setProperty("key1","Value1");
	
		System.setProperties(obj);

		System.out.println("System properties:");
		Set<String> propertyNames = obj.stringPropertyNames();
		
		for (String propertyName : propertyNames) 
		{
            		String propertyValue = obj.getProperty(propertyName);
            		System.out.println(propertyName + " = " + propertyValue);
        	}
		
		
        	
	}
}