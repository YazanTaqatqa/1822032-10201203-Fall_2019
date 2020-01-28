import java.util.Scanner;

	public class prog1 {

	public static void main(String[] args) {

	String rString="";

	     Scanner scanner = new Scanner(System.in);

	     System.out.println("Enter a string to check:");
	     String inputString = scanner.nextLine();

	     int length = inputString.length();

	     for ( int i = length - 1 ; i >= 0 ; i-- )
	        rString = rString + inputString.charAt(i);

	     if (inputString.equals(rString))
	        System.out.println("Input string is a symmetric.");
	     else
	        System.out.println("Input string is not a symmetric.");
	}

}
