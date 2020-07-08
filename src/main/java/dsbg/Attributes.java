package dsbg;

public class Attributes {

	public int strength = 0;
	public int dexterity = 0;
	public int intelligence = 0;
	public int faith = 0;
	

	public Attributes() {

	}

	public Attributes(int strength, int dexterity, int intelligence, int faith) {
		this.strength = strength;
		this.dexterity = dexterity;
		this.intelligence = intelligence;
		this.faith = faith;
		
	}

	public String toString() {

		String attributeReturn = " Strength " + strength + ", Dexterity " + dexterity
				+ ", Intelligence " + intelligence + ", Faith " + faith;
		return attributeReturn;

	}

	public boolean canUse(Attributes equipment) {

		if (this.strength < equipment.strength) {
			return false;
		}

		if (this.dexterity < equipment.dexterity) {
			return false;
		}

		if (this.intelligence < equipment.intelligence) {
			return false;
		}

		if (this.faith < equipment.faith) {
			return false;
		}

		return true;

	}

	public static void main(String[] args) {

		// Heroes
		Attributes[] heroes = new Attributes[4];

		Attributes assassin = new Attributes(10, 14, 11, 9);
		heroes[0] = assassin;
		Attributes warrior = new Attributes(16, 9, 8, 9);
		heroes[1] = warrior;
		Attributes knight = new Attributes(13, 12, 9, 9);
		heroes[2] = knight;
		Attributes herald = new Attributes(12, 11, 8, 13);
		heroes[3] = herald;

		// Equipment
		Attributes[] equipment = new Attributes[4];

		Attributes estoc = new Attributes(0, 14, 0, 0);
		equipment[0] = estoc;
		Attributes umbralDagger = new Attributes(0, 35, 35, 0);
		equipment[1] = umbralDagger;
		Attributes assassinArmour = new Attributes(10, 14, 0, 0);
		equipment[2] = assassinArmour;
		Attributes targedShield = new Attributes(0, 0, 0, 0);
		equipment[3] = targedShield;

		// Business Logic
		System.out.println(assassin.toString());

		assassin.strength = 16;
		assassin.intelligence = warrior.intelligence + 2;

		System.out.println(assassin.toString());

		System.out.println("can Equipment be used:" + assassin.canUse(umbralDagger));

		for (int i = 0; i < 4; i++) {
			Attributes hero = heroes[i];
			for (int j = 0; j < 4; j = j + 1) {
				Attributes equip = equipment[j];
				System.out.println("Can use " + equip + " ? " + hero.canUse(equip));

			}
		}
		umbralDagger.canUse(assassin);
	}

}
