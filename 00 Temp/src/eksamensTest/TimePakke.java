package eksamensTest;

public class TimePakke extends Abonnement {

	int frieTimer;

	public TimePakke(double mndPris, double minutPris, int frieTimer) {
		super(mndPris, minutPris);
		this.frieTimer = frieTimer;
	}

	// Denne metode er arvet fra Abonnement (super)klassen
	// public double abonnementsPris() {
	// return mndPris;
	// }

}
