package pro.wings.externalization;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class ExtSerialization {
public static void main(String[] args) {
	User u1=new User("Marish@123",123,"1245sh");
	
	try {
		FileOutputStream fos=new FileOutputStream("C:\\Users\\Shree\\Desktop\\eclipse-workspace\\Serelizatio_Demos\\src\\main\\java\\pro\\wings\\externalization\\User.txt");
		ObjectOutputStream oos=new ObjectOutputStream(fos);
		oos.writeObject(u1);
		System.out.println("Serialiazed"+u1);
		oos.close();
		fos.close();
	} catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}

}
}
