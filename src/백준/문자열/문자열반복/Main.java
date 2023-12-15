package 백준.문자열.문자열반복;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int totalNum = sc.nextInt();
		for(int i =0; i<totalNum; i++) {
			int re = sc.nextInt();
			String alpha = sc.next();
			char[] ch = alpha.toCharArray();
			String str = "";
			
			for(char c : ch) {
				for(int j =0; j<re; j++) {
					str += c;
				}
			}
			System.out.println(str);
		}
	}
}
