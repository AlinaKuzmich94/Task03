package by.htp.Task03.zadacha9;

/**
 * ƒан линейный массив x1,x2,...,xn-1. 
 * ѕолучить действительную квадратную матрицу пор€дка n
 */

public class Main {
	public static void main(String args[]) {

		int n = (int) Math.round(Math.random() * 8);
		System.out.println("n = " + n);

		Double[] myStr = new Double[n];

		System.out.println("String:");
		for (int i = 0; i < myStr.length; i++) {
			myStr[i] = Math.random() * 10;
			System.out.print(" " + myStr[i]);
		}
		System.out.println();

		Double[][] myArray = new Double[n][n];
		for (int i = 0; i < myArray.length; i++) {
			for (int j = 0; j < myArray.length; j++) {
				myArray[i][j] = Math.pow(myStr[j], i + 1);
			}
		}
		System.out.println("Matrix:");
		for (int i = 0; i < myArray.length; i++) {
			for (int j = 0; j < myArray.length; j++) {
				System.out.print(" " + String.format("%-23s", myArray[i][j]));
			}
			System.out.println();
		}
	}
}
