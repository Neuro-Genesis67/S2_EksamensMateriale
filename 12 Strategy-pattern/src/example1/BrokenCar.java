package example1;

public class BrokenCar extends Vehicle {

	private String model;

	public BrokenCar(String model) {
		super();
		engine = new EngineWontStart();
	}
}
