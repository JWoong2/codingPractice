package ����.���ڿ�.ũ�ξ�Ƽ�ƾ��ĺ�;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] croatiaWords = {"c=", "c-", "dz=", "d-", "lj", "nj", "s=", "z="};
		
		String words = sc.next();
		
		for(String s : croatiaWords) {
			words = words.replace(s, "a");
		}

		System.out.println(words.length());
	}
}
