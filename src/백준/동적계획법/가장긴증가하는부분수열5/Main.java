package 백준.동적계획법.가장긴증가하는부분수열5;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Stack;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		// int[] arr = new int[n];
		int[] arr = new int[n + 1];
		// int[] dp = new int[n];
		int[] indexArr = new int[n + 1];

		// for (int i = 0; i < n; i++) {
		for (int i = 1; i <= n; i++) {
			arr[i] = sc.nextInt();
		}

		ArrayList<Integer> list = new ArrayList<>();

		list.add(Integer.MIN_VALUE);

		for (int i = 1; i <= n; i++) {
			int val = arr[i];

			if (list.get(list.size() - 1) < val) {
				list.add(val);
				indexArr[i] = list.size() - 1;

			} else {
				int left = 0;
				int right = list.size() - 1;

				while (left < right) {
					int middle = (left + right) / 2;

					if (list.get(middle) < val) {
						left = middle + 1;
					} else {
						right = middle;
					}
				}

				list.set(right, val);
				indexArr[i] = right;
			}
		}

		System.out.println(list.size() - 1);

		Stack<Integer> stack = new Stack<>();
		int index = list.size() - 1;
		
		for (int i = n; i > 0 ; i--) {
			if(indexArr[i] == index) {
				stack.add(arr[i]);
				index--;
			}
		}
		
		while(!stack.isEmpty()) System.out.print(stack.pop() + " ");
	}
}
