package 알고리즘랩스.level10;

import java.util.Scanner;

public class parametic {
	static int MAX = 100005;
	static int n;
	static int S;
	static int[] data;

	public static void main(String[] args) {
		data = new int[MAX];
		// Please Enter Your Code Here
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();

		for (int i = 0; i < n; i++) {
			data[i] = sc.nextInt();
		}

		int start = 1;
		int end = n;

		if (check(1))
			System.out.println("1");
		if (check(n))
			System.out.println("-1");

		while (start + 1 < end) {
			int mid = (start + end) / 2;

			if (check(mid))
				end = mid;
			else
				start = mid;
		}
		System.out.print(end);
	}

	private static boolean check(int interval) {
		int sum = 0;

		for (int i = 0; i < interval; i++)
			sum += data[i];

		if (sum >= 5)
			return true;

		for (int i = 0; i < n - interval; i++) {
			sum = sum - data[i] + data[i + interval];
			if (sum >= 5)
				return true;
		}

		return false;
	}
}