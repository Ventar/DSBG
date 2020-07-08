package dsbg;

public class Equipment {

public String name;

public Attributes equipAttribs;

public Equipment() {
	
}

public Equipment(String name, Attributes equipAttribs) {
this.name = name;
this.equipAttribs = equipAttribs;


}

public String toString() {
	String e = "name " + name + " ,with the Attributes: " + equipAttribs;
	
	return e;
}


}
