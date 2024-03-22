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
		for(int i=1;i<N;i++)
		{
			double a=Math.sqrt(i);
		 	if(a-Math.floor(a)==0)
				count++;
		}System.out.println(count);
		
	}
}

		
		
  		
        