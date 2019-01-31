package postkontor;

public class MainApp {

	public static void main(String[] args) {
		PostOffice postOffice = new PostOffice();
		Person tom = new Person("Tom");
		Person Selma = new Person("Selma");

		Letter letter1 = new Letter("Tom", "Risdalsvej 34",
				"Hej Tom, jeg skulle hilse fra mor og sige at du er en agurk. \nKærlig hilsen Knud");

		Letter letter2 = new Letter("Selma", "Strengevej 25",
				"Hej Selma, jeg ser dig stadig som et barn\n, men måske er det forkert af mig at se dig sådan. \nJeg vil fremover øve mig på at se dig som et menneske. \nKærlig hilsen Tom.");

		postOffice.addObserver(tom);
		postOffice.addObserver(Selma);

		postOffice.addLetter(letter1);
	}

}
