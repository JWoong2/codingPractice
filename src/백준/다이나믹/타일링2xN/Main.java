package ����.���̳���.Ÿ�ϸ�2xN;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n + 1];
		
		if (n > 2) {
			arr[1] = 1;
			arr[2] = 2;
		}

		if (n == 0)
			System.out.println(0);
		if (n == 1) {
			System.out.println(1);
		} else if (n == 2) {
			System.out.println(2);
		} else {
			for (int i = 3; i <= n; i++) {
				arr[i] = (arr[i - 1] + arr[i - 2]) % 10007;
			}
			System.out.println(arr[n]);
		}
	}

}
