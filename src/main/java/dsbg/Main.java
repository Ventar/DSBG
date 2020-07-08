package dsbg;

public class Main {

	public static void main(String[] args) {
		Hero hero = new Hero("assassin", new Attributes(25, 35, 35, 30));
		Weapon weapon = new Weapon("estoc", new Attributes(0, 14, 0, 0), true);
		Weapon weapon2 = new Weapon("umbralDagger", new Attributes(0, 35, 35, 0), true);
		Weapon weapon3 = new Weapon("Great Mace ", new Attributes(21, 0, 0, 28), false);
//		System.out.println("My new Hero is " + hero.name + " with the attributes" + hero.attribs.toString());
//		System.out.println(
//				"My equipment is " + weapon.name + " and the required attributes are " + weapon.equipAttribs.toString());
//
//		System.out.println("Can " + weapon.name + " be used from " + hero.name + " : " + hero.canUse(weapon));
		System.out.println(hero.toString());
		hero.equipLeftHand(weapon);
		hero.equipRightHand(weapon2);
		hero.equipLeftHand(weapon3);
		System.out.println(hero);
	}

}
