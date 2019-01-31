package test;

import java.util.ArrayList;

public class ListMethods {

	public void printListIndexException(ArrayList<Integer> list, int index) {

		try {
			System.out.println(list.get(index));
		}

		catch (IndexOutOfBoundsException exception) {
			System.out.println("IndexOutOfBoundsException was caught!");
			throw exception;
		}

		catch (Exception exception) { // It's not pokémon, we don't wanna catch em' all
			System.out.println("Some kind of exception was caught!");
			throw exception;
		}
		System.out.println("test");

	}

	public void printListIndex(ArrayList<Integer> list, int index) {
		System.out.println(list.get(index));
	}

}
