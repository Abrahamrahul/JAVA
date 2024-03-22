import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.Scanner;
public class forCheck
{
	public static void main(String[] args)
	{

			String check="^\\s*for\\s*\\([^;]*;[^;]*;[^)]*\\)\\s*\\{.*}$";
			Pattern pattern=Pattern.compile(check);
			
			Scanner in=new Scanner(System.in);
			String input=in.nextLine();
			
			Matcher match=pattern.matcher(input);
			System.out.println(match.matches());
	}
}
			
	