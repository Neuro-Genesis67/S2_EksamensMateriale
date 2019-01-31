package genericInterfaceStuff;

public class Motorcycle {

	String model;

	public Motorcycle(String model) {
		this.model = model;
	}

	@Override
	public String toString() {
		return "" + model;
	}

}
