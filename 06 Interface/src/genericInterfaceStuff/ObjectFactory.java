package genericInterfaceStuff;

public class ObjectFactory implements ObjectProduction {

	@Override
	public Object produceMotorcycle(String model) {

		return new Motorcycle(model);

	}

}
