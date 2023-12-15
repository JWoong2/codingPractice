package 알고리즘랩스.level9.퀵정렬;

import java.util.Scanner;

public class Solution {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n =  sc.nextInt();
		
		int[] array = new int[n];
		for(int i=0; i<n; i++) {
			array[i] = sc.nextInt();
		}
		
		quickSort(array, 0, array.length-1);
		
		for(int i : array) {
			System.out.print(i + " ");
		}
	}
	
	public static int partition(int arr[], int left, int right) {

		int pivot = arr[(left + right) / 2];

		while (left < right) {
			while ((arr[left] < pivot) && (left < right))
				left++;
			while ((arr[right] > pivot) && (left < right))
				right--;

			if (left < right) {
				int temp = arr[left];
				arr[left] = arr[right];
				arr[right] = temp;
			}
		}

		return left;
	}

	private static void quickSort(int arr[], int left, int right) {

		if (left < right) {
			int pivotNewIndex = partition(arr, left, right);

			quickSort(arr, left, pivotNewIndex - 1);
			quickSort(arr, pivotNewIndex + 1, right);
		}

	}
}
