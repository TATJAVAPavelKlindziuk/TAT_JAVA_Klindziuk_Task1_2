package src.com.ananyev.task5;

public class CalculatorNums {
	public double[] calculate(String[] args) {

		double[] first = new double[args.length];
		for (int i = 0; i < args.length; i++) {
			double num = Double.parseDouble(args[i]);
			if (first[i] < 0) {
				first[i] = Math.pow(num, 4);
			} else {
				first[i] = Math.pow(num, 2);
			}
		}
		return first;
	}
}
