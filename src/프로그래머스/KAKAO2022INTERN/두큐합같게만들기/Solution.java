package 프로그래머스.KAKAO2022INTERN.두큐합같게만들기;

import java.util.LinkedList;
import java.util.Queue;

public class Solution {
	public static void main(String[] args) {
		int[] queue1 = { 3, 2, 7, 2 };
		int[] queue2 = { 4, 6, 5, 1 };

		solution(queue1, queue2);
	}

	static int count = 0;
	static Queue<Integer> q1 = new LinkedList<>();
	static Queue<Integer> q2 = new LinkedList<>();
	
	public static int solution(int[] queue1, int[] queue2) {

		int sumQ1 = 0;
		int sumQ2 = 0;

		for (int i = 0; i < queue1.length; i++) {
			q1.add(queue1[i]);
			q2.add(queue2[i]);
			sumQ1 += queue1[i];
			sumQ2 += queue2[i];
		}

		return count;
	}
	
	public static void dfs() {
		
	}
}
