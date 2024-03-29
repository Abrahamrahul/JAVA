import java.util.*;
public class ArrayListExample
{
	public static void main(String[] args)
	{

		List<String> names = new ArrayList<String>();
		
		names.add("rahul");
		names.add("mosesh");
		names.add("sakthi");
		names.add("mosesh");
		names.add("madan");
		names.add("mosesh");
		names.add("jenishiya");
		names.add("mosesh");
		
		int index = names.indexOf("mosesh")+1 ;
		
		List<String> sub = names.subList(index , names.lastIndexOf("mosesh"));
		
		names.remove(index + sub.indexOf("mosesh"));
		
		System.out.println(names);
		

		
		
		
	
		
	}
}