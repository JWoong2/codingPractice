package 알고리즘문제해결전략.분할정복.FENCE;

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
	
	// 코드 7.7 울타리 잘라내기 문제를 해결하는 O(n^2) 알고리즘
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
	
	// 코드 7.8 울타리 잘라내기 문제를 해결하는 분할 정복 알고리즘
	public static int solution(int[] input) {
		// h[left.. right] 구간에서 찾아낼 수 있는 가장 큰 사각형의 넓이를 반환한다.
		h = input;
		
		return solve(0, input.length-1);
	}
	
	public static int[] h;

	public static int solve(int left, int right) {
		// 기저 사례 : 판자가 하나밖에 없는 경우
		if( left == right) return h[left];
		// [left, mid] , [mid+1, right] 의 두 구간으로 문제를 분할한다.
		int mid = (left + right) / 2;
		// 분할한 문제를 각개격파
		int ret = Math.max(solve(left, mid),  solve(mid+1, right));
		System.out.println(ret);
		// 부분 문제 3: 두 부분에 모두 걸치는 사각형 중 가장 큰 것을 찾는다.
		int lo = mid, hi = mid+1;
		int height = Math.min(h[lo], h[hi]); 
		// [mid, mid+1] 만 포함하는 너비 2인 사각형을 고려한다.
		ret = Math.max(ret, height * 2);
		// 사각형이 입력 전체를 덮을 때까지 확장해 나간다.
		while(left < lo || hi < right) {
			// 항상 높이가 더 높은 쪽으로 확장한다.
			if(hi < right && (lo == left || h[lo-1] < h[hi+1])  ) {
				hi++;
				height = Math.min(height, h[hi]); 
			}else {
				lo--;
				height = Math.min(height, h[lo]);
			}
			// 확장한 후 사각형의 넓이
			ret = Math.max(ret, height * (hi - lo + 1));
		}
		return ret;
	}
	
	
	// 웅 솔루션	fence 의 최대 직사각형 크기를 리턴
	public static String fence(int[] input) {
		int[] sortedList = Arrays.stream(input).sorted().distinct().toArray();
		
		PriorityQueue<Integer> pq = new PriorityQueue<>();
		int max = 0; // 최대 직사각형 넓이
		
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
