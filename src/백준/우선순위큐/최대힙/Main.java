package ����.�켱����ť.�ִ���;

import java.util.PriorityQueue;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		PriorityQueue<Integer> queue = new PriorityQueue<>();

		for (int i = 0; i < N; i++) {
			int temp = sc.nextInt();

			if (temp != 0) {
				queue.add(temp);

			} else {
				queue.add(temp);
				System.out.println(queue.poll());
			}
		}
	}
}


