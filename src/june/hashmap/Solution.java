package june.hashmap;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Solution {
	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap<>();
		String alpha = "ABAFSCCVASFDASDGAAASFDFV";
		
		String[] alphabet = alpha.split("");
		for(String s : alphabet) {
			if(map.containsKey(s)) {
				map.put(s, map.get(s)+1);	
			}else map.put(s, 1);	
		}
		
		if(map.containsKey("A")) {
			map.put("A", map.get("A")+1);	
		}else map.put("A", 1); 
		
		map.put("A", map.getOrDefault("A", 0)+1);
		map.put("A", map.getOrDefault("A", 0)+1);
		map.put("A", map.getOrDefault("A", 0)+1);
		
		for(Entry<String, Integer> entry : map.entrySet()) {
			System.out.println(entry.getKey() + " : " + entry.getValue());
		}
	}
}
