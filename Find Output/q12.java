public class Main 
{ 
    public static void main(String args[]) 
    { 
        short s = 0; 
        int x = 07; 
        int y = 08;      //error octal 0-8 
        int z = 112345; 
  
        s += z; 
        System.out.println("" + x + y + s); 
    } 
} 
