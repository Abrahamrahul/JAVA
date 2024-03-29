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
		/*
		if(names.contains("mosesh"))
		{
			@SuppressWarnings("unchecked") ArrayList<Integer> dup= (ArrayList<Integer>)names.clone();
			Collections.sort(dup);
			//System.out.println(dup);
			
			int index=names.lastIndexOf("mosesh")-(dup.indexOf("mosesh")) ;			
			names.remove(index);

			System.out.println(names);
		}
		*/


		int index = names.indexOf("mosesh")+1 ;
		
		List<String> sub = names.subList(index , names.lastIndexOf("mosesh"));
		sub.remove(sub.indexOf("mosesh"));
		names.remove(index + sub.indexOf("mosesh"));
		
		System.out.println(names);
		
	}
}

		
		
  		
        