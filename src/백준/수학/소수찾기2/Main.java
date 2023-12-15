package 백준.수학.소수찾기2;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int M = sc.nextInt();
		int N = sc.nextInt();

		ArrayList<Integer> list = new ArrayList<>();

		for (int i = M; i <= N; i++) {

			boolean isPrime = true;

			if(i == 1) continue;
			
			for (int j = 2; j < i; j++) {
				if (i % j == 0) {
					isPrime = false;
					break;
				}
			}

			if (isPrime)
				list.add(i);
		}

		int answer = 0;

		for (int i : list) {
			answer += i;
		}

		if (list.size() == 0) {
			System.out.println(-1);
		} else {
			System.out.println(answer);
			System.out.println(list.get(0));
		}

	}
}
