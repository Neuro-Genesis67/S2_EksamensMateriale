package genericInterfaceStuff;

public class MainApp {

	public static void main(String[] args) {

		// Object
		ObjectFactory objFactory = new ObjectFactory();
		Motorcycle objMc = (Motorcycle) objFactory.produceMotorcycle("Daytona");

		// Generic
		GenericFactory<Motorcycle> genFactory = new GenericFactory<Motorcycle>();
		Motorcycle genMc = genFactory.produceMotorcycle("Suzuki");

	}

}
