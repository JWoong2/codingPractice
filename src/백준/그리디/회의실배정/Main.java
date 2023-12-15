package ����.�׸���.ȸ�ǽǹ���;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Scanner;

class Conference {
	int startTime;
	int endTime;
	int runTime;

	public Conference(int startTime, int endTime, int runTime) {
		super();
		this.startTime = startTime;
		this.endTime = endTime;
		this.runTime = runTime;
	}

}

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int n = scanner.nextInt();

		PriorityQueue<Conference> queue = new PriorityQueue<>(new Comparator<Conference>() {

			@Override
			public int compare(Conference o1, Conference o2) {
				// TODO Auto-generated method stub
				
				// ������ �ð��� ���ٸ� ���� �ð� ��
				if(o1.endTime ==  o2.endTime) {
					return o1.startTime-o2.startTime;
				}
				
				// ������ �ð��� ���� ������� ����
				return o1.endTime - o2.endTime;
			}
		});

		int st = 0;
		int et = Integer.MAX_VALUE;

		for (int i = 0; i < n; i++) {
			st = scanner.nextInt();
			et = scanner.nextInt();

			queue.add(new Conference(st, et, et - st));
		}
		
		int answer = 0;
		et = 0;
		
		while(!queue.isEmpty()) {
			Conference temp = queue.poll();
			// System.out.println(temp.startTime + " " + temp.endTime + " " + temp.runTime);
			
			if(et <= temp.startTime) {
				answer++;
				et = temp.endTime;
				System.out.println(temp.startTime + " " + temp.endTime);
			}
		}
		
		System.out.println(answer);
	}
}
