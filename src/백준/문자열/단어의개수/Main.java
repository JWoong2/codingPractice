package 백준.문자열.단어의개수;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		int count=0;
		
		String[] words = s.split("\\s");
		
		
		for(String str : words ) {
			if(str == "\\s") continue;
			count++;
		}
		
		if(s.charAt(0)== ' ') {
			count--;
		}
		if(words.length ==0 ) {
			System.out.println(0);
		}else {
			System.out.println(count);	
		}
		
	}
}
