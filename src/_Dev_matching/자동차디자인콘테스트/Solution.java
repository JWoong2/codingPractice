package _Dev_matching.자동차디자인콘테스트;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.PriorityQueue;
import java.util.TreeMap;

class Solution {
	public static void main(String[] args) {
		// String[] votes = { "AVANT", "PRIDO", "SONATE", "RAIN", "MONSTER", "GRAND",
		// "SONATE", "AVANT", "SONATE", "RAIN", "MONSTER", "GRAND", "SONATE", "SOULFUL",
		// "AVANT", "SANTA" };
		// int k = 2;

		String[] votes = { "AAD", "AAA", "AAC", "AAB" };
		int k = 4;

		String ans = solution(votes, k);
		System.out.println(ans);
	}

	public static String solution(String[] votes, int k) {
		String answer = "";
		Map<String, Integer> map = new HashMap<String, Integer>();
		PriorityQueue<Integer> queue = new PriorityQueue<Integer>(Collections.reverseOrder());

		for (int i = 0; i < votes.length; i++) {
			map.put(votes[i], map.getOrDefault(votes[i], 0) + 1);
		}

		// Key 기준 역순 정렬
		TreeMap<String, Integer> treeMapReverse = new TreeMap<String, Integer>(Collections.reverseOrder());
		treeMapReverse.putAll(map);

		// Map.Entry 리스트 작성
		List<Entry<String, Integer>> list_entries = new ArrayList<Entry<String, Integer>>(map.entrySet());

		// 비교함수 Comparator를 사용하여 내림 차순으로 정렬
		Collections.sort(list_entries, new Comparator<Entry<String, Integer>>() {
			// compare로 값을 비교
			public int compare(Entry<String, Integer> obj1, Entry<String, Integer> obj2) {
				// 내림 차순으로 정렬
				return obj2.getValue().compareTo(obj1.getValue());
			}
		});

		// 차 표 디버그 용
		for (Entry<String, Integer> entry : map.entrySet()) {
			System.out.println(entry.getKey() + " 받은 표 " + entry.getValue());
			queue.add(entry.getValue());
		}

		// 총 득표 수
		int count = 0;

		for (int i = 0; i < k; i++) {
			int maxValueInMap = (Collections.max(map.values())); // This will return max value in the Hashmap
			for (Entry<String, Integer> entry : map.entrySet()) { // Itrate through hashmap
				if (entry.getValue() == maxValueInMap) {
					System.out.println(entry.getKey()); // Print the key with max value
					map.remove(entry.getKey());
					break;
				}
			}
			count += queue.poll();
		}

		for (Entry<String, Integer> entry : map.entrySet()) {
			System.out.println(entry.getKey() + " 받은 표 " + entry.getValue());
		}

		System.out.println(count);

		int countVote = 0;

		while (true) {
			int minValueInMap = (Collections.min(treeMapReverse.values())); // This will return max value in the Hashmap
			for (Entry<String, Integer> entry : treeMapReverse.entrySet()) { // Itrate through hashmap
				if (entry.getValue() == minValueInMap) {
					System.out.println(entry.getKey()); // Print the key with max value
					treeMapReverse.remove(entry.getKey());
					countVote += entry.getValue();

					if (countVote >= count) {
						return answer;
					}

					answer = entry.getKey();

					break;
				}
			}
		}
	}
}