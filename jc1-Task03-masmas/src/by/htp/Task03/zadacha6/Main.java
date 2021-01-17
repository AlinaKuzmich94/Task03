package by.htp.Task03.zadacha6;

/**
 * —формировать квадратную матрицу по образцу
 */

public class Main {
	public static void main(String args[]) {

		int n = (int) Math.round(Math.random() * 5) * 2;
		System.out.println("n = " + n);

		Integer[][] myArray = new Integer[n][n];
		for (int i = 0; i < myArray.length; i++) {
			for (int j = 0; j < myArray.length; j++) {
				if ((i == 0) || (i == myArray.length - 1)) {
					myArray[i][j] = 1;
					continue;
				}
				if ((j == 0) || (j == myArray.length - 1)) {
					myArray[i][j] = 1;
					continue;
				}
				myArray[i][j] = 0;
			}
		}
		for (int i = 0; i < myArray.length; i++) {
			for (int j = 0; j < myArray.length; j++) {
				System.out.print(" " + myArray[i][j]);
			}
			System.out.println();
		}
	}

}
