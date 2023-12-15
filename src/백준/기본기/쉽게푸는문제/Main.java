package 백준.기본기.쉽게푸는문제;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int start = sc.nextInt();
		int end = sc.nextInt();

		int total = 0;

		// 1 2 2 3 3 3 4 4 4 4 5 5 5 5 5 6 6 6 6 6 6

		// 3 ~ 7

		// 2 3 3 3 4 --> 15가 됩니다.
		ArrayList<Integer> list = new ArrayList<>();
		int num = 1;
		int count = 0;

		for (int i = 1; i <= end; i++) {
			list.add(num);
			count++;
			if (count == num) {
				count = 0;
				num++;
			}

		}

		for(int i=start-1; i<end; i++) {
			total += list.get(i);
		}

		System.out.println(total);

	}
}
