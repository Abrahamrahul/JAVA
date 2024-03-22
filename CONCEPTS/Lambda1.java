public class Lambda1
{
	public static void main(String[] args)
	{
		Test t=()->
		{
			
			
				int a=10;
				System.out.println(a++ +" "+ ++a );
			
		};
		t.display();
		
		
	}
}

interface Test{
		public void display(int number);

		
	      }


