//clearProperty setProperties setProperty   

import java.util.*;
public class GetProperty
{
	public static void main(String[] args)
	{

//set properties

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

//set property
		System.setProperty("Key2","Value2");
		//System.setProperty("Key2","Value2");
		String propertyValue =  System.getProperty("key1");
		System.out.println("Property Value :" + propertyValue);



//clear property

		System.clearProperty("Key2");
		
		String propertyValue1 =  System.getProperty("key2");
		System.out.println("Property Value :" + propertyValue1);
		System.out.println(System.getProperties());
        	
	}
}