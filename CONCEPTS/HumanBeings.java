public class HumanBeings 
{

	static int eyes=2;
	static int hands=2;
	public static void main(String[] args)
	{
		HumanBeings person1=new HumanBeings();
		person1.eat("Apple",3);
		person1.education("BE.CSE",8.27);
		person1.run(22,3);	
	}



	public void eat(String food,int numberOfFood)
	{
		System.out.println("He Ate "+numberOfFood+" "+food);
	}
	public void education(String degree,double cgpa)
	{
		System.out.println("Degree "+degree+" & CGPA is "+cgpa);
	}
	public void run(int speed,int lap)
	{
		System.out.println("He ran "+lap+" laps at the speed of "+speed);
	}
	
	
}






















	