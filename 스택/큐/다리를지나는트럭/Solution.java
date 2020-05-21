package 스택.큐.다리를지나는트럭;

import java.util.LinkedList;
import java.util.Queue;

class Truck {
	int weight;
	int onTime;

	public Truck(int weight, int onTime) {
		super();
		this.weight = weight;
		this.onTime = onTime;
	}

	public void move() {
		onTime--;
	}
}

class Solution {
	public static void main(String[] args) {
		int a = solution(2, 10, new int[] { 7, 4, 5, 6 });
		System.out.println(a);
	}

	public static int solution(int bridge_length, int weight, int[] truck_weights) {
		int answer = 0;

		Queue<Truck> waitBridge = new LinkedList<Truck>();
		Queue<Truck> onBridge = new LinkedList<Truck>();

		for (int i = 0; i < truck_weights.length; i++) {
			waitBridge.add(new Truck(truck_weights[i], bridge_length));
		}

		int onBridgeWeight = waitBridge.peek().weight;
		onBridge.add(waitBridge.poll());
		
		while (!onBridge.isEmpty()) {
			answer++;
			for (Truck t : onBridge) {
				t.move();
			}

			if (onBridge.peek().onTime == 0) {
				onBridgeWeight -= onBridge.poll().weight;
			}
			
			if (!waitBridge.isEmpty() && onBridgeWeight + waitBridge.peek().weight <= weight ) {
				onBridgeWeight += waitBridge.peek().weight;
				onBridge.add(waitBridge.poll());
			}
		}

		answer++;
		
		return answer;
	}
}