package eksamensTest;

import java.util.ArrayList;
import java.util.List;

public class MainApp {

	public static <E> void main(String[] args) {
		Abonnement ab = new Abonnement(80, 0.60);
		TimePakke tp = new TimePakke(50, 1, 2);
		UdvidelsesPakke up = new UdvidelsesPakke(100, 1, 5, 25);

		List<Abonnement> telia = new ArrayList<>();
		telia.add(ab);
		telia.add(tp);
		telia.add(up);

		getSumOfAbonnementer(telia);

	}

	private static void getSumOfAbonnementer(List<Abonnement> list) {
		double result = 0;

		for (Abonnement abonnement : list) {
			System.out.println(abonnement.abonnementsPris());
			result += abonnement.abonnementsPris();
		}
		System.out.println(result);

	}

}
