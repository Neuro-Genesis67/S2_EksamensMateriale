package pak;

public class BubbleSort {

	public static void bubbleSort(Comparable[] data) {
		int position, scan;
		for (position = data.length - 1; position >= 0; position--) {
			for (scan = 0; scan <= position - 1; scan++)
				if (data[scan].compareTo(data[scan + 1]) > 0)
					swap(data, scan, scan + 1);
		}
	}

}
