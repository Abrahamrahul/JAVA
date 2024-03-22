public class GarbageCollector{
		
	GarbageCollector a=new Garbagecollector();
	GarbageCollector b=new Garbagecollector();
	a.display();
	b.display();
	a=b;
	System.gc();
	a.display();
	b.display();
	public display()
	{
		System.out.println("A");
	}
	public display1()
	{
		System.out.println("B");
	}
	public static void main(String[] args){
		
		System.out.println("From Main");
	}
}	