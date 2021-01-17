package by.htp.Task03.zadacha4;

/**
 * —формировать квадратную матрицу по образцу
 */
public class Main {
	public static void main(String args[]) {

		int n = (int) Math.round(Math.random() * 4) * 2 + 2;
		System.out.println("n = " + n);

		Integer[][] myArray = new Integer[n][n];
		for (int i = 0; i < n; i = i + 2) {
			for (int j = 0; j < n; j++) {
				myArray[i][j] = j + 1;
			}
		}
		for (int i = 1; i < n; i = i + 2) {
			for (int j = 0; j < n; j++) {
				myArray[i][j] = n - j;
			}
		}
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				System.out.print(" " + myArray[i][j]);
			}
			System.out.println();
		}
	}
}
