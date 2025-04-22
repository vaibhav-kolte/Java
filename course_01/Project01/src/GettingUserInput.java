import java.util.Scanner;

public class GettingUserInput {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.print("Enter your name: ");
		String text = input.nextLine();

		System.out.println("Your name is: " + text);

		System.out.print("Enter you age: ");
		int age = input.nextInt();

		System.out.println("Your age is: " + age);
	}

}
