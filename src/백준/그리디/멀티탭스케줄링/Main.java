package ����.�׸���.��Ƽ�ǽ����ٸ�;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int usageCount = sc.nextInt();

		int[] usageOrder = new int[n];
		ArrayList<Integer> list = new ArrayList<>();

		for (int i = 0; i < usageCount; i++) {
			// usageOrder[i] = sc.nextInt();
			list.add(sc.nextInt());
		}
		
		// �̰� �� �׸���?
		ArrayList<Integer> multitap = new ArrayList<>(n);
		int changeCount = 0;
		/*
		 * int temp = 0; int farFromStart = 0; // ���� ���߿� �����ϴ� �ڵ带 �̴´�. => �� �׸������� �����Դϴ�.
		 * for (int i = 0; i < usageCount; i++) { // ��Ƽ�ǿ� �ڵ带 �ȴ´�. if (i < n)
		 * multitap.add(usageOrder[i]);
		 * 
		 * if (!multitap.contains(usageOrder[i])) { changeCount++; // ���� ã�ƾ��� ������ ��ġ����
		 * �ʴ°� ���� �ִ���! // �̹� ������ �ִ� �� �߿��� ���� ���߿� �����°��� ������ for (int j = i + 1; j <
		 * multitap.size(); j++) {
		 * 
		 * } } }
		 */

		for (int i = 0; i < usageCount; i++) {
			// ��Ƽ�ǿ� �ڵ带 �ȴ´�.
			if (i < n) {
				multitap.add(list.remove(0));
				continue;
			}

			int tempNum = list.remove(0);

			if (!multitap.contains(tempNum)) {
				int max = 0;
				int index = 0;
				int var = 101;
				changeCount++;
				// ���� ã�ƾ��� ������ ��ġ���� �ʴ°� ���� �ִ���!
				// �̹� ������ �ִ� �� �߿��� ���� ���߿� �����°��� ������

				for (int j = 0; j < multitap.size(); j++) {
					index = list.indexOf((Object) multitap.get(j));

					// ���⼭ �߸��� �� ����
					// list�� �̹� ��Ƽ�ǿ� �����ִ� ���� ���ٸ� 101�� �༭ ���ֹ�����
					if(index == -1) {
						max = 101;
						var = j;
						break;
					}
					// �ִٸ� ���� ������ index�� ����
					// ���� max���� �����صд�.
					else if (max <= index) {
						max = index;
						var = j;
					}
				}

				multitap.set(var, tempNum);
				
				for(int mul : multitap) {
					System.out.print(mul + " ");
				}
				System.out.println();
			}
		}

		System.out.println(changeCount);
	}
}
