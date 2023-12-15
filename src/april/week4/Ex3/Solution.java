package april.week4.Ex3;

import java.util.Scanner;

public class Solution {

	/*
	 * 5 5 50 50 70 80 100 7 100 95 90 80 70 60 50 3 70 90 80 3 70 90 81 9 100 99 98
	 * 97 96 95 94 93 91
	 */

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int xSize = sc.nextInt();
		int[][] arr = new int[xSize][];
		int[] rank = new int[xSize];

		for (int i = 0; i < arr.length; i++) {
			int temp = sc.nextInt();
			arr[i] = new int[temp];

			for (int j = 0; j < temp; j++) {
				arr[i][j] = sc.nextInt();
			}
		}

		// 합계 및 통계
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			sum = 0;
			for (int j = 0; j < arr[i].length; j++) {
				sum += arr[i][j];
			}
			rank[i] = sum / arr[i].length;
		}

		// 퍼센트 저장
		int cnt = 0;
		for (int i = 0; i < arr.length; i++) {
			cnt = 0;
			for (int j = 0; j < arr[i].length; j++) {
				if (rank[i] < arr[i][j])
					cnt++;
			}
			System.out.println(String.format("%.3f", (double) (cnt * 100) / arr[i].length) + "%");
		}
	}
}
