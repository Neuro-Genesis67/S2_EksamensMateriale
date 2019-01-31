package pak;

public class Eksempler {

	int[] arr = new int[50000];

	// O(1)
	// uanset størrelsen på data, tager det samme tid /brevduen med usb nøgler
	public void KonstantTid(int value) {
		arr[0] = value;
	}

	// O(n)
	// afhænger udelukkende af dataets størrelse
	public void LinearTid(int value) {
		int timesFound = 0;
		for (int i = 0; i < arr.length - 1; i++) {
			if (arr[i] == value) {
				timesFound++;
			}
		}
	}

	// O(n^2) <----- bubble sort
	public void KvadratiskTid() {
		for (int i = 0; i < arr.length - 1; i++) {
			for (int x = 0; x < i; x++) {
				System.out.println("Look at me now");
			}
		}
	}

	// O(log n) <----- Binarysearchtree <--- Mængden halveres hver gang, derfor er
	// den super effektiv i forhold til størrelsen på data
	// Her kan der nævnes højden af et binarysearchtree log2(n+1)
	public void LogaritmiskTid() {
		// int middle = start + slut / 2
		// Tænk på at slå op i en telefonbog
	}

	// O(n log n) <-------- rekursiv og det er mergesort (del løs kombiner) aka.
	// rekursivt
	public void nLogn() {

	}

	// Rule of thumb: Det har ikke så meget at gøre med hvor hurtigt en metode
	// bliver færdig,
	// Det handler om hvor effektivt metoden skalerer i forhold til dataets
	// størrelse
	//
	// O går altid ud fra worst case scenario
	//
	//
	//
	//
	// n = størrelsen af data
	//
	//
	//
	//
	//
	//
	//
	//
	// Konstant tid: O(1)
	// Lineær tid: O(n)
	// O(n^2)
	// O(log n)
	// O(n log n)
	//
	//
	//
	//
	//
	//
	//
	//
	//
	//
	//
	//
	//
	//
	//
	//
	//
	//
	//
	//
	//
	//
	//
	//
	//
	//
	//
	//
	//

	public void linear(int[] arr) {
		for (int i : arr) {
			System.out.println(i);
		}
	}
}