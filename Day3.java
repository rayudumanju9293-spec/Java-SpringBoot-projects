package Enumeration;
import java.io.*;
//serialization 

class Day3 implements Serializable{
	
	private static final long serialVersionUID = 1L;
	private String name;
	private String place;
	public int number;	public Day3(String name, String place, int number){
		this.name = name;
		this.place = place;
		this.number=number;	
	}
	 @Override
	    public String toString() {
	        return "Day3{name='" + name + "', place='" + place + "', number=" + number + "}";
	    }
	public static void main(String []args) {
		Day3 custom = new Day3("Man","Vizag",21);
		String filename ="C:\\Users\\MANJU\\Documents\\Text.txt";
		//Serialization
		FileOutputStream f1 = null;
		ObjectOutputStream f2 = null;
		try {
			 f1 = new FileOutputStream(filename);
			 f2 = new ObjectOutputStream(f1);
			 f2.writeObject(custom);
			 f2.close();
			 f1.close();
			 System.out.println("Serialized" + custom);
		}catch(IOException e) {
			System.out.println("Not done");
			
		}
		//deserialization 
		FileInputStream f3 = null;
		ObjectInputStream f4 = null;
		try {
			f3 = new FileInputStream(filename);
			f4 = new ObjectInputStream(f3);
			@SuppressWarnings("unused")
			Day3 D = (Day3) f4.readObject();
			System.out.println("Deserialized " + custom);
			f3.close();
			f4.close();
		}catch(IOException e) {
			System.out.println("no");
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	}
	
}