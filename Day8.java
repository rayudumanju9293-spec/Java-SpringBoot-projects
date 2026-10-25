package Enumeration;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

public class Day8 {
	
	public static void main(String[]args) {
		List<String> obj = new ArrayList<>();
		obj.add("Manju");
		obj.add("2003-01-09");
		String obj1 = obj.get(1);
		System.out.println(obj1);
		Vector<Integer> v = new Vector<Integer>();
		v.add(100);
		v.add(99);
		int obj2 = v.get(1);
		System.out.println(obj2);
		
		
	}

}
