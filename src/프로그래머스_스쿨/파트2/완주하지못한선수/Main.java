package 프로그래머스_스쿨.파트2.완주하지못한선수;

import java.util.HashMap;
import java.util.Map;

class Main {
	public static void main(String[] args) {
		String[] participants = {"leo", "kiki", "eden"};
		String[] completion = {"eden","kiki"};
		String str = solution(participants, completion);
		System.out.println(str);
	}
    public static String solution(String[] participant, String[] completion) {
        String answer = "";

        Map<String, Integer> map = new HashMap<String, Integer>();
        
        for(String s : participant) {
        	map.put(s, map.getOrDefault(s, 0)+1);
        }
        
        for(String s : completion) {
        	map.put(s, map.get(s)-1);
        	if(map.get(s) == 0 ) {
        		map.remove(s);
        	}
        }
        
        answer = map.keySet().iterator().next();
        
        return answer;
    }
}