import java.util.*;
class Instanceof
{	
	static String obj;
	public static void main(String[] args)
	{	

		//System.out.println(obj instanceof String);
		String obj1 =new String();
		String obj2 =null;
		String obj3 ="Rahul";
		Object obj4=obj1;
		System.out.println(obj4.getClass().getSimpleName()); //to find datatype		
		System.out.println(obj4 instanceof String);
		System.out.println(obj1 instanceof String);
		System.out.println(obj2 instanceof String);
		System.out.println(obj3 instanceof String);

		Instanceof I =new Instanceof();			//if Instanceof I; then error:variable I might not have been initialized 
		System.out.println(I instanceof Instanceof);

		ArrayList<Integer> a=new ArrayList<>();
		System.out.println(a instanceof ArrayList);

	}
}