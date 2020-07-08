package dsbg;

public class Armor {

	public String name;

	public Attributes armorAttribs;

	public Armor() {

	}

	public Armor(String name, Attributes armorAttribs) {
		this.name = name;
		this.armorAttribs = armorAttribs;

	}

	@Override
	public String toString() {
		return "Armor [name=" + name + ", armorAttribs=" + armorAttribs + "]";
	}

	
}
