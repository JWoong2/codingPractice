package 백준.다이나믹.피보나치;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int total = sc.nextInt();
		int[][] count = new int[total][2];

		for (int i = 0; i < total; i++) {
			count = fibonacci(i, sc.nextInt(), count);
		}

		for (int i = 0; i < count.length; i++) {
			for (int j = 0; j < count[i].length; j++) {
				if (j == 0)
					System.out.print(count[i][j] + " ");
				else
					System.out.println(count[i][j]);
			}
		}
	}

	private static int[][] fibonacci(int n, int num, int[][] arr) {
		int[] x = new int[100];
		int[] y = new int[100];
		x[0] = 1;
		y[0] = 0;
		x[1] = 0;
		y[1] = 1;
		
		if (num == 0) {
			arr[n][0] = x[num];
			arr[n][1] = y[num];
			return arr;
		} else if (num == 1) {
			arr[n][0] = x[num];
			arr[n][1] = y[num];
			return arr;
		} else {
			for (int i = 2; i <= num; i++) {
				x[i] = x[i-1] + x[i-2];
				y[i] = y[i-1] + y[i-2];
			}
			arr[n][0] = x[num];
			arr[n][1] = y[num];

			return arr;
		}
	}
}
