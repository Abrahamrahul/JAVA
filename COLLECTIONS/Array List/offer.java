import java.util.*;
public class LinkedListExample
{
	public static void main(String[] args)
	{


		LinkedList<Integer> list4 = new LinkedList<>();

		list4.add(6);
		list4.add(1);
		list4.add(6);

		System.out.println(list4.offer(10));
		System.out.println(list4.offerFirst(0));
		System.out.println(list4.offerLast(11));

		System.out.println(list4);

		/*
		list4.removeLast();				//erase the last element
		System.out.println(list4);
		*/

		list4.removeLastOccurrence(6);			
		System.out.println(list4);

















		LinkedList<Integer> list=new LinkedList<>();
		
		for(; ; )
		{

			list.offer(1);

		}











				

		
	}
}