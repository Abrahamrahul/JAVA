public class garbageMethod
{
	public void finalize()
	{
		System.out.println("Finalized Method is invoked");
	}  
	public static void main(String[] args)
	{
		garbageMethod s1=new garbageMethod();  
  		garbageMethod s2=new garbageMethod();  
  		s1=null;  
  		s2=null;  
  		System.gc();
		System.out.println("Garbage Cleared");
	}
}
 		