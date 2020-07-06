package dsbg;

public class DiceMain {

	public static void main(String[] args) {

		BlackDice d1 = new BlackDice();

		int multiplerolls = d1.roll(4);

		System.out.println("Die Werte von multiplerolls betragen " + multiplerolls);

		BlueDice d2 = new BlueDice();

		multiplerolls = d2.roll(3);

		System.out.println("Die Werte von d2 betragen " + multiplerolls);

		OrangeDice d3 = new OrangeDice();

		multiplerolls = d3.roll(2);
		
		System.out.println("Die Werte von d3 betragen " + multiplerolls);

	}
}
