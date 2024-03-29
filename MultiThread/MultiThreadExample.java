public class MultiThreadExample
{
	
	public static void main(String []args)
	{
		Class2 thread = new Class2(1);
		Thread t1 = new Thread(thread); 
		t1.start();
		try
		{
			System.out.println(t1.isAlive());
			t1.join();
		}catch(Exception e){}
	
		Class2 thread1 = new Class2(2);
		Thread t2 = new Thread(thread1); 
		t2.start();

	}
}
public class Class2 implements Runnable //extends Thread 
{

	private int threadNumber;
	Class2(int threadNumber)
	{
		this.threadNumber=threadNumber;
	}

	@Override
	public void run()
	{
		for(int i=0;i<5;i++)
		{
			System.out.println(i+" From Thread "+threadNumber);
			try
			{
				Thread.sleep(1000);
			}
			catch(Exception e){}
			
		}	
	}
}

	