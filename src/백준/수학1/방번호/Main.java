package 백준.수학1.방번호;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Map.Entry;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		int[] num = new int[s.length()];

		int index = 0;
		for (char c : s.toCharArray()) {
			num[index++] = c - '0';
		}

		Map<Integer, Integer> map = new HashMap<Integer, Integer>();

		for (int i = 0; i < 10; i++) {
			map.put(i, 0);
		}

		for (int i : num) {
			map.put(i, map.getOrDefault(i, 0) + 1);
		}

		int max = 0;
		for (Entry<Integer, Integer> entry : map.entrySet()) {
			if (entry.getKey() == 6 || entry.getKey() == 9) {
			} else {
				if (max < entry.getValue()) max = entry.getValue();
			}
		}

		double six = map.get(6);
		double nine = map.get(9);
		double count;
		if (six == nine) {
			count = six;
		} else {
			count = six > nine ? six : nine;
		}

		double answer = count/2;
		
		if (count > max) {
			if(count % 2== 1) {
				System.out.println(Math.round(count / 2));	
			}else System.out.println((int) count /2);
			
		} else {
			System.out.println(max);
		}

	}
}
