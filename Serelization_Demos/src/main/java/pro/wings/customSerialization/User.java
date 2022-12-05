package pro.wings.customSerialization;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class User implements Serializable {
	String userName;
	String password;
	int id;

	public User() {
		// TODO Auto-generated constructor stub
	}

	public User(String userName, String password, int id) {
		super();
		this.userName = userName;
		this.password = password;
		this.id = id;

	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	
		
	}
	private void writeObject(ObjectOutputStream o)
	{
		try {
			o.writeUTF(userName);
			o.writeUTF("abc"+password+123);
			o.writeInt(id);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	private void readObject(ObjectInputStream a)
	{
		try {
			userName=a.readUTF();
			String pwd =a.readUTF();
			password=pwd.substring(3, pwd.length()-3);
			//password=a.readUTF();
			id=a.readInt();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
				
	}

	@Override
	public String toString() {
		return "User [userName=" + userName + ", password=" + password + ", id=" + id + "]";
	}

}
