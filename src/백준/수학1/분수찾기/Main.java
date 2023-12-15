package 백준.수학1.분수찾기;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long n = sc.nextInt();
		long index = 1;
		long count = 1;
		//true 일때 가로 
		//false 일때 세로
		boolean zigzag = false;
		
		while (n > index) {
			index += count++;
			zigzag = !zigzag;
		}
		
		if( n == index ) {
			if(zigzag) {
				System.out.println((1) + "/" + ((count - (index - n))));
			}else {
				System.out.println(((count - (index - n)) + "/" + (1)));
			}	
		} else {
			if(zigzag) {
				System.out.println((index - n) + "/" + ((count - (index - n))));
			}else {
				System.out.println( ((count - (index - n))+ "/" + (index - n)));
			}
		}

	}
}
