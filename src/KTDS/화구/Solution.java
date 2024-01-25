package KTDS.È­±¸;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.stream.Stream;

class Hawgu implements Comparable<Hawgu> {
	int workTime;
	int startTime;

	public Hawgu(int workTime, int startTime) {
		super();
		this.workTime = workTime;
		this.startTime = startTime;
	}

	@Override
	public int compareTo(Hawgu o) {
		// TODO Auto-generated method stub
		return 0;
	}
}

public class Solution {
	public static void main(String[] args) {
		int n = 2;
		String[] recipes = { "A 3", "B 2" };
		String[] orders = { "A 1", "A 2", "B 3", "B 4" };
		// result 7

		System.out.println(solution(n, recipes, orders));
	}

	public static int solution(int n, String[] recipes, String[] orders) {
		Map<String, Integer> map = new HashMap<String, Integer>();

		for (int i = 0; i < recipes.length; i++) {
			String[] temp = recipes[i].split(" ");

			map.put(temp[0], Integer.parseInt(temp[1]));
		}

		int time = 1;
		int index = 0;
		int useCount = 0;

		PriorityQueue<Hawgu> pq = new PriorityQueue<Hawgu>();

		while (index != orders.length) {
			String[] temp = orders[index].split(" ");
			if (Integer.parseInt(temp[1]) <= time && useCount < n) {
				index++;
				useCount++;
				pq.add(new Hawgu(map.get(temp[0]), time));
			}

			if (!pq.isEmpty()) {
				if (pq.peek().startTime + pq.peek().workTime == time) {
					useCount--;
					pq.poll();
				}
			}

			time++;
		}

		return time;
	}
}
