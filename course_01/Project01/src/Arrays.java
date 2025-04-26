
public class Arrays {
	public static void main(String[] args) {
		int number = 9;

		int[] numbers = new int[5];

		System.out.println(numbers[0]);

		numbers[0] = 5;

		System.out.println("\nPrint numbers");
		System.out.println(numbers[0]);
		System.out.println(numbers[1]);
		System.out.println(numbers[2]);
		System.out.println(numbers[3]);
		System.out.println(numbers[4]);

		System.out.println("\nPrint all using loops");
		for (int i = 0; i < numbers.length; i++) {
			System.out.println(numbers[i]);
		}

		// Declare and initialize variable in one line

		int[] numberValue = { 5, 10, 15, 20, 25 };

		System.out.println("\nPrint all using loops");
		for (int i = 0; i < numberValue.length; i++) {
			System.out.println(numberValue[i]);
		}
		
		System.out.println("Check what is print if only use array varible");
		System.out.println(numbers);
	}
}
