import java.util.*;
public class Example 
{
    	public static void main(String[] args) 
	{
        
        	List<Integer> numbers = new ArrayList<>();
        	numbers.add(1);
        	numbers.add(2);
        	numbers.add(3);
        	numbers.add(4);
        	numbers.add(5);
		numbers.removeIf(i -> i<3);
        	//System.out.println("Numbers after removing: " + numbers);

		numbers.replaceAll(i -> i*2); 
		System.out.println(numbers);
		//numbers.clear();
		List<Integer> list2 = new ArrayList<>();
		list2.add(1);
        	list2.add(2);
        	list2.add(3);
		list2.add(5);
        	list2.add(6);
		//list2.clear();
		System.out.println(numbers.retainAll(list2));
		//System.out.println(list2);
		System.out.println(numbers);

    }
}
