package 백준.동적계획법.가장긴증가하는부분수열3;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		int[] arr = new int[n];

		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}

		ArrayList<Integer> list = new ArrayList<>();
		
		list.add(Integer.MIN_VALUE);

		for (int i = 0; i < n; i++) {
			int val = arr[i];
			if (list.get(list.size() - 1) < val) {
				list.add(val);
			} else {
				// 만약 다음에 출현하는 것이 가장 마지막것보다 작거나 같다면
				int left = 0;
				int right = list.size() - 1;

				while (left < right) {
					int middle = (left + right) / 2;
					if (list.get(middle) < val) {
						left = middle + 1;
					} else
						right = middle;
				}

				list.set(right, val);
			}
		}

		System.out.println(list.size() - 1);
		
	}
}
