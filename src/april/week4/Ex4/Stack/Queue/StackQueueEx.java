package april.week4.Ex4.Stack.Queue;

import java.util.*;

class StackQueueEx {
	public static void main(String[] args) {
		Stack<String> st = new Stack<>();
		Queue<String> q = new LinkedList<>();	 // Queue�������̽��� ����ü�� LinkedList�� ���
		
		st.push("0");
		st.push("1");
		st.push("2");

		q.offer("0");
		q.offer("1");
		q.offer("2");

		System.out.println("= Stack =");
		while(!st.empty()) {
			System.out.println(st.pop());
		}

		System.out.println("= Queue =");
		while(!q.isEmpty()) {
			System.out.println(q.poll());
		}
	}
}
