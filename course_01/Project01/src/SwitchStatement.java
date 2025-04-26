import java.util.Scanner;

public class SwitchStatement {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		// Variable type supported by switch statement: char, short, byte, int and
		// String

		System.out.println("Enter your instruction: ");
		String text = input.nextLine();

		switch (text) {
		case "run":
			System.out.println("Program is running.");
			break;
		case "stop":
			System.out.println("Program is stopped.");
			break;
		default:
			System.out.println("Instruction not recognized.");
		}
	}
}
