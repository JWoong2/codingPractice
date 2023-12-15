package 스택.큐.다리를지나는트럭;

import java.util.LinkedList;
import java.util.Queue;

class Vehicle {
	int time;
	int weight;
	public Vehicle(int time, int weight) {
		super();
		this.time = time;
		this.weight = weight;
	}
	
	
}

public class Main {
    public int solution(int bridge_length, int weight, int[] truck_weights) {
        int answer = 0;
        
        Queue<Vehicle> onBridge = new LinkedList<Vehicle>();
        Queue<Vehicle> waitVehicle = new LinkedList<Vehicle>();
        
        for(int i =0; i<truck_weights.length; i++) {
        	waitVehicle.add(new Vehicle(bridge_length, truck_weights[i]));
        }
        
        while(onBridge.isEmpty()) {
        	
        }
        
        
        return answer;
    }
}
