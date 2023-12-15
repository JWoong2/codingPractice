package 백준.재귀.피보나치;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		System.out.println(fibonacci(n));
	}
	
	static int fibonacci(int num) {
		if(num == 1 ) return 1;
		else if(num == 0 ) return 0;
		return fibonacci(num-1) + fibonacci(num-2);
	}
}
