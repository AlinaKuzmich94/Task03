package by.htp.Task03.zadacha11;

/**
 * ћатрицу 10*20 заполнить случайными числами от 0 до 15.
 * ¬ывести на экран саму матрицу и номера строк, в которых число 5 встречаетс€ три и более раза
 */

public class Main {
	public static void main(String args[]) {

		int n = (int) Math.round(Math.random() * 4) * 2 + 2;
		System.out.println("n = " + n);

		Integer[][] myArray = new Integer[n][n];
		for (int i = 0; i < myArray.length; i++) {
			for (int j = 0; j < myArray.length; j++) {
				myArray[i][j] = (int) (10 * (Math.random() - 0.5));
			}
		}

		Integer[] elements = new Integer[n];
		int kolEl = 0;
		System.out.println("Matrix:");
		for (int i = 0; i < myArray.length; i++) {
			for (int j = 0; j < myArray.length; j++) {
				System.out.print(String.format("%-5s", myArray[i][j]));
			}
			System.out.println();
		}
		for (int i = 0; i < n; i++) {
			if (myArray[i][i] > 0) {
				elements[kolEl] = myArray[i][i];
				kolEl++;
			}
		}
		for (int i = 0; i < kolEl; i++) {
			System.out.print(String.format("%-5s", elements[i]));
		}
	}

}
