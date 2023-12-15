package 백준.문자열.그룹단어체커;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		String[] words = new String[n];
		for (int i = 0; i < n; i++) {
			words[i] = sc.next();
		}

		char preChk = ' ';
		List<Character> list = new ArrayList<Character>();
		int count = 0;
		boolean chk = true;
		for (int i = 0; i < n; i++) {
			preChk = ' ';
			chk = true;

			for (char c : words[i].toCharArray()) {
				if (preChk != c && list.contains(c)) {
					chk = false;
					break;
				}
				preChk = c;
				list.add(c);
			}
			if(chk) count++;
			list.clear();
		}
		
		System.out.println(count);
	}
}