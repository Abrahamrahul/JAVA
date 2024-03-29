import java.util.*;
public class ArrayListExample
{
	public static void main(String[] args)
	{

		PriorityQueue<Integer>arr=new PriorityQueue<>();
		arr.add(5);
		arr.add(3);
		arr.add(8);
		arr.add(4);
		arr.add(5);
		arr.add(3);
		arr.add(8);
		arr.add(4);
		arr.remove(8);
		System.out.println(arr);
	
			
	}
}