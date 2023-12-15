package 프로그래머스.연습문제.레벨3.여행경로;

import java.util.*;

public class SolutionDFS {

	public static void main(String[] args) {
//		T 1 : [["ICN", "B"], ["B", "ICN"], ["ICN", "A"], ["A", "D"], ["D", "A"]]
//				ans : ["ICN", "B", "ICN", "A", "D", "A"]

		String[] ans = solution(new String[][] {
//			{ "ICN", "JFK" }, { "HND", "IAD" }, { "JFK", "HND" } 
				{ "ICN", "SFO" }, { "ICN", "ATL" }, { "SFO", "ATL" }, { "ATL", "ICN" }, { "ATL", "SFO" } });

		for (String s : ans) {
			System.out.println(s);
		}
	}

	static boolean[] visited;
	static ArrayList<String> pathList = new ArrayList<>();

	public static String[] solution(String[][] tickets) {
		String[] answer = new String[tickets.length + 1];
		int idx = 0;

		visited = new boolean[tickets.length];

		for (int i = 0; i < tickets.length; i++) {
			// 항상 ICN공항에서 출발.
			// "ICN";
			if (tickets[i][0].equals("ICN")) {
				visited[i] = true;
				dfs(tickets[i][1], 0, tickets, "ICN");
				visited[i] = false;
			}
		}

		Collections.sort(pathList);

		char[] charArray = pathList.get(0).toCharArray();

		String temp = "";

		for (int i = 0; i < charArray.length; i++) {
			if (i % 3 == 0 && i != 0) {
				answer[idx++] = temp;
				temp = "";
			}
			
			temp += charArray[i];
		}
		
		answer[idx] = temp;

		System.out.println(pathList.get(0));

		return answer;
	}

	public static void dfs(String from, int pathCount, String[][] tickets, String path) {
		if (pathCount == visited.length - 1) {
			// print
			System.out.println(path + " " + from);
			path += " " + from;

			String str = "";

			String[] pathStrArray = path.split(" ");

			for (int i = 0; i < pathStrArray.length; i++) {
				str += pathStrArray[i];
			}

			pathList.add(str);
		}

		for (int i = 0; i < visited.length; i++) {
			if (!visited[i] && tickets[i][0].equals(from)) {
				visited[i] = true;
				dfs(tickets[i][1], pathCount + 1, tickets, path + " " + tickets[i][0]);
				visited[i] = false;
			}
		}
	}
}
