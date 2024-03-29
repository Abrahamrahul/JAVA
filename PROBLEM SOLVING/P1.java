import java.util.*;

class Solution 
{
	public static void main(String []args)
	{
		Scanner input =new Scanner(System.in);
		System.out.println("Enter a number : ");
		int number = input.nextInt();

		a : for(int i=0;i<=number;i++)
		{
			for(int j=0;j<=number;j++)
			{
				if((i+j)!=number)
					break a;
				else
					System.out.println(i+ "+" +j+"="+number);
			}
		}
	}
}


		
		
  		
        