package pro.wings.objectgraph;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class TestSerialization {
public static void main(String[] args) {
	Engine e=new Engine("Fourstroke",101);
	Vehicle v=new Vehicle("BMW",4569,e);
	FileOutputStream fos=null;
	ObjectOutputStream oos=null;
	try {
		fos=new FileOutputStream("C:\\Users\\Shree\\Desktop\\eclipse-workspace\\Serelizatio_Demos\\src\\main\\java\\pro\\wings\\objectgraph\\Obj.txt");
		oos=new ObjectOutputStream(fos);
		oos.writeObject(v);
	} catch (FileNotFoundException e1) {
		// TODO Auto-generated catch block
		e1.printStackTrace();
	} catch (IOException e1) {
		// TODO Auto-generated catch block
		e1.printStackTrace();
	}
	finally
	{
		try {
			fos.close();
			oos.close();
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
	}
	
	System.out.println("seriliazed");
}
}
