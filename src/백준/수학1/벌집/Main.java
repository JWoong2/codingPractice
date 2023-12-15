package 백준.수학1.벌집;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int count = 1;
		int num = 1;
		
		while(n > num) {
			num+=6*count;
			count++;
		}
		
		System.out.println(count);
	}
}
