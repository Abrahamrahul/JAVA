//getProperty getProperties clearProperty setProperties setProperty   


public class GetProperty
{
	public static void main(String[] args)
	{
		System.out.println(System.getProperty("os.name"));
		System.out.println(System.getProperty("os.arch"));
	
		System.out.println(System.getProperty("java.version"));
		System.out.println(System.getProperty("java.vendor"));
		System.out.println(System.getProperty("java.home"));
		System.out.println(System.getProperty("java.vm.version"));
		System.out.println(System.getProperty("java.runtime.name"));
		System.out.println(System.getProperty("java.class.path")); 	//
		System.out.println(System.getProperty("java.vendor.url"));

		System.out.println(System.getProperty("user.home"));
		System.out.println(System.getProperty("user.dir"));
		System.out.println(System.getProperty("user.name"));	
		System.out.println(System.getProperty("user.language"));
		System.out.println(System.getProperty("user.country"));	
		
		System.out.println("This is an example for"+System.getProperty("line.separator")+"Line Separator");	
		System.out.println(System.getProperty("file.separator"));
		System.out.println(System.getProperty("path.separator")); 		//
				
	}
}