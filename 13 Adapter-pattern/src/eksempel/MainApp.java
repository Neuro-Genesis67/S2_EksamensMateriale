package eksempel;

public class MainApp {

	public static void main(String[] args) {
		HandicappedPersonAdapter hp = new HandicappedPersonAdapter("Morten");
		Person p = new Person("Kaj");

		System.out.println(p.walk());
		System.out.println(p.playFootball());
		System.out.println(p.dance());
		System.out.println(hp.walk());
		System.out.println(hp.playFootball());
		System.out.println(hp.dance());

	}

}
