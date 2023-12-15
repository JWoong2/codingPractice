package 스택.큐.탑;

import java.util.Stack;

class Solution {
	public int[] solution(int[] heights) {
		int[] answer = new int[heights.length];
		Stack<Integer> stack = new Stack<Integer>();

		for (int n : heights) {
			stack.push(n);
		}

		while (!stack.isEmpty()) {
			int tmp = stack.pop();

			for (int i = stack.size(); i >= 0; i--) {
				if (tmp < heights[i]) {
					answer[stack.size()] = i + 1;
					break;
				}
			}
		}

		return answer;
	}
}