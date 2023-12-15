package ���α׷��ӽ�_����.��Ʈ2.����;

import java.util.HashMap;
import java.util.Map;

public class Solution {
	public int solution(String[][] clothes) {
		Map<String, Integer> clothesCounts = new HashMap<>();
		
		for (String[] cloth : clothes) {
			String type = cloth[1];
			clothesCounts.put(type, clothesCounts.getOrDefault(type, 0) + 1);

		}

		int answer = 1;
		for (Integer c : clothesCounts.values()) {
			answer *= c + 1;
		}

		return answer - 1;
	}

}