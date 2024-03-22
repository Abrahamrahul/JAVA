interface Test{
		public void display();
	      }


public class Lambda
{
	public static void main(String[] args)
	{
		Test t=new Test()
		{
			public void display()
			{
				System.out.println(10);
			}
		};
		t.display();
	}
}
