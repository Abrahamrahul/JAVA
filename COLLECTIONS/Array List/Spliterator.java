import java.util.*;
public class ArrayListExample
{
	public static void main(String[] args)
	{

		ArrayList<Integer>arr=new ArrayList<>();
		arr.add(1);
		arr.add(2);
		arr.add(3);
		arr.add(4);
		arr.add(5);
		arr.add(6);
		arr.add(null);
		
		

		/*
			Spliterator<Integer> split = arr.spliterator();

			while(split.tryAdvance(System.out::print)==true)
			{	
				split.tryAdvance(System.out::print);
			}
		*/

		Spliterator<Integer> secondhalf = arr.spliterator();
		
		Spliterator<Integer> firsthalf = secondhalf.trySplit();

		//Spliterator<Integer> thirdsplit = secondhalf.trySplit();
		
		//firsthalf.forEachRemaining(System.out::print);
		System.out.println();
		
		//thirdsplit.forEachRemaining(System.out::print);
		System.out.println();
		secondhalf.forEachRemaining(System.out::print);
		



	}
}