package ���α׷��ӽ�_����.��Ʈ1.������ձ�;

import java.util.ArrayList;
import java.util.List;

class Solution {
	public int[] solution(int n, String[] words) {
		int[] answer = new int[2];
		List<String> wordList = new ArrayList<String>();
		char previousWord = words[0].charAt(0);

		for (int i = 0; i < words.length; i++) {
			if (previousWord == words[i].charAt(0) && !wordList.contains(words[i])) {
				wordList.add(words[i]);
				previousWord = words[i].charAt(words[i].length() - 1);
			} else {
				// ���࿡ �ߺ��̰ų� �տ� �ܾ�� ���� ���� ���
				answer[0] = (i % n) + 1;
				answer[1] = (i / n) + 1;
			}
		}

		return answer;
	}
}