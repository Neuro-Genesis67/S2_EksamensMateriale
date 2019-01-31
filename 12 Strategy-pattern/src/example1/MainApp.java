package example1;

public class MainApp {

	public static void main(String[] args) {
		Car car = new Car("Skoda");
		BrokenCar brokenCar = new BrokenCar("Toyota");

		System.out.println("Car: " + car.tryEngine());
		System.out.println("Broken car: " + brokenCar.tryEngine());
	}

}
