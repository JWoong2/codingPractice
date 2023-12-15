package 알고리즘랩스.level10.숫자개수세기;

import java.util.HashMap;

import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

public class Solution {
	public static void main(String[] args) {
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int[] array = new int[n];
		
		for(int i=0; i<n; i++) {
			array[i] = sc.nextInt();
		}
		
		for(Integer s : array) {
			map.put(s, map.getOrDefault(s, 0)+1);
		}
		
		for(Entry<Integer, Integer> entry : map.entrySet()) {
			System.out.println(entry.getKey() + "  " + entry.getValue());
		}
	}
}
