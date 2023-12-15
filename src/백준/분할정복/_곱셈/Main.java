package πÈ¡ÿ.∫–«“¡§∫π._∞ˆº¿;

import java.util.Scanner;

public class Main {

	public static int C ;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		long A = sc.nextLong();
		long B = sc.nextLong();
		C = sc.nextInt();
		
		long answer = multi(A, B);
		
		System.out.println(answer);
		
	}

	public static long multi(long A, long B) {
		if(B == 1) {
			return A % C;
		}
		
		long temp = multi(A, B /2);
		
		if(temp % 2 == 1 ) {
			return (temp * temp % C) * A % C;
		}
		
		return temp * temp % C;
	}
}
