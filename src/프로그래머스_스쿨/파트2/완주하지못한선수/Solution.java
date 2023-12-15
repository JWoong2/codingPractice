package 프로그래머스_스쿨.파트2.완주하지못한선수;

import java.util.HashMap;
import java.util.Map;

public class Solution {
	public String solution(String[] participant, String[] completion) {
		Map<String, Integer> players = new HashMap<>();
		for (String p : participant) {
			players.put(p, players.getOrDefault(p, 0) + 1);

		}
		
		for (String p : completion) {
			Integer count = players.get(p);
			if (count == 1) {
				players.remove(p);
			} else {
				players.put(p, count - 1);
			}
		}
		return players.keySet().iterator().next();

		/*
		 * List<String> players = new ArrayList<>(); for(String p : participant)
		 * players.add(p); for(String p : completion) players.remove(p);
		 * 
		 * return players.get(0);
		 */
	}
}