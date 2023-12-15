package _�˰���.chapter4.���ȣ�������Ž��;

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
	
	
	// n : ��ü ������ ��
	// picked : ���ݱ��� �� ���ҵ��� ��ȣ
	// toPick : �� �� ������ ��
	// �϶� , ������ toPcik���� ���Ҹ� ���� ��� ����� ����Ѵ�.
	public static void pick(int n, Stack<Integer> picked, int toPick) {
		// ���� ���: �� �� ���Ұ� ������ �� ���ҵ��� ����Ѵ�.
		if(toPick == 0) {
			for(int i=0; i<picked.size(); i++) {
				System.out.print(picked.get(i) + " ");
			}
			
			System.out.println();
			
			return;
		}
		
		// �� �� �ִ� ���� ���� ��ȣ�� ����Ѵ�.
		int smallest = picked.empty() ? 0 : picked.lastElement() + 1;
		
		for(int next = smallest; next <n; next++) {
			picked.push(next);
			pick(n, picked, toPick -1);
			picked.pop();
		}
		
	}
}
