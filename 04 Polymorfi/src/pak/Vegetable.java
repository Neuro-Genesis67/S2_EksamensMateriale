package pak;

public class Vegetable extends Food {

	int size;

	public Vegetable(boolean healthy, int size) {
		super(healthy);
		this.size = size;
	}

	@Override
	public void eat() {
		System.out.println("This vegetable is tasty brehhhh");
	}

}
