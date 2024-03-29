import java.util.*;
public class TreeSetExample
{
	public static void main(String[] args)
	{/*
		TreeSet<String> treeset1 = new TreeSet<>();
		treeset1.add("Abraham");
		treeset1.add("Rahul");
		treeset1.add("Sakthi");
		treeset1.add("paul");
		treeset1.add("Mosesh");

		System.out.println(treeset1.ceiling("Madhan"));		//case sensitive - >= to given num or string  returns null
		System.out.println(treeset1.floor("Madhan"));		//case sensitive - <= to given num or string

		Comparator<String> comp = Comparator.comparingInt(String::length);//.reversed();
		TreeSet<String> Tset1 =new TreeSet<>(comp);

		//Comparator.comparingInt(String::length)

		Tset1.add("Mosesh");					//sorts based on length
		Tset1.add("Paul");
		Tset1.add("Sakthivel");
		Tset1.add("Abraham");

		Tset1.forEach(System.out::println);
	
		
		
		TreeSet<Integer> Tset2 = new TreeSet<>();
		Tset2.add(5);
		Tset2.add(1);
		Tset2.add(2);
		Tset2.add(9);
		System.out.println(Tset2);
		System.out.println(Tset2.first());
		System.out.println(Tset2.last());

		System.out.println(Tset2.higher(9));		//null
		System.out.println(Tset2.lower(1));		//null

		
		TreeSet<Integer> Hset = (TreeSet<Integer>) Tset2.headSet(5);		//strictly less than
		System.out.println(Hset+"HeadSet");

		TreeSet<Integer> Tailset = (TreeSet<Integer>) Tset2.tailSet(5);		//greater than and equaal
		System.out.println(Tailset+"TailSet");


		Hset = (TreeSet<Integer>)Tset2.headSet(5,false);			//false - excclude true - include		
		System.out.println(Hset);

		Tailset = (TreeSet<Integer>) Tset2.tailSet(5,false);			//false - excclude true - include	
		System.out.println(Tailset);

		TreeSet<Integer> Subset = (TreeSet<Integer>) Tset2.subSet(2,9);		//bw 2(included) and 9(Excluded)
		System.out.println(Subset);
		
		
*/
		TreeSet<Object> treeset1 = new TreeSet<>();
		treeset1.add("Abraham");
		treeset1.add(1);							//classcastException if  we try to store multiple datatype of element
		treeset1.add(true);
		treeset1.add(2.5);
		treeset1.add("Mosesh");
		System.out.println(treeset1);














	

		/*
		Integer[] a={1,2,3};
		Set<Integer> treeset2= new TreeSet<>(Arrays.asList(a));
		Set<String> treeset3 = new TreeSet<>(Collections.nCopies(5,"Rahul"));
		Set<String> treeset4 = new TreeSet<>(List.of("Abraham","Rahul","Lazaras"));
		System.out.println(treeset1);
		System.out.println(treeset2);
		System.out.println(treeset3);
		System.out.println(treeset4);
		*/	
	}
}