package april.week1.Ex4;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int i = sc.nextInt();
		int answer = fibo(i);
		System.out.println(answer);
	}
	
	// Too slow it must be revised
	public static int fibo(int n) {
		if(n <=1) return n;
		return fibo(n-1) + fibo(n-2);
	}

}
