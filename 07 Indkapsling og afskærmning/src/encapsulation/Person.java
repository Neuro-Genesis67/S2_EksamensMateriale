package encapsulation;

public class Person {

	// Instance variables are private and the way to access them is through getter
	// and setter methods.

	// Hvis man vil ændre klassens variabler, er man tvunget til at bruge klassens
	// egne metoder.

	private String name;
	private int age;

	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

}

// The fields of a class can be made read-only or write-only.