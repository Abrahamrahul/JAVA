public class SingletonClass
{
	public static void main(String[] args)
	{
		ABC a = ABC.getInstance();
		a.display();
		ABC b = a;
		b.display();
	}
}

class ABC
{
	public static ABC obj = null;
	private ABC(){}
	
	public static ABC getInstance()
	{
		if(obj == null)
		{
			obj = new ABC();
		}
		return obj;
	}
	void display()
	{
		System.out.println("Hello");
	}
}

	