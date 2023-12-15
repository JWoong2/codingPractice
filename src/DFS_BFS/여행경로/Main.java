package DFS_BFS.여행경로;

import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;

class Path implements Comparable<Path>{
	int index;
	String destination;

	public Path(int index, String destination) {
		super();
		this.index = index;
		this.destination = destination;
	}

	@Override
	public int compareTo(Path o) {
		// TODO Auto-generated method stub
		return this.destination.compareTo(o.destination);
	}
}

class Main {
	static List<String> path;
	static boolean[] visited; 
	
	public static void main(String[] args) {
		String[] ans = solution(new String[][] { { "ICN", "SFO" }, { "ICN", "ATL" }, { "SFO", "ATL" }, { "ATL", "ICN" },
				{ "ATL", "SFO" } });

		for (String s : ans) {
			System.out.println(s);
		}
	}

	public static String[] solution(String[][] tickets) {
		String[] answer = {};
		path = new ArrayList<String>();
		visited = new boolean[tickets.length];
		
		path.add("ICN");
		
		return answer;
	}
	
	private static void findDestination(String[][] tickets) {
		PriorityQueue<Path> queue = new PriorityQueue<Path>();
		
		for (int i = 0; i < tickets.length; i++) {
			if (tickets[i][0].equals("ICN")) {
				queue.add(new Path(i, tickets[i][1]));
			}
		}
		
		for(Path p : queue) {
			System.out.println(p.index + " " + p.destination);
		}
		
		while(queue.size() != 1) {
			queue.poll();
		}
	}
}