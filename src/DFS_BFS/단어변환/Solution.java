package DFS_BFS.단어변환;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

class Solution {
	public static void main(String[] args) {
		int a = solution("hit", "cog" , new String[] {"hot", "dot", "dog", "lot", "log", "cog"});
		System.out.println(a);
	}
	
	public static int solution(String begin, String target, String[] words) {
		int answer = 0;

		if (!Arrays.asList(words).contains(target)) {
			return answer;
		}

		Queue<String> queue = new LinkedList<String>();
		queue.add(begin);

		boolean status = false;

		while (queue.size() != 0 && answer <= words.length) {
			int size = queue.size(); 
			for (int i = 0; i < size; i++) {
				for (int j = 0; j < words.length; j++) {
					int diff = compareWords(queue.peek(), words[j]);
					
					if (diff == 1) {
						if (words[j].equals(target)) {
							answer++;
							status = true;
						} else {
							queue.add(words[j]);
						}
					}
				}
				
				if (status) {
					break;
				}

			System.out.println(queue.remove());
			}
			if (status) {
				break;
			}

			answer++;
		}

		return answer;
	}

	public static int compareWords(String s1, String s2) {
		int diff = 0;
		for (int i = 0; i < s1.length(); i++) {
			if (s1.charAt(i) != s2.charAt(i))
				diff++;
		}

		return diff;
	}
}