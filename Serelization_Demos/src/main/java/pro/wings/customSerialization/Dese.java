package pro.wings.customSerialization;//Deserialization

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class Dese {
public static void main(String[] args) {
	User u=null;
	FileInputStream fis=null;
	ObjectInputStream ois=null;
	try {
		 fis=new FileInputStream("C:\\\\Users\\\\Shree\\\\Desktop\\\\eclipse-workspace\\\\Serelizatio_Demos\\\\src\\\\main\\\\java\\\\pro\\\\wings\\\\customSerialization\\\\user.txt");
		 ois=new ObjectInputStream(fis);
		  u=(User)ois.readObject();
		
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
	finally
	{
		try {
			ois.close();
			fis.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	System.out.println("Deserialised" + u);

}
}
