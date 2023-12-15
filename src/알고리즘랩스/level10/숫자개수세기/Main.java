package 알고리즘랩스.level10.숫자개수세기;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int q = sc.nextInt();
		
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		
		for(int i=0; i<n; i++) {
			int key = sc.nextInt();
			map.put(key, map.getOrDefault(key, 0)+1);
		}
		
		for(int i=0; i<q; i++) {
			int key = sc.nextInt();
			if(map.get(key) == null) {
				System.out.println(0);	
			}else {
				System.out.println(map.get(key));
			}
		}
	}
}
