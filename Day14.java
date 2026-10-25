package Enumeration;
//Inheritance

class E{
	void bit() {
		System.out.println("Get");
	}
}
class D extends E{
	void hit() {
		System.out.println("Put");
	}
}
public class Day14 {
	public static void main(String[] args) {
		D ob = new D();
		ob.bit();
		ob.hit();
	}

}
