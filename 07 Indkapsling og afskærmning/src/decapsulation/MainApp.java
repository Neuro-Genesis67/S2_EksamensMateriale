package decapsulation;

import encapsulation.Person;

public class MainApp {

	public static void main(String[] args) {
		Person person = new Person("Tom", 27);

		System.out.println("Navn: " + person.getName() + " \nAlder: " + person.getAge() + "\n");

		person.setName("Mike");
		person.setAge(30);

		System.out.println("Navn: " + person.getName() + " \nAlder: " + person.getAge() + "\n");

		// (er ikke helt sikker)
		// Decapsulation er når man tilgår den/de enkapsulerede instansvariable af en
		// enkapsuleret klasse.

	}

}
