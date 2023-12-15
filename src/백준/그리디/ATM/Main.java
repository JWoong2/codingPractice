package 백준.그리디.ATM;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int[] array = new int[n];

		for (int i = 0; i < n; i++) {
			array[i] = sc.nextInt();
		}

		Arrays.sort(array);

		for (int i = 0; i < n-1; i++) {
			array[i+1] = array[i] + array[i+1]; 
		}

		int answer = 0;

		for(int i : array) answer += i;
		
		System.out.println(answer);
	}
}
