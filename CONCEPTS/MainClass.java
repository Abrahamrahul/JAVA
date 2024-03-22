public class MainClass
{
	
	public static void main(String[] args)
	{
		GetterSetter obj=new GetterSetter();
		
		obj.setData(10);
		System.out.print(obj.getData());
	}	
	
}
public class GetterSetter
{
	private int variable=1;
	public int getData()
	{
		
		return variable;
	}
	public void setData(int variable)
	{
		System.out.println(this.variable);
		this.variable=variable+10;
		
	}
}





















	