package 프로그래머스.KAKAO2023.택배배달과수거하기_;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

class Solution {
	public static void main(String[] args) {
		// 4 5 [1, 0, 3, 1, 2] [0, 3, 0, 4, 0] 16
		// 2 7 [1, 0, 2, 0, 1, 0, 2] [0, 2, 0, 1, 0, 2, 0] 30

//		int cap 		  = 4;                         
//		int n 			  = 5;                         
//		int[] deliveries  = { 1, 0, 3, 1, 2};   
//		int[] pickups 	  = {0, 3, 0, 4, 0 };   
		// 16(=5+5+3+3)
		
		int cap 		 = 2;
		int n 			 = 7;
		int[] deliveries = { 1, 0, 2, 0, 1, 0, 2 };
		int[] pickups 	 = { 0, 2, 0, 1, 0, 2, 0 };
		int result = 30;
		// 30(=7+7+5+5+3+3)

		System.out.println(solution(cap, n, deliveries, pickups));
	}

	public static long solution(int cap, int n, int[] deliveries, int[] pickups) {
		long answer = 0;
		
		Stack<Map<Integer, Integer>> stackD = new Stack<>();
		Stack<Map<Integer, Integer>> stackP = new Stack<>();

		//	1. 집 번호와 해당 집에 배달할 택배 개수를 집 번호가 작은 순서대로 배달 스택에 담습니다.
		//	2. 집 번호와 해당 집에 수거할 빈 택배 개수를 집 번호가 작은 순서대로 수거 스택에 담습니다.
		for(int i=0; i<n; i++) {
			Map<Integer, Integer> tempD = new  HashMap<Integer, Integer>();
			if(deliveries[i] != 0) {
				tempD.put(i+1, deliveries[i]);
				stackD.push(tempD);
			}
			
			Map<Integer, Integer> tempP = new  HashMap<Integer, Integer>();
			if(pickups[i] != 0) {
				tempP.put(i+1, pickups[i]);
				stackP.push(tempP);
			}
		}

		int d = 0;
		int p = 0;
		
		Map<Integer, Integer> deliver = stackD.peek();
		Map<Integer, Integer> pick = stackP.peek();
		
		System.out.println(deliver.keySet().iterator().next());
		d = deliver.keySet().iterator().next();
		System.out.println(pick.keySet().iterator().next());
		p = pick.keySet().iterator().next();
		
		int max = Math.max(d, p);
		
		System.out.println("MAX :: " + max);
		
		answer += d > p ? d * 2 : p * 2;
		
		// 3. 배달 스택에서 가장 위에 위치한 원소의 집 번호와 수거 스택에서 가장 위에 위치한 원소의 집 번호를 비교해 큰 값의 두 배만큼 answer에 더합니다. 
		// 이때, 두 배를 더하는 이유는 트럭이 물류창고부터 가장 먼 집까지 왕복하기 때문입니다.
		while(!(stackD.isEmpty() && stackP.isEmpty())) {
			int give = cap;
			int get = cap;
			
			//	4. 이번에 배달 가능한 개수가 0이 되거나 배달 스택이 빌 때까지 배달 스택에서 남은 배달을 처리합니다.
			while(!stackD.isEmpty() && give > 0) {
				deliver = stackD.peek();
				d = deliver.keySet().iterator().next();
				
				if(give - deliver.get(d) >= 0) {
					give -= deliver.get(d);	
				}else {
					deliver.put(d, deliver.get(d) - give );
					break;
				}
				
				stackD.pop();
			}
			
			//	5. 이번에 수거 가능한 개수가 0이 되거나 수거 스택이 빌 때까지 수거 스택에서 남은 수거를 처리합니다.
			while(!stackP.isEmpty() && get > 0) {
				pick = stackP.pop();
				p = pick.keySet().iterator().next();
				
				if(give - pick.get(p) >= 0) {
					give -= pick.get(p);	
				}else {
					pick.put(p, pick.get(p) - give );
					break;
				}
				
				stackP.pop();
			}
			
			if(stackD.isEmpty()) {
				d = 0;	
			}else {
				deliver = stackD.peek();
				d = deliver.keySet().iterator().next();
			}
			
			if(stackP.isEmpty()) {
				p = 0;
			}else {
				pick = stackP.peek();
				
				System.out.println(pick.keySet().iterator().next());
				p = pick.keySet().iterator().next();
			}
			
			answer += d > p ? d * 2 : p * 2;
		}

		//	6. 배달 스택과 수거 스택이 모두 빌 때까지 3, 4, 5 과정을 반복합니다.
		return answer ;
	}
}