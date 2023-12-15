package �ؽ�.�����������Ѽ���;

import java.util.*;

class Solution {
	public String solution(String[] participant, String[] completion) {
		String answer = "";
		HashMap<String, Integer> map = new HashMap<>();

		for (String player : participant) {
			//�̹� map �� �����ϰ� �ִٸ�
			if (map.containsKey(player) == true) {
				int result = map.get(player);
				map.put(player, result + 1);
			} 
			//map �� �����ϰ� ���� ������
			else {
				map.put(player, 1);
			}
		}

		for (String player : completion) {
			int result = map.get(player);
			// �̹� �����ϰ� ������ �ϳ� ��
			map.put(player, result - 1); 
		}

		for (String player : participant) {
			if (map.get(player) != 0) {
				answer = player;
			}
		}

		return answer;
	}
}