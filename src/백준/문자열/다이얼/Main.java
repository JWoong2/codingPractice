package 백준.문자열.다이얼;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		//알파벳에 따라  
		Map<Character, Integer> map = new HashMap<Character, Integer>();

		int value = 2;
		int count = 0;
		for (int i = 0; i < 26; i++) {
			char word = (char) (65 + i);
			if( word == 'W' || word == 'P') {
				count=4; value++;
			}
			
			if(count==0) {
				value++;
				count=3;
			} 
			
			count--;
			map.put((char) (65 + i), value);
		}

		for (Map.Entry<Character, Integer> m : map.entrySet()) {
			System.out.println(m.getKey() + " : " + m.getValue());
		}
		
		Scanner sc= new Scanner(System.in);
		String s = sc.next();
		int time=0;
		
		for(char c : s.toCharArray()) {
			time +=map.get(c);
		}
		
		System.out.println(time);
	}
}
