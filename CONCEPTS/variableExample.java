public class variableExample{

	static int a = 10;
	int b = 20;

	public static void main(String[] args){
		int c = 30;
		variableExample v = new variableExample();

		System.out.println("Java Variables");
		System.out.println("Local Variable "+ c);
		System.out.println("Instance Variable "+ v.b);
		System.out.println("Static Variable "+ a);
		System.out.println("Static Variable "+ variableExample.a);
	}
}