class This5
{  
  	int data=10;  

  	This5()
	{  
   		B b=new B(this);
		System.out.println("Hash Of object b:"+b);    
   		b.display();  
  	}  
  	public static void main(String args[])
	{  
   		This5 a=new This5();
		//This5 a1=new This5();                       
		System.out.println("Hash Of object a:"+a);  
		//System.out.println("Hash Of object a1:"+a1);
  	}  
}  

class B
{  
  	This5 obj; 
 
  	B(This5 obj)
	{  
   		 this.obj=obj;  
	}  
  	void display()
	{  
    		System.out.println("The data is: "+obj.data+" by "+obj);
  	}  
}  
  






	