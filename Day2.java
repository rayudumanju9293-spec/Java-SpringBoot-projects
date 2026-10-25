package Enumeration;


import java.util.*;

class Day2<E>{
		
		private List<E> list;
	
		public Day2(){
			this.list = new ArrayList<>();
		}
	public void insert(E element) {
		list.add(element);
	}
	public List<E> getlist(){
		return list;
	}
	
	public static void main(String[] args) {
		//List
		List<Integer>  name = new ArrayList<>();
		name.add(100);
		System.out.println(name);
		//Set
		Set<String> number = new HashSet<>();
		number.add("Enjoy");
		System.out.println(number);
		//Map
		Map<String, String> address = new HashMap<>();
		address.put("G.Mamidada", "Andhra Pradesh");
		System.out.println(address);
		//Custom List wrapper class
		Day2<String> Fun = new Day2<>();
		Fun.insert("Paris");
		System.out.println(Fun.getlist());
		Day2<Integer> Run = new Day2<>();
		Run.insert(1000);
		System.out.println(Run.getlist());
		
	
	
	}
}