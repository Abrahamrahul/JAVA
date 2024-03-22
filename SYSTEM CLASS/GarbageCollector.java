import java.util.*;
import java.io.*;
public class GarbageCollector
{
	public static void main(String[] args)
	{	System.out.println(Runtime.getRuntime());
		long beforeMem = Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory(); 
		System.gc();
		long afterMem =  Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory(); 
		System.out.println(beforeMem);
		System.out.println(afterMem);
	}
}