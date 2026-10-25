package Enumeration;
public enum Day{
Sunday,
Monday,
tuesday,
Wenesday,
Thursday,
Friday,
Saturday;
//Getter Method
	public static Day[] getDesc(){
	
		return Day.values();
		
}
		public static void main(String [] args)
		{
			//Reading the values from enum method using variable
			Day[] Desc1 = Day.getDesc();
			//printing the values
			for(Day desc : Desc1){
			System.out.println(desc);
			}
		}
	}	
	