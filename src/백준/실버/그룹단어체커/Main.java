package 백준.실버.그룹단어체커;

import java.util.HashMap;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		HashMap<Character, Integer> map;
		int answer = 0;
		
		for(int i=0; i<n; i++) {
			String temp = scan.next();
			char tempChar = ' ';
			map = new HashMap<Character, Integer>();
			boolean isGroup = true;
			
			for(int j=0; j<temp.length(); j++) {
				if(tempChar != temp.charAt(j)) {
					tempChar = temp.charAt(j);
					if(map.containsKey(tempChar)) 
					{
						isGroup = false;
						break;
					}
					else {
						map.put(tempChar, map.getOrDefault(tempChar, 0) +1);
					}
				}
			}
			
			if(isGroup) {
				answer++;
			}
		}
		
		System.out.println(answer);
	}

}
