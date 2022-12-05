package pro.wings.objectgraph;

import java.io.Serializable;

public class Vehicle implements Serializable {
String name;
int price;
Engine eng;
public Vehicle() {
	// TODO Auto-generated constructor stub
}
public Vehicle(String name, int price, Engine eng) {
	super();
	this.name = name;
	this.price = price;
	this.eng = eng;
}
@Override
public String toString() {
	return "Vehicle [name=" + name + ", price=" + price + ", eng=" + eng + "]";
}


}
