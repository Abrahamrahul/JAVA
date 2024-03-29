public class MultiThreadExample
{
	
	public static void main(String []args)
	{
		
		Runnable obj = () ->
		{
			
			
			for(int i=0;i<5;i++)
			{	
				System.out.println(i);
				try
				{
					Thread.sleep(1000);
				}
				catch(Exception e){}
			
			}	
		};
		Thread t1 =new Thread(obj);
		t1.setPriority(Thread.MAX_PRIORITY);
		t1.start();

		Runnable obj1 = () ->
		{
			
			
			for(int i=0;i<5;i++)
			{	
				System.out.println(i);
				try
				{
					Thread.sleep(1000);
				}
				catch(Exception e){}
			
			}	
		};
		Thread t2 =new Thread(obj1);
		t2.setPriority(Thread.MIN_PRIORITY);
		t2.start();
		
	}
}
	

	