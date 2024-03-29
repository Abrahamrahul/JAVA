import java.util.*;
public class ArrayListExample
{
	public static void main(String[] args)
	{
		/*
		List<String> arr1= new ArrayList<>(Arrays.asList("Abraham","Rahul","Lazaras",null));
		List<String> arr2= new ArrayList<>(List.of("Abraham","Rahul","Lazaras"));			//null pointer exception

		arr1.set(3,"B");
		arr2.clear();

		System.out.println(arr1+"\n");
		System.out.println(arr2);
		*/

		String[] array1 = {"Abraham","Rahul","Lazaras",null};
		List<String> list1 =Arrays.asList(array1) ;		//mutable
		array1[3] = "B";

		System.out.println(list1); 

		String[] array2 = {"Abraham","Rahul","Lazaras"};
		List<String> list2 =List.of(array2) ;			//immutable
		array2[2] = "B";
		System.out.println(list2); 
/*
		Vector<String> vector = new Vector<>();
		vector.add("Lazaras");
		ArrayList<String> arrr =new ArrayList<>();
		ArrayList<String> arrr2 =new ArrayList<>(vector);
		arrr.add("Rahul");
		
		System.out.println(arrr2);*/
		
	}
}