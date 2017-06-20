package src.com.ananyev.task1;

public class NumberControl {
	public static final long serialVersionUID = 42L;

	public boolean checkNumber(String[] args) {
		return (isNumberNotNull(args) && isEvenNumber(args[0]) && isNumberConsistsOfSymbols(args[0]));
	}

	private boolean isNumberNotNull(String[] args) {
		if ((args.length != 0) | (args.length > 1)) {
			return true;
		} else {
			System.out.println("Please enter number");
			return false;
		}
	}

	private boolean isEvenNumber(String line) {
		if (line.length() % 2 == 0) {
			return true;
		} else {
			System.out.println("Please enter an even number");
			return false;
		}
	}

	private boolean isNumberConsistsOfSymbols(String line) {
		if (line.matches("\\d+")) {
			return true;
		} else {
			System.out.println("Please enter a number consists of numerals");
			return false;
		}
	}
}
