import java.util.*;
public class LinkedListExample
{
	public static void main(String[] args)
	{


		LinkedList<Integer> list4 = new LinkedList<>();
		
		list4.add(10);
		list4.add(20);
		list4.add(30);

		//list4.clear();

	/*	
		System.out.println(list4.peek());		//null

		System.out.println(list4.element());		//returns nosuchelementexception
		System.out.println(list4);

		System.out.println("\n");


		Iterator<Integer> itr =list4.iterator();
		Iterator<Integer> deitr =list4.descendingIterator();
		System.out.println(itr.next());
		while(itr.hasNext())
			System.out.println(itr.next());

		System.out.println("\n");

		while(deitr.hasNext())
			System.out.println(deitr.next());
*/
		ListIterator<Integer> itr =list4.listIterator();
		while(itr.hasNext())
		{
			
			System.out.println(itr.next());
		}
					

		
	}
}