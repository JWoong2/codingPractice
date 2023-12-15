package 백준.수학.소수구하기;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int M = sc.nextInt();
		int N = sc.nextInt();

		// boolean 타입 배열을 생성해서 할 건지
		// 에라토스테네스의 체 Eratosthenes
		boolean[] prime = new boolean[1000000];

		prime[0] = prime[1] = true;

		for (int i = 2; i * i <= N; i++) {
			if (!prime[i]) {
				for (int j = i * i; j <= N; j += i) {
					prime[j] = true;
				}
			}
		}
		
		for(int i=0; i<prime.length; i++) {
			if(prime[i]) System.out.println(i);
		}
		
//		for (int i = 2; i * i <= N; i++) {
//			System.out.println(i + " " + " i번째");
//			for (int j = i * i; j <= N; j += i) {
//				System.out.println(j + " " + " j번째");
//			}
//		}

	}
}