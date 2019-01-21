
public class Test {

	public static void main(String[] args) {
		String str = "mamamamamamamama";
	}

	public static int CountWords(String str, String word) {
		int from = 0;
		int found = 0;
		int counter = 0;
		while (from >= 0) {
			found = str.indexOf(word, from);
			if (found >= 0)
				counter++;
			from = found + 1;
		}
		return counter;
	}

	public static int CountsWords(String str, String word) {
		int from = 0;
		int found = 0;
		int counter = 0;
		while (true) {
			found = str.indexOf(word, from);
			if (found >= 0) {
				counter++;
				from = found + 1;
			} else break;
		}
		return counter;
	}

}
