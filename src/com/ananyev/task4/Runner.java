package src.com.ananyev.task4;

public class Runner {
	public static void main(String[] args) {

		NumberController controller = new NumberController();
		if (controller.controlNumbers(args)) {
			int x = Integer.parseInt(args[0]);
			int y = Integer.parseInt(args[1]);

			Point point = new Point(x, y);
			System.out.println(new CheckerPointPosition().checkPosition(point));
		} else {
			System.out.println("Please try again.");
		}
	}
}
