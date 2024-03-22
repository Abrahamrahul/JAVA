import java.util.*;
import java.io.*;
public class TimeAndHash
{
	public static void main(String[] args)
	{
		long a=System.currentTimeMillis();
		long b=System.nanoTime();
		
		StringBuilder obj = new StringBuilder("Happy");
		for(int i =0 ; i<100 ; i++)
			obj.append("Happy");
		System.out.println(System.currentTimeMillis()-a + "ms");
		System.out.println(System.nanoTime()-b + "ns");

		ArrayList<Integer> c = new ArrayList<>();
		for(int i=0 ; i<100 ; i++)
			c.add(i);
		System.out.println(System.currentTimeMillis()-a + "ms");
		System.out.println(System.nanoTime()-b + "ns");

//identity HashCode
		System.out.println(System.identityHashCode(obj));
				
	}
}