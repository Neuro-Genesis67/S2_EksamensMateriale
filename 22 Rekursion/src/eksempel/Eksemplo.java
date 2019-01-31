package eksempel;

public class Eksemplo {
	public int getSumOfList(int[] arr) {

		return getSumOfListHelper(arr, 0);
	}

	public int getSumOfListHelper(int[] arr, int i) {

		if (i == arr.length - 1) {
			return arr[i];
		}

		return arr[i] + getSumOfListHelper(arr, i + 1);
	}
}
