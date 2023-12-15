package 백준.문자열.알파벳찾기;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] alpha = new int[26];
		for(int i =0; i<alpha.length; i++) {
			alpha[i] = -1;
		}
		
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		
		char[] ch = s.toCharArray();
		
		int index=0;
		for(char c : ch ) {
			if(alpha[c-97] == -1) alpha[c-97] = index++;
			else if(alpha[c-97] < index) index++;
		}
		
		for(int i=0; i<alpha.length; i++) {
			if(i==alpha.length-1) System.out.print(alpha[i]);
			else {
				System.out.print(alpha[i] + " ");
			}
		}
		
	}

}
