package _Dev_matching.Àü±¸;

import java.util.ArrayList;
import java.util.List;

class Process {
	int start, end;

	public Process(int start, int end) {
		super();
		this.start = start;
		this.end = end;
	}

}

class Solution {
	public int solution(int n, int[][] groups) {
		int answer = 0;

		List<Process> list = new ArrayList<Process>();

		for (int i = 0; i < groups.length; i++) {
			if (groups[i][0] == 1 && groups[i][1] == n) {
				return 1;
			}
			list.add(new Process(groups[i][0], groups[i][1]));
		}

		return answer;
	}
}