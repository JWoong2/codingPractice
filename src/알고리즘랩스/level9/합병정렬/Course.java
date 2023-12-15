package 알고리즘랩스.level9.합병정렬;

import java.util.Scanner;

public class Course {
	static int n;
	static int[] numbers;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		numbers = new int[n];

		for (int i = 0; i < n; i++) {
			numbers[i] = sc.nextInt();
		}

		mergeSort(0, n - 1);

		for (int i : numbers) {
			System.out.print(i + " ");
		}
	}

	private static void mergeSort(int start, int end) {
		if (start >= end)
			return;
		else {
			int mid = (start + end) / 2;

			mergeSort(start, mid);
			mergeSort(mid + 1, end);

			merging(start, mid, mid + 1, end);
		}
	}

	private static void merging(int s1, int e1, int s2, int e2) {
		// arr의 s1-e1이 왼쪽 절반 s2~e2가 오른쪽 절반일 떄,
		int[] temp = new int[n];
		int index = 0;
		// 각각의 시작점을 넣어준다
		int p = s1;
		int q = s2;

		while (p <= e1 && q <= e2) {
			if (numbers[p] <= numbers[q]) {
				temp[index++] = numbers[p++];
			} else {
				temp[index++] = numbers[q++];
			}
		}

		if (p > e1) {
			for (int i = q; i <= e2; i++) {
				temp[index++] = numbers[i];
			}
		} else if (q > e2) {
			for (int i = p; i <= e1; i++) {
				temp[index++] = numbers[i];
			}
		}

		for (int i = s1; i <= e2; i++) {
			numbers[i] = temp[i-s1];
		}
	}
}