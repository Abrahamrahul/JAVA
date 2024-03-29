import java.util.*;
public class ArrayListExample
{
	public static void main(String[] args)
	{
	
		List<String> list1 =new ArrayList<>();

		list1.add("Rahul");
		list1.add("James");
		list1.add("Vini");

		System.out.println(list1); 
		String[] array = list1.toArray(new String[0]);
		

		for(String i : array)
			System.out.println(i);
		
		
	}
}