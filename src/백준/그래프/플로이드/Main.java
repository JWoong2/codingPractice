package 백준.그래프.플로이드;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int inf = 10000001;
		int n = sc.nextInt(); // 도시의 개수
		int m = sc.nextInt(); // 버스의 개수

		int[][] city = new int[n][n];

		for(int i=0; i<n; i++) {
			for(int j=0; j<n; j++) {
				if(i==j) continue;
				city[i][j] = inf;
			}
		}
		
		for (int i = 0; i < m; i++) {
			int x = sc.nextInt();
			int y = sc.nextInt();
			int fee = sc.nextInt();

			city[x-1][y-1] = Math.min(city[x-1][y-1], fee);    
		}

		for (int k = 0; k < n; k++) {
			for (int i = 0; i < city.length; i++) {
				for (int j = 0; j < city.length; j++) {
					city[i][j] = Math.min(city[i][k] + city[k][j], city[i][j]);
				}
			}
		}

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if(city[i][j] >= inf) System.out.print(0 + " ");
				else System.out.print(city[i][j] + " ");
			}
			System.out.println();
		}
	}
}