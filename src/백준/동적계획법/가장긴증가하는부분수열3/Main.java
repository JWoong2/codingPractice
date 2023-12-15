package ����.������ȹ��.����������ϴºκм���3;

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
				// ���� ������ �����ϴ� ���� ���� �������ͺ��� �۰ų� ���ٸ�
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
