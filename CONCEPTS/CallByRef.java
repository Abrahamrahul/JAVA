//also applicable for Array

import java.util.*; 
class CallByRef
{	static int a=10; //----->doesnt change
	public static void main(String[] args)
	{
		ArrayList<Integer> l = new ArrayList<>();//-------> changes
		l.add(10);
		l.add(20);
		l.add(30);
		
		method(l);
		method1(a);
		System.out.println(l+"\n"+a);
	}
	public static void method(ArrayList<Integer> x)
	{
		x.add(40);
	}
	public static void method1(int a)
	{
		a=100;
	}
}