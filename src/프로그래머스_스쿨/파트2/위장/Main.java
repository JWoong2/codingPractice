package 프로그래머스_스쿨.파트2.위장;

import java.util.HashMap;
import java.util.Map;

public class Main {
	public static void main(String[] args) {
		int answer = solution(new String[][] {
			{"yellow_hat", "headgear"},
			{"blue_sunglasses", "eyewear"},
			{"green_turban","headgear"}
		});
		System.out.println(answer);
	}

	public static int solution(String[][] clothes) {
		int answer = 1;
		Map<String, Integer> map = new HashMap<String, Integer>();
		
		for(int i=0; i<clothes.length; i++) {
			String type = clothes[i][1];
			map.put(type, map.getOrDefault(type, 0)+1);	
		}
		
		for(int i : map.values()) {
			answer *= i+1;
		}
		
		return answer-1;
	}
}
