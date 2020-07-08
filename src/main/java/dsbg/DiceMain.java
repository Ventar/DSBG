package dsbg;

import java.util.Scanner;

public class DiceMain {

	public static void main(String[] args) {

		BlackDice blackDice = new BlackDice();
		BlueDice blueDice = new BlueDice();
		OrangeDice orangeDice = new OrangeDice();

		Scanner inputScanner = new Scanner(System.in);

		System.out.print("Wieviele schwarze W�rfel soll ich werfen: ");
		int blackDiceInput = inputScanner.nextInt();
		System.out.print("Wieviele blaue W�rfel soll ich werfen: ");
		int blueDiceInput = inputScanner.nextInt();
		System.out.print("Wie viele Orangene W�rfel soll ich werfen: ");
		int orangeDiceinput = inputScanner.nextInt();

		int numberOfRolledSwords = blackDice.roll(blackDiceInput) + blueDice.roll(blueDiceInput) + orangeDice.roll(orangeDiceinput);

		System.out.print("Wie viele Schwerter soll ich abziehen: ");
		int totalSub = inputScanner.nextInt();
		System.out.print("Wie viele Schwerter soll ich addieren: ");
		int totalAdd = inputScanner.nextInt();

		numberOfRolledSwords = numberOfRolledSwords + totalAdd - totalSub;

		if (numberOfRolledSwords > 0) {
			System.out.println("\nDas Ergebniss betr�gt " + numberOfRolledSwords + " Schwerter");
		} else {
			System.out.println("\nDas Ergebniss betr�gt 0 Schwerter. ");
		}

		inputScanner.close();

	}
}
