package _알고리즘.chapter4.재귀호출과완전탐색;

import java.util.Stack;

public class Solution {
	public static void main(String[] args) {
		int n = 6;
		// System.out.println(sum(n));
		// System.out.println(recursiveSum(n));
		
		int toPick = 3;
		Stack<Integer> picked = new Stack<>();
		
		pick(n, picked, toPick);
		
	}
	
	public static int sum(int n) {
		int ret = 0;
		for(int i=1; i<=n; i++) {
			ret +=i;
					
		}
		
		return ret;
	}
	
	public static int recursiveSum(int n) {
		if(n == 1) return 1;
		return n + recursiveSum(n-1);
	}
	
	
	// n : 전체 원소의 수
	// picked : 지금까지 고른 원소들의 번호
	// toPick : 더 고를 원소의 수
	// 일때 , 앞으로 toPcik개의 원소를 고르는 모든 방법을 출력한다.
	public static void pick(int n, Stack<Integer> picked, int toPick) {
		// 기저 사례: 더 고를 원소가 없을때 고른 원소들을 출력한다.
		if(toPick == 0) {
			for(int i=0; i<picked.size(); i++) {
				System.out.print(picked.get(i) + " ");
			}
			
			System.out.println();
			
			return;
		}
		
		// 고를 수 있는 가장 작은 번호를 계산한다.
		int smallest = picked.empty() ? 0 : picked.lastElement() + 1;
		
		for(int next = smallest; next <n; next++) {
			picked.push(next);
			pick(n, picked, toPick -1);
			picked.pop();
		}
		
	}
}
