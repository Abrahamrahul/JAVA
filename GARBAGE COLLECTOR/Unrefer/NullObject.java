public class NullObject
{
	public static void main(String[] args)
	{

		NullObject obj =new NullObject();			//by null
		obj = null;
		System.out.println(obj instanceof NullObject);

		NullObject obj1 =new NullObject();			//by assigning it to another
		NullObject obj2 =new NullObject();
		System.out.println(obj1);
		System.out.println(obj2);
		obj1=obj2;
		System.out.println(obj1);
		System.out.println(obj2);

		new NullObject();					//Anonymous object

	}
}
		