// A method in private cant be override to other accessmodifiers
//protected --> public,protected

class AccessModifiers
{
	private void method()
	{
		System.out.println("method");
	}
	public static void main(String[] args)
	{
		new Child().method();
	}
}

class Child extends AccessModifiers
{
	@Override private void method()
	{
		System.out.println("Overrided method");
	}

}

