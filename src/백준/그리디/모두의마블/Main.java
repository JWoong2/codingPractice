package 백준.그리디.모두의마블;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		ArrayList<Integer> list = new ArrayList<>();
		if(n == 1 ) System.out.println(sc.nextInt());
		
		int max = 0;
		int temp = 0;
		for (int i = 0; i < n; i++) {
			temp = sc.nextInt();
			if (max < temp) {
				max = temp;
			}

			list.add(temp);
		}
		
		list.remove((Object) max);
		
		int totalGold = 0;

		// 가장 큰 수를 찾고 다 더하면 되는것 같은데
		while (!list.isEmpty()) {
			temp = list.remove(0);
			totalGold = max + temp + totalGold;
		}

		System.out.println(totalGold);
	}

}
