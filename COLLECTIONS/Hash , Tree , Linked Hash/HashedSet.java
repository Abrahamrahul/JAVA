import java.util.*;
public class HashSetExample
{
	public static void main(String[] args)
	{
		HashSet<Integer> hashset1 = new HashSet<>();
		HashSet<Integer> hashset2 = new HashSet<>();

		Set<String> hashset3= new HashSet<>(Arrays.asList("Rahul","Rahul",null));
		System.out.println(hashset3);

		hashset1.add(112123233);
		hashset1.add(212313133);
		hashset1.add(312312232);
		hashset1.add(112123133);
		hashset1.add(112123133);

		System.out.println(hashset1);

		//hashset1.clear();

		//System.out.println(hashset1);

		HashSet<Integer> hashset4=new HashSet<Integer>(hashset1);
		System.out.println(hashset1.contains(1));
		System.out.println(hashset1.isEmpty());
		System.out.println(hashset4);

	
		hashset1.remove(1);
		System.out.println(hashset1);

		System.out.println(hashset4.size());
				

	}
}