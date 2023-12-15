package 백준.약점체크.연산자끼워넣기;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		int[] array = new int[n];

		for (int i = 0; i < n; i++) {
			array[i] = sc.nextInt();
		}
		
		int[] cal = new int[4];
		
		for( int i=0; i<4; i++) {
			cal[i] = sc.nextInt();
		}
	}
	
	public static int dfs(int index, int[] arr) {
		int result =0;
		
		
		
		return result;
	}
}
