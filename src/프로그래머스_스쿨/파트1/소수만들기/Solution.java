package 프로그래머스_스쿨.파트1.소수만들기;

public class Solution {
	static int cnt;
	
	private static void isPrime(int sum ) {
		for(int i = 2; i <= Math.sqrt(sum); i++) {
			if(sum % i == 0) {
				return ;
			}
		}
		cnt++;
		return ;
	}
	
	public static void dfs(int index, int sum, int depth, int[] a) {
		if(depth == 3) {
			isPrime(sum);
		}
		
		if(index == a.length - 1) return;
		dfs(index + 1, sum + a[index + 1], depth + 1, a);
		dfs(index + 1, sum, depth, a);
	}
	
	public static int solution(int[] a) {
		int n = a.length;

		cnt = 0;
		dfs(0, a[0], 1, a);
		dfs(0, 0, 0, a);
		return cnt;
	}
	
	public static void main(String[] args) {
		int[] a1 = {1,2,3,4};
		int[] a2 = {1,2,7,6,4};
		int[] test = {2,3,4,5};
		
		System.out.println(solution(test));
	}
}