import java.util.*;
import java.io.*;
class Solution 
{
	public static void main(String []args)
	{
		System.out.println("Enter an Number : ");
		Scanner input=new Scanner(System.in);
		int N=input.nextInt();


		if(N!=0)
		{
			for(int i=0;i<N;i++)
			{
				for(int j=N;j>0;j--)
				{
					for(int k=0;k<N-k;k++)
					{
						System.out.print(j);
					}
				}System.out.print("$");
				
			}
		}
	}
}

		
		
  		
        