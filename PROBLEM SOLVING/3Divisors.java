import java.util.*;
import java.io.*;
import java.math.*;
class Solution 
{
	public static void main(String []args)
	{
		System.out.println("Enter an Number : ");
		Scanner input=new Scanner(System.in);
		int N=input.nextInt();
		int count=0;
		for(int i=2;i<=N;i++)
		{
			for(int j=1;j<=N;j++)
			{
				if((i%j)==0)
				{
					count++;
					if(count==3)
						System.out.println(j);	
				}
			}
		}
		
	}
}

		
		
  		
        