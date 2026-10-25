package Enumeration;
import java.io.*;

/**
 * @author MANJU
 *
 */
class Day4 implements Serializable{
	public static final long serialVersionUID = 1L;
	public String name;
	public Day4(String name) {
		this.name= name;
	}

	public static void main(String[]args) {
		Day4 dig = new Day4("Manju");
		try {
			FileOutputStream f1 = new FileOutputStream("C:\\Users\\MANJU\\DocumentsTest.txt");
			ObjectOutputStream f2 = new ObjectOutputStream(f1);
			f2.writeObject(dig);
			System.out.println("Serialized" +dig);
		}catch(IOException e){
			System.out.println("None");
		}
		//de-serial
		try {
			FileInputStream f3 = new FileInputStream("C:\\\\Users\\\\MANJU\\\\DocumentsTest.txt");
			ObjectInputStream f4 = new ObjectInputStream(f3);
			Day4 day = (Day4) f4.readObject();
			System.out.println("Deserialized" +day);
		}
		catch(IOException | ClassNotFoundException i) {
			System.out.println("None1");
		}
	}
	
}