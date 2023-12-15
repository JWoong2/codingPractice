package 백준.그리디.강의실배정;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Scanner;

class Class {
	int start;
	int end;

	public Class(int s, int t) {
		super();
		this.start = s;
		this.end = t;
	}

	@Override
	public String toString() {
		return "Class [s=" + start + ", t=" + end + "]";
	}

}

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		
		// 관리될 방 리스트
		PriorityQueue<Class> lectures = new PriorityQueue<>(new Comparator<Class>() {

			@Override
			public int compare(Class o1, Class o2) {
				// TODO Auto-generated method stub
				if (o1.start == o2.start)
					return o1.end - o2.end;
				return o1.start - o2.start;
			}
		});

		PriorityQueue<Integer> queue = new PriorityQueue<>();
		
		for (int i = 0; i < n; i++) {
			lectures.add(new Class(sc.nextInt(), sc.nextInt()));
		}

		queue.offer(0);

		while (!lectures.isEmpty()) {
			Class temp = lectures.poll();
			
			if(queue.peek() <= temp.start) {
				queue.poll();
			}
			
			queue.add(temp.end);
		}

		
		System.out.println(queue.size());
	}
}
