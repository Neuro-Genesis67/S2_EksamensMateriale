package pak;

public class Dog extends Animal {

	String name;

	public Dog(int age, String race, int legs, String name) {
		super(age, race, legs);
		this.name = name;

	}

	public void bark() {
		if (age < 5) {
			System.out.println("arf!");
		} else {
			System.out.println("WOOF!");
		}
	}

}
