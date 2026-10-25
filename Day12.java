//Collections

package Enumeration;
import java.util.*;
import java.lang.*;

public class Day12 {
	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		@SuppressWarnings("rawtypes")
		ArrayList obj = new ArrayList();
		obj.add(10);
		obj.add("Manju");
		obj.add("ready");
		obj.add(99.5);
		System.out.println(obj); //10, Manju, ready
		ArrayList<Integer> obj1 = new ArrayList<Integer>();
		obj1.add(100);
		obj1.add(99);
		System.out.println(obj1);
		@SuppressWarnings("rawtypes")
		LinkedList obj2 = new LinkedList();
		obj2.add(42310);
		obj2.add(564300);
		System.out.println(obj2);
		LinkedList<String> n1 = new LinkedList<String>();
		n1.add("Ready to Kill");
		n1.add("Finish the war");
		n1.add("Sunshine");
		for(int i=0;i<n1.size();i++) {
			System.out.println("the index Quotes:" + n1.get(i));
		}
		obj.set(0,100);
		System.out.println(obj.get(0));
			
	}

}
