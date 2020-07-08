package dsbg;

import java.util.Arrays;

public class Hero {

	public String name;

	public Attributes attribs;

	public Weapon leftHand;

	public Weapon rightHand;

	public Equipment[] backBag = new Equipment[3];

	public Armor armor;

	public Hero() {

	}

	public Hero(String name, Attributes attribs) {
		this.name = name;
		this.attribs = attribs;

	}

	@Override
	public String toString() {
		return "Hero [name=" + name + ", attribs=" + attribs + ", leftHand=" + leftHand + ", rightHand=" + rightHand
				+ ", backBag=" + Arrays.toString(backBag) + ", armor=" + armor + "]";
	}

	public boolean canUse(Weapon w) {

		if (this.attribs.strength < w.weaponAttribs.strength) {
			return false;

		}
		if (this.attribs.dexterity < w.weaponAttribs.dexterity) {
			return false;
		}
		if (this.attribs.intelligence < w.weaponAttribs.intelligence) {
			return false;
		}
		if (this.attribs.faith < w.weaponAttribs.faith) {
			return false;
		}

		return true;
	}

	public boolean canUse(Armor ar) {

		if (this.attribs.strength < ar.armorAttribs.strength) {
			return false;

		}
		if (this.attribs.dexterity < ar.armorAttribs.dexterity) {
			return false;
		}
		if (this.attribs.intelligence < ar.armorAttribs.intelligence) {
			return false;
		}
		if (this.attribs.faith < ar.armorAttribs.faith) {
			return false;
		}

		return true;
	}

	public boolean equipLeftHand(Weapon w) {
		if (this.canUse(w)) {
			if (this.rightHand == null || this.rightHand.oneHanded) {
				this.leftHand = w;
				return true;
			}
		}
		return false;
	}

	public boolean equipRightHand(Weapon w) {
		if (this.canUse(w)) {
			this.rightHand = w;
			return true;

		}
		return false;

	}

	public boolean equipArmor(Armor ar) {
		if (this.canUse(ar)) {
			this.armor = ar;
			return true;
		}
		return false;
	}

}