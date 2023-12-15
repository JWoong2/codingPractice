package 백준.수학.소인수분해;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int i = 2;
		
		while(N != 1 ) {
			// 또 하나 의 반복문 
			if(N%i == 0 )  {
				N /= i;
				System.out.println(i);
				i = 2;
			}else i++;
		}
	}
}
// 72 36 18 9 3