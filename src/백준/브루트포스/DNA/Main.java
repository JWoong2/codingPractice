package ����.���Ʈ����.DNA;

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

		// ���帹���� ������ �������ϴ°� �ƴұ�?
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

			// �� �ٸ��� �� ���� �ִ��� Ȯ��
			for (int i = 0; i < n; i++) {
				map.put(dna[i][j], map.getOrDefault(dna[i][j], 0) + 1);
			}
			List<Entry<Character, Integer>> list_entries = new ArrayList<Entry<Character, Integer>>(map.entrySet());

			// ���� ���� �� ���� ���� ���ٸ� ���ĺ� ������ ����
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

			/* ����� ��
			 * for(Entry<Character, Integer> entry : list_entries) {
			 * System.out.println(entry.getKey() + " : " + entry.getValue()); }
			 * System.out.println("���� ����");
			 */
		}

		// �ٸ� �ּ���
		int count = 0;
		
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				if(answer.charAt(j) != dnaStr[i].charAt(j)) count++; 
			}
		}

		// ���� ��� �κ�
		System.out.println(answer);
		System.out.println(count);
	}
}
