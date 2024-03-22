/*
class This10 extends A
{  
	public void display()
	{  
		System.out.print(super.getA());  
	}  
	public static void main(String args[])
	{
		display();
	}
} 
class A
{  
	A getA()
	{  
		return this;  
	}  
	void msg()
	{
		System.out.println("Hello java");
	}  
}  

  
*/

class This10
{
	
	
	public void play()
	{
		System.out.println(10);
	}
	public static void main(String[] args)
	{
		new This10().play();
	}
}
//new A();