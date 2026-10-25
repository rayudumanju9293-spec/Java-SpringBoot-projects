package Enumeration;

class Day11 {
	public void gun(int x, int y){
		System.out.println("over ride");
		System.out.println( x+y);
	}

}

 class Day10 extends Day11{
	
	 	public void gun(int x, int y)
	 	{
	 		
			System.out.println(x*y); 
	 	}
 	}


 class Day7{
	public static void main(String[] args) {
	   Day11 obj = new Day11();
	   obj.gun(56, 94);
//	   Day11.Day10 obj1 = obj.new Day10(); --- IF we declare the class inside of a class
//	   obj1.gun(5, 94);
	   Day10 obj1 = new Day10(); //if we class class outside of the class
	   obj1.gun(55, 94);
	    
	}
		
}

