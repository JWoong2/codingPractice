package 백준.그리디.멀티탭스케줄링;

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
		
		// 이게 왜 그리드?
		ArrayList<Integer> multitap = new ArrayList<>(n);
		int changeCount = 0;
		/*
		 * int temp = 0; int farFromStart = 0; // 가장 나중에 출현하는 코드를 뽑는다. => 가 그리디적인 생각입니다.
		 * for (int i = 0; i < usageCount; i++) { // 멀티탭에 코드를 꽂는다. if (i < n)
		 * multitap.add(usageOrder[i]);
		 * 
		 * if (!multitap.contains(usageOrder[i])) { changeCount++; // 순서 찾아야해 다음에 일치하지
		 * 않는게 뭐가 있는지! // 이미 가지고 있는 것 중에서 가장 나중에 나오는것을 빼버림 for (int j = i + 1; j <
		 * multitap.size(); j++) {
		 * 
		 * } } }
		 */

		for (int i = 0; i < usageCount; i++) {
			// 멀티탭에 코드를 꽂는다.
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
				// 순서 찾아야해 다음에 일치하지 않는게 뭐가 있는지!
				// 이미 가지고 있는 것 중에서 가장 나중에 나오는것을 빼버림

				for (int j = 0; j < multitap.size(); j++) {
					index = list.indexOf((Object) multitap.get(j));

					// 여기서 잘못된 것 같음
					// list에 이미 멀티탭에 꽂혀있는 값이 없다면 101로 줘서 없애버리기
					if(index == -1) {
						max = 101;
						var = j;
						break;
					}
					// 있다면 지금 현재의 index를 저장
					// 비교할 max값도 저장해둔다.
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
