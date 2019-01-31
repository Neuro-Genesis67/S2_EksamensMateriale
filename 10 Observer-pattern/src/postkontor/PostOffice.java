package postkontor;

import java.util.ArrayList;

public class PostOffice implements ObserverMethods {

	private ArrayList<Letter> letters;
	private ArrayList<Observer> clients;

	public PostOffice() {
		letters = new ArrayList<>();
		clients = new ArrayList<>();
	}

	public void addLetter(Letter letter) {
		letters.add(letter);
		notifyObservers();
	}

	public ArrayList<Letter> getLetters() {
		return letters;
	}

	@Override
	public void addObserver(Observer o) {
		clients.add(o);
	}

	@Override
	public void removeObserver(Observer o) {
		clients.remove(o);

	}

	@Override
	public void notifyObservers() {
		for (Observer client : clients) {
			client.update(this);
		}

	}

}
