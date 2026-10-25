package Enumeration;

public class Day6 {
	
	public static void main(String[]args) {
		int a[] = {29,39,48,49};
		int n = a.length;
		System.out.println(n);
		
		for(int x = 0;x<4;x++) {
			System.out.println("Values of arrys:" +a[x]);
		}
		
		int b[] = {503, 422,528,600};
		for(int x: b) {
			System.out.println("foreach values" +x);
		}
		String s = new String("welcomes");
		System.out.println(s);
		System.out.println(s.length());
		
	
	}
}
