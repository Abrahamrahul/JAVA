import java.util.*;

class Solution 
{
	public static void main(String []args)
	{
		ArrayList<String> names=new ArrayList<>();
		names.add("rahul");
		names.add("mosesh");
		names.add("sakthi");
		names.add("mosesh");
		names.add("madan");
		names.add("mosesh");
		names.add("jenishiya");
		names.add("mosesh");

		int count=0;

		String element=names.get(0);
		names.forEach(i->
		{
		
			
			if(element==(names.get(i)))
				names.remove(i);
			return true;
		});		
	}
}


		
		
  		
        