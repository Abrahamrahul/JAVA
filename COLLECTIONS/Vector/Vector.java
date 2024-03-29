import java.util.*;
import java.io.*;
public class VectorExample
{
	public static void main(String []args) throws InterruptedException
	{
		

		List<Integer> obj1 =Collections.synchronizedList(new ArrayList<>());
		
		Thread t1=new Thread(()->{
			for(int i=0;i<100;i++)
			obj1.add(i);
		});
		Thread t2=new Thread(()->{
			for(int i=0;i<100;i++)
			obj1.add(i);
		});
		t1.start();
		t2.start();
		t1.join();
		t2.join();
		System.out.println(obj1.size());
		
		
		
		List<Integer> obj=new Vector<>();
		
		t1=new Thread(()->{
			for(int i=0;i<100;i++)
			obj.add(i);
		});
		t2=new Thread(()->{
			for(int i=0;i<100;i++)
			obj.add(i);
		});
		t1.start();
		t2.start();
		t1.join();
		t2.join();
		System.out.println(obj.size());
		
		




		
	}
} 