package example;

public class Singleton {

	private static Singleton uniqueInstance = null;
	private Object singletonData;

	private Singleton() {

	}

	public static Singleton getInstance() {
		if (uniqueInstance == null) {
			return uniqueInstance = new Singleton();
		}
		return uniqueInstance;
	}

	public Object getSingletonData() {
		return "some object type";
	}

	public static void SingletonMethod() {
		System.out.println("This singleton method could do anything!");
	}

}
