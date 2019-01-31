package eksamensTest;

public class Abonnement {

	double mndPris;
	double minutPris;

	public Abonnement(double mndPris, double minutPris) {
		this.mndPris = mndPris;
		this.minutPris = minutPris;
	}

	public double abonnementsPris() {
		return mndPris;
	}
}
