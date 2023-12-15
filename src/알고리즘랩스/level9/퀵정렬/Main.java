package ¾Ë°í¸®Áò·¦½º.level9.ÄüÁ¤·Ä;

import java.util.Scanner;

public class Main {
	static int[] arr;
	static int[] left;
	static int[] right;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		arr = new int[n];
		left = new int[arr.length];
		right = new int[arr.length];

		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}

		quickSort(arr, 0, n - 1);

		for (int i = 0; i < n; i++) {
			System.out.print(arr[i] + " ");
		}
	}

	private static void quickSort(int arr[], int start, int end) {
		if (start >= end)
			return;

		int pivot = arr[start];

		int left_cnt = getLeft(arr, start + 1, end, pivot, left);
		int right_cnt = getRight(arr, start + 1, end, pivot, right);

		for (int i = 0; i < left_cnt; i++) {
			arr[start + i] = left[i];
		}

		arr[start + left_cnt] = pivot;

		for (int i = 0; i < right_cnt; i++) {
			arr[start + left_cnt + 1 + i] = right[i];
		}

		quickSort(arr, start, start + left_cnt - 1);
		quickSort(arr, start + left_cnt + 1, end);
	}

	private static int getLeft(int arr[], int start, int end, int pivot, int[] result) {
		int index = 0;

		for (int i = start; i <= end; i++) {
			if (arr[i] <= pivot) {
				result[index++] = arr[i];
			}
		}

		return index;
	}

	private static int getRight(int arr[], int start, int end, int pivot, int[] result) {
		int index = 0;

		for (int i = start; i <= end; i++) {
			if (arr[i] > pivot) {
				result[index++] = arr[i];
			}
		}

		return index;
	}
}