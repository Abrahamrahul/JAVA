import java.util.*;
public class ExpandArray
{
	static int size;
	public static void main(String args[])
	{
		ExpandArray obj1=new ExpandArray();
		obj1.process();
	}
	void process()
	{
		Scanner input=new Scanner(System.in);
		System.out.println("Enter size of array : ");
		this.size=input.nextInt();
		ExpandArray obj=new ExpandArray();
		int[] arr=new int[this.size];
		
		System.out.println("Enter Elements for array of size "+size+" : ");
		for(int i=0;i<this.size;i++)
			arr[i]=input.nextInt();
		System.out.println("Do You Still Want to Insert(y/n) : ");
		char choice =input.next().charAt(0);

		if(choice == 'Y' || choice == 'y')
		{
			obj.expandArray(arr,size);
			System.out.println("Enter more Elements : ");

			for(int i=this.size;i<arr.length+1;i++)
				arr[i]=input.nextInt();
			size=arr.length;
			for(int i=this.size;i<arr.length;i++)
				System.out.println(arr[i]);
		}
		if(choice == 'N' && choice == 'n')
		{
			System.out.println("Array \n");
			for(int i=this.size;i<arr.length;i++)
				System.out.println(arr[i]);	
		}
	}	
	void expandArray(int arr[],int size)
	{
		this.size=this.size*2;
		arr=java.util.Arrays.copyOf(arr,this.size);
	}
	 
}
