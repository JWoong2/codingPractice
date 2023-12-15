package 카카오2018_1차.캐시;

import java.util.LinkedList;
import java.util.Queue;

class Solution {
	public static int solution(int cacheSize, String[] cities) {
		int answer = 0;

		Queue<String> queue = new LinkedList<String>();

		if(cacheSize == 0) return cities.length *5;
		
		for(int i =0; i<cities.length; i++) {
			if(queue.isEmpty()) {
				queue.add(cities[i].toLowerCase());
				answer+=5;
			}else {
				if (queue.remove(cities[i].toLowerCase())) {
					answer += 1;
					queue.add(cities[i].toLowerCase());
				} else {
					if(cacheSize == queue.size()) queue.poll();
					answer += 5;
					queue.add(cities[i].toLowerCase());
				}
			}
		}

		return answer;
	}
}