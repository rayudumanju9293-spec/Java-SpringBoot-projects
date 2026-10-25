package Enumeration;

//over riding
class A{
	void cap()
	{
		System.out.println("Gun");
	}
}
class B extends A{
	void cap() {
		System.out.println("Fun");
	}
}
public class Day13 {
	public static void main(String[] args) {
		A ob = new B(); //to get Fun object B to get Gun object for A
		ob.cap();
	}

}
