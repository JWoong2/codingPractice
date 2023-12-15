package ¹éÁØ.Àç±Í.ÆÑÅä¸®¾ó;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		if(n == 0) {
			System.out.println(1);
		}else System.out.println(factorial(n)); 
		
	}
	
	static int factorial(int num) {
		if(num == 1) return 1;
		
		return num * factorial(num-1);
	}
}
