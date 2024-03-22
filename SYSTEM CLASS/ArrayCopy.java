import java.util.*;
public class ArrayCopy
{
	public static void main(String[] args)
	{
		boolean arr[]=new boolean[5];

		Scanner input=new Scanner(System.in);

		for(int i=0;i<arr.length;i++)
			arr[i]=input.nextBoolean();

		System.out.println("BEFORE\n\n");

		for(boolean i : arr)
			System.out.print(i+"\t");

		boolean arr1[]=new boolean[3];

		System.arraycopy(arr,1,arr1,0,1);    // src array , index start from , dist array , index start from ,len of dest array
		
		System.out.println("\n\n");

		for(boolean i : arr1)
			System.out.print(i+"\t");		
	}
}