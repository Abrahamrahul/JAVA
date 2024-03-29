import java.util.*;
public class LinkedListExample
{
	public static void main(String[] args)
	{

		//ways to declare linked list


		LinkedList<Integer> list1= new LinkedList<>(Arrays.asList(1,2,3));
		LinkedList<String> list2= new LinkedList<>(Collections.nCopies(5,"Rahul"));
		LinkedList<String> list3= new LinkedList<>(List.of("Abraham","Rahul","Lazaras"));
		LinkedList<Integer> list4 = new LinkedList<>();

		
		//common methods

		list4.add(1);
		list4.add(2);
		list4.add(3);
		System.out.println(list4);

		list4.addFirst(0);
		list4.addLast(2);
		System.out.println(list4);

		//getfirst and last doesnt alter te original list 
		
		System.out.println(list4.getFirst());
		System.out.println(list4.getLast());
		System.out.println(list4);

	
		//peek,pop,push,poll	(not in interface List)

		System.out.println("\nPop,Push,Poll,Peek\n");
		list4.clear();
		System.out.println(list4.pop());
		System.out.println(list4+"\n");

		list4.push(0);
		System.out.println(list4+"\n");
		
		System.out.println(list4.peek());
		System.out.println(list4+"\n");

		
		//list4.remove();

		System.out.println(list4.poll());
		System.out.println(list4.pollLast());

		System.out.println(list4+"\n");
		

		
	}
}