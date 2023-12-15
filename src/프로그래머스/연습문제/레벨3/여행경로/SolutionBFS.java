package 프로그래머스.연습문제.레벨3.여행경로;
//package bfs.여행경로;

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

		// 조건1 : 항상 "ICN" 공항에서 출발합니다.
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
			
			// 어떻게하면 탐색을 정상적으로 진행할까? 여러 개의 답이 나와야하는데 하나만 나오고 있음.
			// DFS 인가?

			// 알파벳 순서 로직 추가
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