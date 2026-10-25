package Enumeration;
//Overloading
public class Day5 {
	public int gun(int x, int y) {
		return x+y;
	}
	public int gun(int x, int y, int z) {
		return x-y+z;
	}
	public static void main(String[] args) {
		Day5 obj = new Day5();
		System.out.println("2 arguments: " + obj.gun(5, 6));
		System.out.println("3 arguments: " + obj.gun(5, 6, 9));
	}

}
