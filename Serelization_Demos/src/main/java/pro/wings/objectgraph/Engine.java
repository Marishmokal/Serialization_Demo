package pro.wings.objectgraph;

import java.io.Serializable;

public class Engine implements Serializable {
String eNAme;
int id;
public Engine() {
	// TODO Auto-generated constructor stub
}
public Engine(String eNAme, int id) {
	super();
	this.eNAme = eNAme;
	this.id = id;
}
@Override
public String toString() {
	return "Engine [eNAme=" + eNAme + ", id=" + id + "]";
}


}
