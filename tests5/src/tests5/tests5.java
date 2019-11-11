package tests5;

public class tests5 {
	public static void main(String[] args) {
		String template = "**********************";
		int size = (template.length() / 2);
		for (int n = 0; n < size; n++) {
			System.out.print(template.substring(0, size - n).replace('*', ' '));
			System.out.println(template.substring(0, ((2 * (n + 1)) - 1)));
		}
	}
}
