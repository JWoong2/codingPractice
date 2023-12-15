package 백준.정렬.수정렬하기;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		
		int[] array = new int[n];
		
		for(int i=0; i<n; i++) {
			array[i] = scan.nextInt();
		}
		
		for(int i=0; i<n; i++) {
			for(int j=0; j<n; j++) {
				if(i == j) continue;
				if(array[i] < array[j]) {
					int temp = array[i];
					
					array[i] = array[j];
					array[j] = temp;
				}
			}
		}
		
		for(int i : array) {
			System.out.println(i);
		}
		
	}
}
