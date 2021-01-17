package by.htp.Task03.zadacha3;

/**
 * Дана матрица размера m*n. Вывести ее элементы в следующем порядке: 
 * первая строка справа налево,
 * вторая строка слева направо, 
 * третья строка справа налево и так далее.
 */

public class Main {
	public static void main(String args[]) {
		
	int[][] arr = {
			{ 1, 2, 3, 4, 5 },
			{ 1, 2, 3, 4, 5 },
			{ 1, 2, 3, 4, 5 },
			{ 1, 2, 3, 4, 5 }
			};

			int k = 2;
			
			for (int i = 0; i < arr.length; i++) {
				for (int j = 0; j < arr[i].length; j++) {

					if (i % 2 == 1) {
						System.out.println(arr[i][j]);
					} else {
						System.out.println(arr[i][arr[i].length - j - 1]);
					}
				}
			}
		}
	}
