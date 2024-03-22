import java.util.*;
public class linkedList{
	public static void main(String[] args){
		LinkedList<Integer> l=new LinkedList<>();
		l.add(10);
		l.add(20);
		l.add(30);
		LinkedList<Integer> ll=new LinkedList<>();
		ll.add(40);
		ll.add(50);
		ll.add(60);
		l.addAll(2,ll);
		System.out.println(l.isEmpty());
		
	}
}