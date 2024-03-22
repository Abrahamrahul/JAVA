class This2
{  
	public static void main(String args[])
	{  
		Main obj=new Main();  
		Main obj1=new Main(); 
		obj.b();  
		obj1.b();  
	}
}  



class Main
{  
	void a(){System.out.println("from a by "+this);}  
	void b()
	{  
		System.out.println("from b by "+this);  
		//a(); 
		this.a();  
	}  
}  




	