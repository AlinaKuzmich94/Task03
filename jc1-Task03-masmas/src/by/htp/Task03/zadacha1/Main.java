package by.htp.Task03.zadacha1;

/**
 * Дана квадратная матрица. 
 * Вывести на экран элементы, стоящие на диагонали.
 *
 */

public class Main {
	public static void main(String[] args) {

		int[][] arr = { 
				{ 1, 2, 3, 4, 5 }, 
				{ 1, 2, 3, 4, 5 }, 
				{ 1, 2, 3, 4, 5 }, 
				{ 1, 2, 3, 4, 5 },
				{ 1, 2, 3, 4, 5 },
				};

		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i][i]);
		}
	}
}