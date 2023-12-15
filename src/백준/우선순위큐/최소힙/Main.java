package 백준.우선순위큐.최소힙;

import java.util.PriorityQueue;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		// TODO Auto-generated constructor stub
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		PriorityQueue<Integer> queue = new PriorityQueue<>();

		for (int i = 0; i <N; i++) {
			int temp = sc.nextInt();

			if (temp != 0) {
				queue.add(temp);
			} else {
				if(queue.size() == 0) {
					System.out.println("0");
				}else {
					System.out.println(queue.poll());
				}
			}
		}
	}
}
