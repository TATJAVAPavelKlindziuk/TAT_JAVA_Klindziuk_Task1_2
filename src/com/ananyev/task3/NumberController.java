package src.com.ananyev.task3;

public class NumberController {

	public boolean controlNumbers(String[] args) {
		return (hasAllScores(args) && checkForSpecialSymbols(args));
	}

	private boolean hasAllScores(String[] args) {
		if (args.length == 0) {
			System.out.println("Enter values");
			return false;
		}
		if ((args.length > 2) || (args.length < 2)) {
			System.out.println("Enter only 2 valuesss");
			return false;
		} else
			return true;
	}

	private boolean checkForSpecialSymbols(String[] args) {
		boolean returned = false;
		String regex = "\\d+";
		for (String line : args) {
			if (!line.matches(regex)) {
				System.out.println("Only numbers allowed.Please try again.");
				returned = false;
			} else {
				returned = true;
			}
		}
		return returned;
	}
}
