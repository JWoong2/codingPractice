package �˰������ذ�����.��������.FENCE;

import java.util.Arrays;
import java.util.PriorityQueue;

public class Solution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int N = 3;
		int[][] input = {{7, 1, 5, 9, 6, 7, 3}, {1,4,4,4,4,1,1}, {1,8,2,2}};
		
		for(int i=0; i<N; i++) {
//			System.out.println(fence(input[i]));
//			System.out.println(bruteForce(input[i]));
			System.out.println(solution(input[i]));
		}
	}
	
	// �ڵ� 7.7 ��Ÿ�� �߶󳻱� ������ �ذ��ϴ� O(n^2) �˰���
	public static int bruteForce(int[] input) {
		int ret = 0;
		int N = input.length;
		
		for(int left = 0; left < N; left++) {
			int minHeight = input[left];
			for(int right = left; right< N; right++) {
				minHeight = Math.min(minHeight, input[right]);
				ret = Math.max(ret, (right- left + 1) * minHeight);
				System.out.println(left + " " + ret);
			}
		}
		
		return ret;
	}
	
	// �ڵ� 7.8 ��Ÿ�� �߶󳻱� ������ �ذ��ϴ� ���� ���� �˰���
	public static int solution(int[] input) {
		// h[left.. right] �������� ã�Ƴ� �� �ִ� ���� ū �簢���� ���̸� ��ȯ�Ѵ�.
		h = input;
		
		return solve(0, input.length-1);
	}
	
	public static int[] h;

	public static int solve(int left, int right) {
		// ���� ��� : ���ڰ� �ϳ��ۿ� ���� ���
		if( left == right) return h[left];
		// [left, mid] , [mid+1, right] �� �� �������� ������ �����Ѵ�.
		int mid = (left + right) / 2;
		// ������ ������ ��������
		int ret = Math.max(solve(left, mid),  solve(mid+1, right));
		System.out.println(ret);
		// �κ� ���� 3: �� �κп� ��� ��ġ�� �簢�� �� ���� ū ���� ã�´�.
		int lo = mid, hi = mid+1;
		int height = Math.min(h[lo], h[hi]); 
		// [mid, mid+1] �� �����ϴ� �ʺ� 2�� �簢���� ����Ѵ�.
		ret = Math.max(ret, height * 2);
		// �簢���� �Է� ��ü�� ���� ������ Ȯ���� ������.
		while(left < lo || hi < right) {
			// �׻� ���̰� �� ���� ������ Ȯ���Ѵ�.
			if(hi < right && (lo == left || h[lo-1] < h[hi+1])  ) {
				hi++;
				height = Math.min(height, h[hi]); 
			}else {
				lo--;
				height = Math.min(height, h[lo]);
			}
			// Ȯ���� �� �簢���� ����
			ret = Math.max(ret, height * (hi - lo + 1));
		}
		return ret;
	}
	
	
	// �� �ַ��	fence �� �ִ� ���簢�� ũ�⸦ ����
	public static String fence(int[] input) {
		int[] sortedList = Arrays.stream(input).sorted().distinct().toArray();
		
		PriorityQueue<Integer> pq = new PriorityQueue<>();
		int max = 0; // �ִ� ���簢�� ����
		
		for(int i=0; i<sortedList.length; i++) {
			for(int j=0; j<input.length; j++) {
				if(input[j] >= sortedList[i]) {
					max+=sortedList[i];
				}
				
				if(input[j] < sortedList[i] || j == input.length-1) {
					pq.add(max);
					max = 0;
				}
			}
		}
		
		return "";
	}
	

}
