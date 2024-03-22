class inheritance { 
    public static void main(String args[]) 
    { 
        B obj = new B(); 
        obj.i = 1; 
        
        obj.display(); 
    } 
} 
class A { 
    public int i; 
    
} 
  
class B extends A { 
    void display() 
    { 
        super.i = super.i + 1; 
        System.out.println(super.i); 
    } 
} 
  
