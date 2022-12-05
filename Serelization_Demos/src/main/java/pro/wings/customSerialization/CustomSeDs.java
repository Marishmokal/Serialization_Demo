package pro.wings.customSerialization;//Serialization

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class CustomSeDs {
public static void main(String[] args) {
	User use=new User("Marish@122","Ma12#332",123);
	FileOutputStream fos=null;
	ObjectOutputStream oos=null;
	try {
		 fos=new FileOutputStream("C:\\Users\\Shree\\Desktop\\eclipse-workspace\\Serelizatio_Demos\\src\\main\\java\\pro\\wings\\customSerialization\\user.txt");
		 oos=new ObjectOutputStream(fos);
		 oos.writeObject(use);
		 System.out.println("Serialized"+use);
	} catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	finally
	{
		try {
			fos.close();
			oos.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
}
}