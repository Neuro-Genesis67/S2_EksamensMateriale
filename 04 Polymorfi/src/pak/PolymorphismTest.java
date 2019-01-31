package pak;

public class PolymorphismTest {

	public static void main(String[] args) {

		method1();
		method2();

	}

	public static void method1() {
		System.out.println("Method1: ");
		Food[] arr = new Food[2];
		arr[0] = new Vegetable(true, 2);
		arr[1] = new Food(false);

		for (int i = 0; i < 2; i++) {
			arr[i].eat();
		}
	}

	public static void method2() {
		System.out.println("\nMethod2: ");
		Fatty fatGuy = new Fatty();
		Vegetable veggie = new Vegetable(true, 3);
		Food food1 = new Food(true);
		Food food2 = new Vegetable(false, 1);

		fatGuy.eat(veggie);
		fatGuy.eat(food1);
		fatGuy.eat(food2);

	}

}
