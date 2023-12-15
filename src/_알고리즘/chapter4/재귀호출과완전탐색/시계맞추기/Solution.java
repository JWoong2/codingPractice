package _알고리즘.chapter4.재귀호출과완전탐색.시계맞추기;

import java.util.Scanner;

public class Solution {
	
	static int CLOCKS = 16;
	static int SWITCHES = 10;
	static int INF = Integer.MAX_VALUE;
	static int[] clocks;
	
	char[][] linked = {
			"xxx.............".toCharArray(),
			"...x...x.x.x....".toCharArray(),
			"....x.....x...xx".toCharArray(),
			"x...xxxx........".toCharArray(),
			"......xxx.x.x...".toCharArray(),
			"x.x...........xx".toCharArray(),
			"...x..........xx".toCharArray(),
			"....xx.x......xx".toCharArray(),
			".xxxxx..........".toCharArray(),
			"...xxx...x...x..".toCharArray()
	};
	
	/* 
	 * testcase 1 :
	 * 12 6 6 6 6 6 6 12 12 12 12 12 12 12 12 12 12 12 12
	 * 
	 * testcase 2 : 
	 * 12 9 3 12 6 6 9 3 12 9 12 9 12 12 6 6 
	 */
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		for(int i=0; i<n; i++) {
			clocks = new int[16];
			
			for(int j=0; j<CLOCKS; j++) {
				clocks[j] = sc.nextInt();
			}
			
			for(int j=0; j<CLOCKS; j++) {
				clocks[j] = sc.nextInt();
			}
			
		}
		
		
		
		
	}
	
	// 모든 시계가 12시를 가리키고 있는지 확인한다.
	boolean areAligned(int[] clocks) {
		boolean isAlign = true;
		
		for(int i=0; i<CLOCKS; i++) {
			if( clocks[i] != 12) {
				return false;
			}
		}
		
		return isAlign;
	}
	
	// 버튼 클릭
	void push(int[] clocks, int pressSwitchCount) {
		for(int clock= 0; clock <CLOCKS; clock++) {
			if(linked[pressSwitchCount][clock] == 'x') {
				clocks[clock] += 3;
				if(clocks[clock] == 15) {
					clocks[clock] = 3;
				}
			}
		}
	}
	
	int solve(int[] clocks, int pressSwitchCount) {
		if(pressSwitchCount == SWITCHES) return areAligned(clocks) ? 0 : Integer.MAX_VALUE;
		
		int ret  = Integer.MAX_VALUE;
		
		for(int i=0; i<4; i++) {
			ret = Math.min(ret, i + solve(clocks, pressSwitchCount));
			push(clocks, pressSwitchCount);
		}
		
		return ret;
	}
}
