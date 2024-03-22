public class GetterSetter
{
	
	public static void main(String[] args)
	{
		Values v=new Values();
		
		v.setData(10);
		System.out.print(v.getData());
	}	
	
}
public class Values
{
	private int a=1;
	public int getData()
	{
		
		return a;
	}
	public void setData(int a)
	{
		System.out.println(this.a);
		this.a=a+10;
		
	}
}





















	