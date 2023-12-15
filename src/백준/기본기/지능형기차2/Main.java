package 백준.기본기.지능형기차2;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int out; 
		int in;
		
		int max= 0;
		int total = 0;
		
		for (int i = 0; i < 10; i++) {
			out = sc.nextInt();
			in  = sc.nextInt();
			
			total -= out;
			total += in;
			
			if(max < total) max = total;
		}

		System.out.println(max);
	}
}
