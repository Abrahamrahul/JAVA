import java.util.*;
import java.io.*;
public class VectorExample
{
	public static void main(String []args)
	{
		List<Integer> obj=new Vector<>();
		long start=System.currentTimeMillis();
		Thread t1=new Thread(()->{
			for(int i=0;i<100000;i++)
			obj.add(i);
		});
		Thread t2=new Thread(()->{
			for(int i=0;i<100000;i++)
			obj.add(i);
		});
		t1.start();
		t2.start();
		
		System.out.println("Vector "+(System.currentTimeMillis()-start)+"ms");


		ArrayList<Integer> obj1 =Collection.synchronizedList(new ArrayList<>());
		start=System.currentTimeMillis();
		t1=new Thread(()->{
			for(int i=0;i<1000000;i++)
			obj1.add(i);
		});
		t2=new Thread(()->{
			for(int i=0;i<1000000;i++)
			obj1.add(i);
		});
		t1.start();
		t2.start();
		
		System.out.println("ArrayList "+(System.currentTimeMillis()-start)+"ms");




		
	}
} 