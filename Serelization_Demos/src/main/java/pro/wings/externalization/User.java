package pro.wings.externalization;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;

public class User implements Externalizable {
String username;
int id;
String password;
public User() {
	// TODO Auto-generated constructor stub
}








public User(String username, int id, String password) {
	super();
	this.username = username;
	this.id = id;
	this.password = password;
}
@Override
public String toString() {
	return "User [username=" + username + ", id=" + id + ", password=" + password + "]";
}

public void writeExternal(ObjectOutput out) throws IOException {
	out.writeObject(username);
	out.writeInt(id);
	out.writeObject(password);
	
}
public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
	username=(String)in.readObject();
	id=in.readInt();
	password=(String)in.readObject();
	
}


}
