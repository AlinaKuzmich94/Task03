package by.htp.Task03.zadacha2;

import java.util.*;

/**
 * Дана квадратная матрица. 
 * Вывести k-ю строку и p-й столбец матрицы.
 *
 */

public class Main {
	public static void main(String args[]) {

		int[][] arr = {
				{ 1, 2, 3, 4, 5 },
				{ 1, 2, 3, 4, 5 },
				{ 1, 2, 3, 4, 5 },
				{ 1, 2, 3, 4, 5 },
				{ 1, 2, 3, 4, 5 },
				};

				int k = 2;
				for (int i = 0; i < arr.length; i++) {
					System.out.println(arr[k][i]);
				}
				int p = 1;
				for (int i = 0; i < arr[p].length; i++) {
					System.out.println(arr[i][p]);
				}
			}
		}
