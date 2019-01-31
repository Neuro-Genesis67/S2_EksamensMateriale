package genericInterfaceStuff;

public class GenericFactory<T> implements GenericProduction<T> {

	@Override
	public T produceMotorcycle(String model) {

		return (T) new Motorcycle(model);

	}

}
