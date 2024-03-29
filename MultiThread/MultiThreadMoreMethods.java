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
		t1.setName("Thread1");
		System.out.println(t1.getName());
		t1.start();
		
	}
}
	

	