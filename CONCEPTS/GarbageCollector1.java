import java.util.*;
public class GarbageCollector1{
		
	GarbageCollector a=new Garbagecollector();
	GarbageCollector b=new Garbagecollector();
	a=b;
	System.gc();
	
	
	public static void main(String[] args){
		
		System.out.println("From Main");
	}
}	