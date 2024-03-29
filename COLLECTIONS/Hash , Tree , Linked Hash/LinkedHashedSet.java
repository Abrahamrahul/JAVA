import java.util.*;
public class LinkedHashSetExample
{
	public static void main(String[] args)
	{
		HashSet<String> hashset1 = new HashSet<>();
		LinkedHashSet<String> hashset2 = new LinkedHashSet<>();

		
		
		hashset1.add("cddfdsa");
		hashset1.add("Dldsjlf");
		hashset1.add("Adfsd");
		hashset1.add("bkjdfds");

				
		Iterator<String> itr = hashset1.iterator();		
		while(itr.hasNext())
			System.out.println(itr.next());
		hashset1.forEach(System.out::println);

		
		hashset2.add("cddfdsa");
		hashset2.add("Dldsjlf");
		hashset2.add("Adfsd");
		hashset2.add("bkjdfds");

		System.out.println(hashset2);

		
				
		System.out.println(hashset2);
	}
}