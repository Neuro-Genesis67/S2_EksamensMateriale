package postkontor;

import java.util.ArrayList;

public class Person implements Observer {
	String name;

	public Person(String name) {
		this.name = name;

	}

	public void checkMail(ArrayList<Letter> letters) {
		for (Letter letter : letters) { // Youtube didn't do a for loop - https://www.youtube.com/watch?v=ojbT9WA70Fw
			if (letter.name.compareTo(name) == 0) {
				System.out.println(name + " received the following letter: \n\n" + "-\n" + letter.message + "\n-");
			}
		}
	}

	@Override
	public void update(Object obj) {
		if (obj instanceof PostOffice) {
			PostOffice po = (PostOffice) obj;
			checkMail(po.getLetters());
		}

	}
}
