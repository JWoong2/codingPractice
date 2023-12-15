package ���α׷��ӽ�.��������.����3.������;
//package bfs.������;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.PriorityQueue;

class SolutionBFS {
	public static void main(String[] args) {
//		T 1 : [["ICN", "B"], ["B", "ICN"], ["ICN", "A"], ["A", "D"], ["D", "A"]]
//				ans : ["ICN", "B", "ICN", "A", "D", "A"]
//		my		ans : ["ICN", "A", "B", "D", "A", "ICN"]
//		expect	ans : ["ICN", "A", "D", "A", ]
		
		
		String[] ans = solution(new String[][] { 
//			{ "ICN", "JFK" }, { "HND", "IAD" }, { "JFK", "HND" } 
			{"ICN", "B"}, {"B", "ICN"}, {"ICN", "A"}, {"A", "D"}, {"D", "A"}	
		});
		
		for (String s : ans) {
			System.out.println(s);
		}
	}

	public static String[] solution(String[][] tickets) {
		boolean[] visited = new boolean[tickets.length];

		List<String> path = new ArrayList<String>();
		PriorityQueue<String> queue = new PriorityQueue<String>();

		// ����1 : �׻� "ICN" ���׿��� ����մϴ�.
		queue.add("ICN");

		while (!queue.isEmpty()) {
			String from = queue.poll();	
			path.add(from);
			System.out.print(from + " ");

			ArrayList<String> tempList = new ArrayList<>();

			for (int i = 0; i < tickets.length; i++) {
				if (from.equals(tickets[i][0]) && !visited[i]) {
					tempList.add(tickets[i][1]);
					visited[i] = true;
				}
			}
			
			// ����ϸ� Ž���� ���������� �����ұ�? ���� ���� ���� ���;��ϴµ� �ϳ��� ������ ����.
			// DFS �ΰ�?

			// ���ĺ� ���� ���� �߰�
			Collections.sort(tempList);

			if (tempList.size() != 0) {
				for (int i = 0; i < tempList.size(); i++) {
					queue.add(tempList.get(i));
				}
			}

		}

		String[] answer = path.toArray(new String[0]);

		return answer;
	}
}