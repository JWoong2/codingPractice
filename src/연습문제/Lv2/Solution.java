package 연습문제.Lv2;

import java.util.Arrays;
import java.util.Collections;
import java.util.PriorityQueue;

class Solution {
	public int solution(int[] A, int[] B) {
		int answer = 0;

		PriorityQueue<Integer> aList = new PriorityQueue<Integer>();
		PriorityQueue<Integer> bList = new PriorityQueue<Integer>(Collections.reverseOrder());

		for(int i=0; i<A.length; i++) {
			aList.add(A[i]);
			bList.add(B[i]);
		}

		for(int i=0; i<A.length; i++) {
			answer += aList.poll() * bList.poll();
		}
		
		return answer;
	}
}