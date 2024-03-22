public class Lambda
{
	public static void main(String[] args)
	{
		Test t=new Test()
		{
			public void display()	
			{
				int a=10;
				System.out.println(a++ +" "+ ++a );
			}
		};
		t.display();
	}
}

interface Test{
		public void display();
		

	      }


