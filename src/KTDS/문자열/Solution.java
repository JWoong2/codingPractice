package KTDS.¹®ÀÚ¿­;

public class Solution {
	public static void main(String[] args) {
		String line1 = "abbbcbbb"; // 
		String line2 = "bbb"; // 
		// result : 4
		
//		abacaba
//		acb
//		result : 0

		System.out.println(solution(line1, line2));
	}

	static boolean[] visited;
	static String l1;
	static String l2;
	static int count = 0;
	
	public static int solution(String line1, String line2) {
		l1 = line1;
		l2 = line2;
		visited = new boolean[line1.length()];

		for (int sp = 1; sp < line1.length(); sp++) {
			for (int i = 0; i < line1.length(); i++) {
				visited[i] = true;
				dfs(sp, i, 0);
				visited[i] = false;
			}
		}
		
		System.out.println(count);

		return count;
	}

	public static void dfs(int space, int index, int depth) {
		if (depth == l2.length()) {
			count++;
			return;
		}
		
		if(index >= l1.length()) return;
		
		if (l1.charAt(index) == l2.charAt(depth)) {
			dfs(space, index+space, depth + 1);	
		}

	}
}
