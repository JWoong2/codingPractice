package ���α׷��ӽ�.KAKAO2023.�ù��ް������ϱ�_;

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

		//	1. �� ��ȣ�� �ش� ���� ����� �ù� ������ �� ��ȣ�� ���� ������� ��� ���ÿ� ����ϴ�.
		//	2. �� ��ȣ�� �ش� ���� ������ �� �ù� ������ �� ��ȣ�� ���� ������� ���� ���ÿ� ����ϴ�.
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
		
		// 3. ��� ���ÿ��� ���� ���� ��ġ�� ������ �� ��ȣ�� ���� ���ÿ��� ���� ���� ��ġ�� ������ �� ��ȣ�� ���� ū ���� �� �踸ŭ answer�� ���մϴ�. 
		// �̶�, �� �踦 ���ϴ� ������ Ʈ���� ����â����� ���� �� ������ �պ��ϱ� �����Դϴ�.
		while(!(stackD.isEmpty() && stackP.isEmpty())) {
			int give = cap;
			int get = cap;
			
			//	4. �̹��� ��� ������ ������ 0�� �ǰų� ��� ������ �� ������ ��� ���ÿ��� ���� ����� ó���մϴ�.
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
			
			//	5. �̹��� ���� ������ ������ 0�� �ǰų� ���� ������ �� ������ ���� ���ÿ��� ���� ���Ÿ� ó���մϴ�.
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

		//	6. ��� ���ð� ���� ������ ��� �� ������ 3, 4, 5 ������ �ݺ��մϴ�.
		return answer ;
	}
}