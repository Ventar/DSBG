package dsbg;

public class Weapon {
	public String name;

	public Attributes weaponAttribs;

	public boolean oneHanded;

	public Weapon() {

	}

	public Weapon(String name, Attributes weaponAttribs, boolean oneHanded) {
		this.name = name;
		this.weaponAttribs = weaponAttribs;
		this.oneHanded = oneHanded;
	}

	@Override
	public String toString() {
		return "Weapon [name=" + name + ", weaponAttribs=" + weaponAttribs + ", oneHanded=" + oneHanded + "]";
	}

}
