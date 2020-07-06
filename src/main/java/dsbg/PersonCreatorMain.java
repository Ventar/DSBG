package dsbg;

public class PersonCreatorMain {

	public static void main(String[] args) {

		Person leon = new Person();
		leon.firstName = "Leon";
		leon.lastName = "Federau";
		leon.age = 17;
		leon.specialAbility = "unbelievable strenght";

		Person michael = new Person("Michael", "Rodenbücher", 41, "mega brain");
		
		leon.printPersonToConsole();
		
		michael.printPersonToConsole();
	}

}
