import java.util.*;
public class NonStaticVar
	{	
		int globalVar=10;
		public static void main(String[] args)
		{
				NonStaticVar t=new NonStaticVar();
				t.NonStaticVar();
				
		}
		public void NonStaticVar()
		{
			System.out.println(globalVar);	
		}
		
	}

		