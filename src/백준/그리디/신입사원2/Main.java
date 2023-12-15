package 백준.그리디.신입사원2;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int testCase = sc.nextInt();

		while (testCase-- > 0) {
			int n = sc.nextInt();
			int[] recruit = new int[n + 1];

			for (int i = 0; i < n; i++) {
				recruit[sc.nextInt()] = sc.nextInt();
			}

			int cnt = 1;
			int standard = recruit[1];

			for (int i = 2; i <= n; i++) {
				if (standard > recruit[i]) {
					cnt++;
					standard = recruit[i];
				}
			}

			System.out.println(cnt);
		}
	}
}
