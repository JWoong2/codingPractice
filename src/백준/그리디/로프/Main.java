package ����.�׸���.����;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		Integer[] weights = new Integer[n];
		
		for(int i=0; i<n; i++) {
			weights[i] = sc.nextInt();
		}
		
		// ���� ���Ĺ� Integer �迭�� ���� int �迭�� �Ұ���
		Arrays.sort(weights, Collections.reverseOrder());
		
		int max = 0;
		
		for(int i=0; i<weights.length; i++) {
			if(max < weights[i] * (i+1)) {
				max = weights[i] * (i+1); 
			}
		}
		
		System.out.println(max);
	}
}
