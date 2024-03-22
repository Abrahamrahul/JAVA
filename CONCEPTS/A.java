class Multilevel
{  
	
	public static void main(String args[])
	{  
		Child c=new Child();
		Parent p=new Parent();
		GrandParent gp= new GrandParent();	
		/*c.print1();		//child object can access from all this predesessor
		c.print2();
		c.print3();	
		p.print1();
		p.print2();
		//p.print3();		//parent object cant access child
		gp.print1();
		//gp.print2();
		//gp.print3();*/


		GrandParent gp1 = new Child();	
		GrandParent gp2 = new Parent();
		gp1.print1();
		//gp1.print2();
		//gp1.print3();
		gp2.print1();
		//gp2.print2();
		//gp2.print3();
	}  
	
}
class GrandParent
{  
	public void print1(){System.out.println("From GrandParent");}  
}  
  
class Parent extends GrandParent
{  
	public void print2(){System.out.println("From Parent");}  
	public void print1(){System.out.println("From GrandParent");}  
} 
class Child extends Parent
{  
	public void print3(){System.out.println("From Child");}
	public void print1(){System.out.println("From GrandParent");}    
}  
