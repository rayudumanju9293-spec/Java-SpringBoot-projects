package Enumeration;

public enum Day1{
	R1("Changr yourself"),
	R2("Achieve"),
	R3("Be honest"),
	R4("Don't lose hope"),
	R5("Everything happens for the a reason"),
	R6("Belive in god");
	
	//Declare a variable 
		 private String Desc;
		 //Constructor
		 Day1(String Desc){
			 this.Desc = Desc;
		 }
		 //Getter method
		 public String getDesc() {
			 return Desc;
		 }
		 public static void main(String []args)
		 {
			 for(Day1 D1 : Day1.values()) {
				// name specified to particular value 
				// System.out.println(D1.name());
				 //Reading using getter method
				// System.out.println(D1.getDesc());
				 
				 System.out.println(D1.name()+ ":" +D1.getDesc());
				 
			 }
		 }
	
	
}