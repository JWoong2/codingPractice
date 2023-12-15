package ����.�׸���.���Ի��;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

class Rank {
	int docScore;
	int interScore;

	public Rank(int docScore, int interScore) {
		super();
		this.docScore = docScore;
		this.interScore = interScore;
	}

}

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int testCase = sc.nextInt();

		while (testCase-- > 0) {
			int n = sc.nextInt();

			int temp = 0;

			ArrayList<Rank> list = new ArrayList<Rank>();

			for (int i = 0; i < n; i++) {
				list.add(new Rank(sc.nextInt(), sc.nextInt()));
			}

			Collections.sort(list, new Comparator<Rank>() {

				@Override
				public int compare(Rank o1, Rank o2) {
					// TODO Auto-generated method stub
					return o1.docScore - o2.docScore;
				}
			});

			// ���⼭ ���� �ɸ��µ�
			/*
			 * while (!list.isEmpty()) { Rank r = list.remove(0); temp++; list.removeIf(v ->
			 * v.interScore > r.interScore); }
			 */

			// ��� �� ���� �Ҽ� ������?
			int recentRankInterScore = list.remove(0).interScore;
			int cnt = 1;

			ArrayList<Integer> answers = new ArrayList<>();
			
			while (!list.isEmpty()) {
				int compareRankInterScore = list.remove(0).interScore;

				if (recentRankInterScore > compareRankInterScore) {
					recentRankInterScore = compareRankInterScore;
					cnt++;
				}
			}
			
			System.out.println(cnt);
			// System.out.println(temp);
		}
	}
}

//  �ð� �ʰ� �ٸ� ���Ĺ���� ã�� �ٶ�
