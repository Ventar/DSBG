package dsbg;

import java.util.Random;

public class GreenDice {

	public int roll() {

		Random rand = new Random();

		int dicevalue = rand.nextInt(6);
		dicevalue = dicevalue + 1;

		int numberOfSwords = 0;

		if (dicevalue == 1 || dicevalue == 2 || dicevalue == 3) {
			numberOfSwords = 0;
		}

		if (dicevalue == 3 || dicevalue == 4 || dicevalue == 5) {
			numberOfSwords = 1;
		}

		
		System.out.println("Dicevalue ::= [" + dicevalue + "], Number of Swords ::= [" + numberOfSwords + "]");

		return numberOfSwords;
	}

	public int roll(int numberOfRolls) {

		int result = 0; // ist das gleiche wie -> int result;

		for (int i = 0; i < numberOfRolls; i = i + 1) {
			result = result + roll();
		}

		return result;
	}
}
