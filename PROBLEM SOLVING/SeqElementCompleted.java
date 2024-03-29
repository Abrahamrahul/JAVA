import java.util.*;
import java.io.*;

class Solution 
{
	public static void main(String []args)
	{
		System.out.println("Enter Size for Array : ");
		Scanner input = new Scanner(System.in);
		int size = input.nextInt();

		int arr[] = new int[size];  

		System.out.println("Enter Element For the Array : ");
		for(int i=0;i<size;i++)
			arr[i]=input.nextInt();
		Arrays.sort(arr);
		System.out.println("The Array after sort is : ");
		for(int i=0;i<size;i++)
			System.out.println(arr[i]);

		int count=0;
		int temp=0;
		int countgreater=0;
		
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]==arr[arr.length - 1])
				break;
			if((arr[i]+1) == (arr[i+1]) ) 
				count++;
			else{temp=count;}
			if((arr[i]+1) != (arr[i+1]) )
			{
				temp=0;
				count=0;
			}
			
			
			
				
			if(count>countgreater)
				countgreater=count;	
			if(temp>count)
				count=temp;
				
		}

		
		System.out.println("The Length is : "+(countgreater+1));
		
			
				
	}
}


/*		
for(int i=0;i<(size+1);i++)
		{
			if(arr[i] < (arr[i+1]+1) || arr[i] == (arr[i+1]))
			{
				count++;
			}
			
			if(temp>count)
			{	
				count=temp;	
			}
			else
				temp=count;
		
		}	
*/	
  		
//countgreater=count;			//while 3rd consecutive count greater= count ah set pannetu count ah clear pannetu then compare  count and count greater 
			//if(countgreater>count)
   