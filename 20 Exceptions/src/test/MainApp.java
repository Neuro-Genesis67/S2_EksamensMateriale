package test;

import java.util.ArrayList;

public class MainApp {

	public static void main(String[] args) {
		ListMethods lm = new ListMethods();

		ArrayList<Integer> list = new ArrayList<>();
		list.add(1);
		list.add(2);
		list.add(3);

		lm.printListIndexException(list, 2);
		lm.printListIndexException(list, 10);

		// lm.printListIndex(list, 10);

	}

}
