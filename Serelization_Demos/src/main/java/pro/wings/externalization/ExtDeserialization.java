package pro.wings.externalization;

import java.io.Externalizable;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class ExtDeserialization  {
public static void main(String[] args) {
	
	
	try {
		FileInputStream fis=new FileInputStream("C:\\Users\\Shree\\Desktop\\eclipse-workspace\\Serelizatio_Demos\\src\\main\\java\\pro\\wings\\externalization\\User.txt");
		ObjectInputStream ois=new ObjectInputStream(fis);
		User u2=(User)ois.readObject();
		System.out.println("Deserialized"+u2);
		fis.close();
		ois.close();
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
