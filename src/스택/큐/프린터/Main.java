package 스택.큐.프린터;

import java.util.Collections;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

class Progress {
	int loc, priority;

	public Progress(int loc, int priority) {
		super();
		this.loc = loc;
		this.priority = priority;
	}
}

class Main {
	public static void main(String[] args) {
		int ans = solution(new int[] {1, 1, 9, 1, 1, 1}, 0);
		System.out.println(ans);
	}
	
	public static int solution(int[] priorities, int location) {
		int answer = 0;
		
		Queue<Progress> queue = new LinkedList<Progress>();
		PriorityQueue<Integer> prior = new PriorityQueue<Integer>(Collections.reverseOrder());
		
		for(int i=0; i<priorities.length; i++ ) {
			queue.add(new Progress(i, priorities[i]));
			prior.add(priorities[i]);
		}
		
		while(!prior.isEmpty()) {
			int pNum = prior.poll();
			
			for(int i=0; i<queue.size(); i++) {
				if(pNum == queue.peek().priority) {
					answer++;
					if(location == queue.peek().loc) return answer;
					queue.poll();
					break;
				}else {
					queue.add(queue.poll());
				}
			}
		}
		
		return answer;
	}
}
