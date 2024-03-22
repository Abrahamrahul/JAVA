import java.util.*;
import java.io.*;
class Solution 
{
	public static void main(String []args)
	{
		System.out.print("Enter an Number : ");
		Scanner input=new Scanner(System.in);
		int N=input.nextInt();


		mult(N);
	}
	public static void mult(int N)
	{
		int i=1;
		for(int k=0;k<10;k++)
		{
			System.out.println(N*i);
			i++;
		}
					
	}
}

		
		
  		
        