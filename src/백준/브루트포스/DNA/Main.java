package 백준.브루트포스.DNA;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map.Entry;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int m = sc.nextInt();

		String answer = "";

		// 가장많은게 앞으로 오도록하는거 아닐까?
		char[][] dna = new char[n][m];
		String[] dnaStr = new String[n];
		String temp = "";

		for (int i = 0; i < n; i++) {
			temp = sc.next();
			dna[i] = temp.toCharArray();
			dnaStr[i] = temp;
		}

		for (int j = 0; j < m; j++) {
			HashMap<Character, Integer> map = new HashMap<>();

			// 한 줄마다 몇 개가 있는지 확인
			for (int i = 0; i < n; i++) {
				map.put(dna[i][j], map.getOrDefault(dna[i][j], 0) + 1);
			}
			List<Entry<Character, Integer>> list_entries = new ArrayList<Entry<Character, Integer>>(map.entrySet());

			// 개수 많은 순 만약 숫자 같다면 알파벳 순으로 정렬
			Collections.sort(list_entries, new Comparator<Entry<Character, Integer>>() {

				@Override
				public int compare(Entry<Character, Integer> o1, Entry<Character, Integer> o2) {
					// TODO Auto-generated method stub

					if (o1.getValue() == o2.getValue())
						return o1.getKey() - o2.getKey();
					return o2.getValue() - o1.getValue();
				}
			});

			answer += list_entries.get(0).getKey().toString();

			/* 디버그 용
			 * for(Entry<Character, Integer> entry : list_entries) {
			 * System.out.println(entry.getKey() + " : " + entry.getValue()); }
			 * System.out.println("한줄 끝남");
			 */
		}

		// 다른 최소합
		int count = 0;
		
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				if(answer.charAt(j) != dnaStr[i].charAt(j)) count++; 
			}
		}

		// 정답 출력 부분
		System.out.println(answer);
		System.out.println(count);
	}
}
