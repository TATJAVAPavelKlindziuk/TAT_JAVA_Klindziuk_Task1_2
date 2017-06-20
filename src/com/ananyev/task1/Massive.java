package src.com.ananyev.task1;

public class Massive {
	public static final long serialVersionUID = 42L;

	public int[] createMassive(String line) {
		int[] arrayFromLine = new int[line.length()];
		for (int i = 0; i < line.length(); i++) {
			arrayFromLine[i] = line.charAt(i) - '0';
		}
		return arrayFromLine;
	}
}
