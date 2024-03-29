import java.util.*;
public class DynamicArrayDemo
{
	public static void main(String args[])
	{
		DynamicArray list = new DynamicArray();
		Scanner scanner = new Scanner(System.in);
			
	}
}
class DynamicArray
{
	int[] arr ;
	int size;
	int capacity;
	static final int initialcapacity=16;
	
	DynamicArray()
	{
		size=0;
		arr = new int[initialcapacity];
		capacity=initialcapacity;
	}
	void expandArray()
	{
		capacity=capacity*2;
		arr=java.util.Arrays.copyOf(arr,capacity);
	}
	 
}
