package DFS_BFS.여행경로;

import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;

class Solution {
	public static void main(String[] args) {
		String[] ans = solution(new String[][] {{"ICN", "SFO"}, {"ICN", "ATL"}, {"SFO", "ATL"}, {"ATL", "ICN"}, {"ATL", "SFO"}});
		for(String s : ans) {
			System.out.println(s);
		}
	}
	
    public static String[] solution(String[][] tickets) {
        String[] answer = {};
        boolean[] visited = new boolean[tickets.length];
        
        List<String> path = new ArrayList<String>();
        PriorityQueue<String> queue = new PriorityQueue<String>();

        path.add("ICN");
        for(int i=0; i<tickets.length; i++) {
        	if(path.get(0).equals(tickets[i][0]))
        	queue.add(tickets[i][1]);
        }
        
        while(!queue.isEmpty()) {
        	String from = queue.poll();
    		path.add(from);
    		
        	for(int i=1; i<tickets.length; i++) {
        		if(from.equals(tickets[i][0]) && !visited[i]) {
        			queue.add(tickets[i][1]);
        			visited[i] = true;
        		}
        	}
        }
        
        answer = new String[path.size()];
        for(int i=0; i<path.size(); i++) {
        	answer[i] = path.get(i);
        }
        
        return answer;
    }
}