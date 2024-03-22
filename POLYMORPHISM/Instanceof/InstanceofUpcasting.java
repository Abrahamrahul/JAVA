import java.util.*;
class InstanceofUpcasting
{	
	
	public static void main(String[] args)
	{	

		Parent obj=new Child();
		System.out.println(obj instanceof Parent);
		System.out.println(obj instanceof Child);

		Child c=(Child)obj;				//----> if (Parent) error:incompatible types: Parent cannot be converted to Child
		System.out.println(c instanceof Parent);
		System.out.println(c instanceof Child);

	}
}
class Parent
{
}
class Child extends Parent
{
}