import java.util.*;
public class ArrayListExample
{
	public static void main(String[] args)
	{

		//clone

		ArrayList<Integer> arr1= new ArrayList<>();

		arr1.add(1);
		arr1.add(2);
		arr1.add(3);
	

		@SuppressWarnings("unchecked") ArrayList<Integer> arr2= (ArrayList<Integer>)arr1.clone();		//type change
		
		System.out.println("Original ArrayList : "+arr1);
		
		System.out.println("Cloned ArrayList :"+arr2+"\n");


		//addAll		
		
		ArrayList<Integer> arr3= new ArrayList<>();
		ArrayList<Integer> arr4= new ArrayList<>();

		arr4.add(10);
		arr4add(20);
		arr4.add(30);

		arr3.add(40);
		arr3.add(50);
		arr3.add(60);	
		
		//arr4.addAll(arr3);
		arr4.addAll(0,arr3);
		
		System.out.println("Original ArrayList: "+arr3);
		System.out.println("Added ArrayList: "+arr4);

	}
}
		


		












