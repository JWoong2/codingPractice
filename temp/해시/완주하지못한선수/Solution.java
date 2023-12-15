package 해시.완주하지못한선수;

import java.util.*;

class Solution {
	public String solution(String[] participant, String[] completion) {
		String answer = "";
		HashMap<String, Integer> map = new HashMap<>();

		for (String player : participant) {
			//이미 map 이 포함하고 있다면
			if (map.containsKey(player) == true) {
				int result = map.get(player);
				map.put(player, result + 1);
			} 
			//map 이 포함하고 있지 않으면
			else {
				map.put(player, 1);
			}
		}

		for (String player : completion) {
			int result = map.get(player);
			// 이미 포함하고 있으면 하나 뺌
			map.put(player, result - 1); 
		}

		for (String player : participant) {
			if (map.get(player) != 0) {
				answer = player;
			}
		}

		return answer;
	}
}