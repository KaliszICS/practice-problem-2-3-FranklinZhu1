public class PracticeProblem {

	public static void bubbleSortString(String[] strings) {
		String temp;
		boolean swapped = true;
		for (int i = 0; i < strings.length - 1 && swapped; ++i) {
			swapped = false;
			for (int j = 0; j < strings.length - 1 - i; ++j) {
				if (strings[j].toLowerCase().compareTo(strings[j + 1].toLowerCase()) > 0) {
					temp = strings[j + 1];
					strings[j + 1] = strings[j];
					strings[j] = temp;
					swapped = true;
				}
			}
		}
	}

}
