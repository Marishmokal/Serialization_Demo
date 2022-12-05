package pro.wings.serelization;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.Serializable;

public class DeserializationDemo implements Serializable{
public static void main(String[] args) {

	File f=new File("C:\\Users\\Shree\\Desktop\\eclipse-workspace\\Serelizatio_Demos\\src\\main\\java\\pro\\wings\\serelization\\mokal.txt");
	
	try {
		FileInputStream fis=new FileInputStream(f);
		ObjectInputStream ois=new ObjectInputStream(fis);
		Employee e1 = (Employee) ois.readObject();
	
		System.out.println("deserialized successfully");
	} catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (ClassNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	
}
}
}

