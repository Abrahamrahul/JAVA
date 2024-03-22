
import java.util.regex.*;
public class Demo
{
	public static void main(String[] args)
	{
		String r="rahul is a Human";
						//Pattern p = Pattern.compile("Human$"); 
						//Pattern p = Pattern.compile("^rahul");
						//Pattern p=Pattern.compile("i|a");
						//Pattern p=Pattern.compile("[ahu]");
						//Pattern p=Pattern.compile("[^ra]");
						//Pattern p=Pattern.compile("[a-z]");
						//Pattern p=Pattern.compile("[0-9]");
						//Pattern p=Pattern.compile("[A-Z]");
						//[a-zA-z0-9]
		Pattern p=Pattern.compile("[//s]");
		Matcher m = p.matcher(r);

		
		System.out.println(m);
		System.out.println(m.find());
		System.out.println(m.group());
		System.out.println(m.start());
		System.out.println(m.end());
		
	}
}
		
	

