package _알고리즘.chapter4.재귀호출과완전탐색.소풍;

import java.util.Scanner;

public class Solution2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		// 가능한 조합의 수를 계산하는 문제를 푸는 가장 간단한 방법은 완전 탐색을 이용해 조합을 모두 만들어 보는 것 입니다.
		
		/*
		 * test case 
3
2 1
0 1
4 6
0 1 1 2 2 3 3 0 0 2 1 3
6 10
0 1 0 2 1 2 1 3 1 4 2 3 2 4 3 4 3 5 4 5
		 */
		
		int C = sc.nextInt();
		int m = 0;
		
		for(int i=0; i<C; i++) {
			n = sc.nextInt();
			m = sc.nextInt();

			System.out.println("이것이다 : " +  n + " " + m);
			
			areFriends = new boolean[10][10];
			taken = new boolean[10];
			
			for(int j=0; j<m; j++) {
				areFriends[sc.nextInt()][sc.nextInt()] = true;
			}
			
			System.out.println(countPairings());
			
		}
	}
	
	static int n;
	static boolean[][] areFriends; 
	static boolean taken[];
	
	// taken[i] 번째 학생이 짝을 이미 찾았으면 true, 아니면 false
	public static int countPairings() {
		// 모든 학생이 짝을 찾았으면 한 가지 방법을 찾았으니 종료한다.
		boolean finished = true;
		
		for(int i=0; i<n; i++) {
			if(!taken[i]) finished = false;
		}
		
		if(finished) return 1;
		int ret = 0;
		
		// 서로 친구인 두 학생을 찾아 짝을 지어준다. 
		for(int i=0; i<n; i++) {
			for(int j=i+1; j<n; j++) {
				if(!taken[i] && !taken[j] && areFriends[i][j]) {
					taken[i] = taken[j] = true;
					ret += countPairings();
					taken[i] = taken[j] = false;
				}
			}
		}
		
		return ret;
	}
}
