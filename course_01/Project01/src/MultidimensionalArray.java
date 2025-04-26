
public class MultidimensionalArray {
	public static void main(String[] args) {
		int[] oneDimensionalArray = { 2, 6, 3, 4 };

		System.out.println(oneDimensionalArray[2]);

		int[][] multiDimensionalArray = { { 33, 45, 61 }, { 56, 34, 87, 90 }, { 88, 23, 44 } };

		System.out.println(multiDimensionalArray[2][2]);

		for (int array = 0; array < multiDimensionalArray.length; array++) {
			for (int item = 0; item < multiDimensionalArray[array].length; item++) {
				System.out.print(multiDimensionalArray[array][item] +"\t");
			}
			System.out.println();
		}

		double[][] doubleArray = new double[2][3];

		System.out.println(doubleArray[1][2]);

		doubleArray[1][2] = 10;

		System.out.println(doubleArray[1][2]);
	}
}
