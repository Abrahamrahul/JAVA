import java.util.*;  
class Arithmetic
{  
	public static int add(int a, int b)
	{  
		return a+b;  
	}  
}  

public class MethodReference3 
{  
	public static void main(String[] args) 
	{  
		MethodReference3 adder = Arithmetic::add;  
		int result = adder.apply(10);  
		System.out.println(result);  
}  
}  