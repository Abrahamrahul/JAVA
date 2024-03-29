import java.util.*;
public class ArrayListExample
{
	public static void main(String[] args)
	{

		//ways to declare Arraylist

		ArrayList<Integer> arr1= new ArrayList<>();
		//ArrayList arr2= new ArrayList();		//unchecked Warning
		//List arr3= new ArrayList();
		//List<Integer> arr4= new ArrayList<>();
		//using Methods

		arr1.add(5);
		arr1.add(3);
		arr1.add(5);
		arr1.add(2);
		arr1.add(2,10);	 //push to add
		arr1.set(0,100);   //remove to add
		arr1.remove((Integer)5);
		System.out.println(arr1);
		System.out.println("Size of ArrayList : "+arr1.size());
		System.out.println("Element in the index 2 : "+arr1.get(2));   //gives the element in the index

		//contains

		System.out.println("Is ArrayList1 contain 3 : "+arr1.contains(3));


		//isEmpty

		System.out.println("Is ArrayList1 Empty : "+arr1.isEmpty());


		//indexOf

		System.out.println("Index of 3: "+arr1.indexOf(3));

		
		//sort()

		Collections.sort(arr1);
		System.out.println("After Sort : "+arr1);
		Collections.sort(arr1,Collections.reverseOrder());
		System.out.println("After Reverse Sort: "+arr1);

		//clear()

		arr1.clear();

		System.out.println("ArrayList1 after Clear : "+arr1);
		System.out.println("Is ArrayList1 Empty : "+arr1.isEmpty());	

		//ways to print

		/*
		for(int i:arr1)
			System.out.print(" "+i);

		System.out.println();
		arr1.forEach(System.out::print);		//2 argu 
		
		arr1.forEach(i -> System.out.println(i));   
		*/
		
		






















		//more ways

		List<Integer> arr5= new ArrayList<>(Arrays.asList(1,2,3));
		List<String> arr6= new ArrayList<>(Collections.nCopies(5,"Rahul"));
		List<String> arr7= new ArrayList<>(List.of("Abraham","Rahul","Lazaras"));


		System.out.println("\n\n\n");
		System.out.println("Declare And Initialize :-\n");
		System.out.println(arr5);
		System.out.println(arr6);
		System.out.println(arr7);
	}
}