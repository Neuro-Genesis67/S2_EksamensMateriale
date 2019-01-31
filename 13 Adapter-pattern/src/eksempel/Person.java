package eksempel;

public class Person implements Activities {
	String name;

	public Person(String name) {
		this.name = name;
	}

	@Override
	public String walk() {
		return name + " walks forward with ease";
	}

	@Override
	public String playFootball() {
		return name + " plays football with ease";
	}

	@Override
	public String dance() {
		return name + " dances with ease";
	}

}
