package src.com.ananyev.task6;

public class Runner {

	public static void main(String[] args) {

		NumberController controller = new NumberController();
		if (controller.control_numbers(args)) {
			CalculatorNums calc = new CalculatorNums();

			System.out.print("before changes ");
			for (int i = 0; i < args.length; i++) {
				System.out.print(args[i] + " ");
			}

			System.out.println("min+max =  " + calc.calculate(args));
		} else {
			System.out.println("Please try again");
		}
	}
}
