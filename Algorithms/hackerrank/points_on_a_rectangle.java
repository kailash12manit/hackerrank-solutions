package hackerrank;

import java.util.Scanner;

public class points_on_a_rectangle {
	
	private static int x_min;
	private static int x_max;
	private static int y_min;
	private static int y_max;
	
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int numberOfQueries = sc.nextInt();
		String[] results = new String[numberOfQueries];

		for (int i = 0; i < numberOfQueries; i++) {

			int numberOfPoints = sc.nextInt();
			int[] x_coord = new int[numberOfPoints];
			int[] y_coord = new int[numberOfPoints];
			x_coord[0] = sc.nextInt();
			y_coord[0] = sc.nextInt();

			x_min = x_coord[0];
			x_max = x_coord[0];
			y_min = y_coord[0];
			y_max = y_coord[0];

			for (int j = 1; j < numberOfPoints; j++) {
				x_coord[j] = sc.nextInt();
				y_coord[j] = sc.nextInt();
				findMax_and_Min_X_and_Y(x_coord[j], y_coord[j]);
			}

			boolean onRectangle = true;
			for (int j = 0; j < numberOfPoints; j++) {
				if (!checkOnRectangular(x_coord[j], y_coord[j])) {
					onRectangle = false;
					results[i] = "NO";
					break;
				}
			}
			if (onRectangle) {
				results[i] = "YES";
			}
		}
		
		for (int i = 0; i < numberOfQueries; i++) {
			System.out.println(results[i]);
		}
		sc.close();
	}

	public static boolean checkOnRectangular(int x_coord, int y_coord) {

		boolean firstPossibility = false;
		boolean secondPossibility = false;

		if (((x_coord == x_min || x_coord == x_max))) {
			if ((y_coord >= y_min && y_coord <= y_max)) {
				firstPossibility = true;
			}
		} else if (((y_coord == y_min || y_coord == y_max))) {
			if ((x_coord >= x_min && x_coord <= x_max)) {
				secondPossibility = true;
			}
		}

		if (!firstPossibility && !secondPossibility) {
			return false;
		}
		return true;
	}

	public static void findMax_and_Min_X_and_Y(int x_coord, int y_coord) {
		if (x_min > x_coord) {
			x_min = x_coord;
		}
		if (x_max < x_coord) {
			x_max = x_coord;
		}
		if (y_min > y_coord) {
			y_min = y_coord;
		}
		if (y_max < y_coord) {
			y_max = y_coord;
		}
	}
}
