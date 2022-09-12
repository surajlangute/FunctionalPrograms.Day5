package basic.FunctionalPrograms.day5;

import java.util.Scanner;

public class Array2D {

	public static void main(String[] args) {
		int num[][] = new int[3][3];

		Scanner scanner = new Scanner(System.in);
		System.out.println("Input the number Values for matrix   ");

		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				num[i][j] = scanner.nextInt();

			}
			System.out.println();

		}

		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {

				System.out.print(num[i][j] + " ");

			}
			System.out.println();
		}

	}
}