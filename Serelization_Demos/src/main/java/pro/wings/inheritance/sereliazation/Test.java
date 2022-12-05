package pro.wings.inheritance.sereliazation;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Person implements Serializable
{
	  int i;

	
	public Person() {
		// TODO Auto-generated constructor stub
	}


	public Person(int i) {
		super();
		this.i = i;
	}
	
	
}
class Employee extends Person 
{
   int j;

	public Employee(int i, int j) {
		super(i);
		this.j = j;
	}
	
}
public class Test {
public static void main(String[] args) {
	Employee e=new Employee(10,20);
	
	System.out.println("i ="+e.i);
	System.out.println("j ="+e.j);
	
	File f=new File("C:\\Users\\Shree\\Desktop\\eclipse-workspace\\Serelizatio_Demos\\src\\main\\java\\pro\\wings\\inheritance\\sereliazation\\Snacks.txt");
	try {
		FileOutputStream fos=new FileOutputStream(f);
		ObjectOutputStream oos=new ObjectOutputStream(fos);
		oos.writeObject(e);
		oos.close();
		fos.close();
		System.out.println("Object Serialized sucessfully");
		
	} catch (FileNotFoundException e1) {
		// TODO Auto-generated catch block
		e1.printStackTrace();
	} catch (IOException e1) {
		// TODO Auto-generated catch block
		e1.printStackTrace();
	}
	
	
	try {
		FileInputStream fis=new FileInputStream(f);
		ObjectInputStream ois=new ObjectInputStream(fis);
		Employee e1=(Employee) ois.readObject();
		
		ois.close();
		fis.close();
		
		System.out.println("Object has been deserialized");
		
		System.out.println("i ="+e1.i);
		System.out.println("j ="+e1.j);
		
		
	} catch (FileNotFoundException e1) {
		// TODO Auto-generated catch block
		e1.printStackTrace();
	} catch (IOException e1) {
		// TODO Auto-generated catch block
		e1.printStackTrace();
	} catch (ClassNotFoundException e1) {
		// TODO Auto-generated catch block
		e1.printStackTrace();
	}
}
}
