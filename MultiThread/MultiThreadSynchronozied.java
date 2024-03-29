public class MultiThreadExample
{
	
	public static void main(String []args)
	{
	
		Class2 obj = new Class2();
		Thread t1 =new Thread(obj);
		Thread t2 =new Thread(obj);
		t1.start();
		t2.start();
		
	}
}

public class Class2 implements Runnable
{
			synchronized public void run()
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
			}
}
	

	