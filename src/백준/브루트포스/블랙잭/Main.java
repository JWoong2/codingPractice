package 백준.브루트포스.블랙잭;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// 카드의 개수
		int n = sc.nextInt();
		// 목표 카드의 합
		int m = sc.nextInt();

		int[] arr = new int[n - 1];

		int max = 0;

		// 단 세장의 선택으로 합을 만들어내야함
		for (int i = 0; i < arr.length-2; i++) {
			for (int j = i; j < arr.length-1; j++) {
				for (int k = j; k < arr.length; k++) {
					
				}
			}
		}

	}

}
