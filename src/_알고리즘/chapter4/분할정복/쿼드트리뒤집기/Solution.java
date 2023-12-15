package _알고리즘.chapter4.분할정복.쿼드트리뒤집기;

import java.util.Scanner;

public class Solution {
	
	static String s; 
	static int head = 0;
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
//		int n = sc.nextInt();
		
		/* 
		 * testcase 1 
		 * w
		 * xbwwb
		 * xbwxmbbwb
		 * xxwwwbxwxwbbbwwxxxwwbbbwwwwbb
		 * 
		 * testcase answer 1
		 * w
		 * xwbbw
		 * xxbwwbbbw
		 * xxwbxwwxbbwwbwbxwbwwxwwwxbbwb
		 */
		
			head = 0;
		s = "xxwwwbxwxwbbbwwxxxwwbbbwwwwbb";
		System.out.println(reverse());
		
	}
	
	public static String reverse() {
		if(s.charAt(head) != 'x') {
			head++;
			return s.charAt(head-1) + "";
		}
		
		head++;
		String str[] = new String[4];
		str[0] = reverse();
		str[1] = reverse();
		str[2] = reverse();
		str[3] = reverse();
		
		return 'x' + str[2] + str[3] + str[0] + str[1];
	}
}
