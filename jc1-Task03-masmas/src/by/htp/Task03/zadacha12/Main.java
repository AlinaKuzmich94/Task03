package by.htp.Task03.zadacha12;

/**
 * 
 * ������������ �������� ������� m*n, ��������� �� 0 � 1, 
 * ������ � ������ ������� ����� 1 ����� ������ �������.
 *
 */

public class Main {
	public static void main(String args[]) {

		int m = (int) Math.round(Math.random() * 8) + 2;
		System.out.println("m = " + m);
		int n = (int) Math.round(Math.random() * m) + 1;
		System.out.println("n = " + n);

		Integer[][] myArray = new Integer[m][n];
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < i; j++) {
				myArray[j][i] = 1;
			}
			for (int j = i; j < m; j++) {
				myArray[j][i] = 0;
			}
		}

		System.out.println("Matrix:");
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				System.out.print(String.format("%-5s", myArray[i][j]));
			}
			System.out.println();
		}

	}

}
