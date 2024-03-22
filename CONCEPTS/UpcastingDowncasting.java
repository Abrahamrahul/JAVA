public class UpcastingDowncasting{  
    
    public static void main(String[] args)   
    {   
        Parent p = new Child();  
        p.name = "Shubham"; 
	p.showMessage();
	System.out.println(p.name); 
        //System.out.print(p.age); cant access child  
    
        Child c = (Child)p;   
    
        c.age = 18;   
        System.out.println(c.name);   
        System.out.println(c.age);   
        c.showMessage(); 

	  
    }   
}  
class Parent 
{   
    String name;    
    void showMessage()   
    {   
        System.out.println("Parent method is called");   
    }   
}   
    
   
class Child extends Parent 
{   
    int age;   
  
    @Override  
    void showMessage()   
    {   
        System.out.println("Child method is called");   
    }  
}   
    
