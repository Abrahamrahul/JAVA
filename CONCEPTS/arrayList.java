import java.util.*;
public class arrayList{
	public static void main(String[] args){
		ArrayList<Integer> l = new ArrayList<>();
		l.add(10);
		l.add(20);
		l.add(30);
		l.add(20);
		l.add(20);
		l.remove(0);
		System.out.println(l.indexOf(20));
		System.out.println(l.lastIndexOf(20));
		System.out.println(l);
	}
}