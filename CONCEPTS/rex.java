import java.util.regex.*;
public class rex
{
	public static void main(String[] args)
	{
		
		String r="rahul is a Human";
		Pattern p = Pattern.compile("Human$"); //Pattern p = Pattern.compile("^rahul");
		Matcher m = p.matcher(r);
		
		System.out.println(m);
		System.out.println(m.find());
		System.out.println(m.group());
		System.out.println(m.start());
		System.out.println(m.end());
	}

}
