package dsbg;

public class Person {

	public String firstName;

	public String lastName;

	public int age;

	public String specialAbility;

	public Person() {

	}

	public Person(String firstName, String lastName, int age, String specialAbility) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
		this.specialAbility = specialAbility;
	}

	public void printPersonToConsole() {
		System.out.println("My name is " + firstName + " " + lastName + " and I am " + age
				+ " years old. My special ability is: " + specialAbility);
	}

}
