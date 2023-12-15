package _;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		// Please Enter Your Code Here
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int center = n / 2;
		int end = 2 * n - 1;

		int last = n;

		for (int i = 0; i < n; i++) {
			for (int j = 1; j <= last; j++) {
				if (i == center) {
					if (j > center && j <= end - center) {
						System.out.print("*");
					} else {
						System.out.print(" ");
					}

				} else {
					int front = n - i;
					int rear = n + i;

					if (front == j || rear == j) {
						System.out.print("*");
					} else {
						System.out.print(" ");
					}
				}

			}
			if (last == end)
				break;
			else
				last++;
			System.out.println();
		}

	}
}