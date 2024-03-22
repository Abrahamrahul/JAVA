//this is a reference variable that refers to the current object.

public class ThisKeyword
{
	public static void main(String[] args)
	{
		ThisKeyword obj=new ThisKeyword();
		ThisKeyword obj1=new ThisKeyword();
		System.out.println(obj);
		System.out.println(obj1);
		obj.test();
		obj1.test();
	}
	public void test()
	{
		System.out.println(this);
	}
	
}
























	