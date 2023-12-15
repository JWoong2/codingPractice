package 알고리즘랩스.level9.합병정렬;

import java.util.Scanner;

public class Solution {
	static int[] numbers;
	static int[] temp;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		numbers = new int[n];
		temp = new int[n];
		
	}
	
	private static void mergeSort(int start, int end) {
		if( start >= end) return;
		else {
			int mid = (start+ end) /2;
			mergeSort(start, mid);
			mergeSort(mid+1, end);
		
			merging(start, mid, mid+1, end);
		}
	}

	private static void merging(int start, int end, int start2, int end2) {
		int p= start;
		int q = start2;
		
		int index = p;
	}
}
