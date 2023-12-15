package 백준.기본기.최소최대;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int max = Integer.MIN_VALUE;
		int min = Integer.MAX_VALUE;
		
		int temp;
		
		for (int i = 0; i < n; i++) {
			temp = sc.nextInt();
			
			if(max < temp) max = temp;
			if(min > temp) min = temp;
		}
		
		System.out.println(min + " " + max);
	}
}
