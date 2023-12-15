package 백준.문자열.단어공부;

import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String words = sc.next();
		words = words.toUpperCase();

		Map<Character, Integer> map = new HashMap<Character, Integer>();

		for (char c : words.toCharArray()) {
			map.put(c, map.getOrDefault(c, 0) + 1);
		}

		int max = 0;
		char maxWord = ' ';
		int count = 0;

		max = Collections.max(map.values());
		
		Iterator<Character> keys = map.keySet().iterator();
		while (keys.hasNext()) {
			Character key = keys.next();
			System.out.println("키 :" + key + " 값 : " + map.get(key));
			if(map.get(key).equals(max)) {
				count++;
				max = map.get(key);
				maxWord = key;
				if(count >= 2) maxWord ='?';
			}
		}

		System.out.println(maxWord);
	}
}
