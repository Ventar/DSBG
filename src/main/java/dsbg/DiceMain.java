package dsbg;

public class DiceMain {

	public static void main(String[] args) {

		BlackDice d1 = new BlackDice();

		int xy = d1.roll();

		System.out.println("Der Wert von xy betr�gt " + xy);

		int multiplerolls = d1.roll(4);

		System.out.println("Die Werte von multiplerolls betragen " + multiplerolls);
	}

}
