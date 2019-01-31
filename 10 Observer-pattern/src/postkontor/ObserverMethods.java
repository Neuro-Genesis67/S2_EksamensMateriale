package postkontor;

public interface ObserverMethods {

	void addObserver(Observer o);

	void removeObserver(Observer o);

	void notifyObservers();
}
