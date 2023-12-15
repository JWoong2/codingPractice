package 카카오2020_1차.캐시;

import java.util.LinkedList;
import java.util.Queue;

public class Solution {
	public static void main(String[] args) {
		int cache = 3;
		String[] cities = {"Jeju", "Pangyo", "Seoul", "NewYork", "LA", "Jeju", "Pangyo", "Seoul", "NewYork", "LA"};
		
		System.out.println(solution(cache, cities));
	}
	
    public static int solution(int cacheSize, String[] cities) {
        int answer = 0;
        Queue<String> cache = new LinkedList<String>();
        
        if(cacheSize == 0 ) return cacheSize * cities.length;
        
        for(int i=0; i<cities.length; i++) {
        	cities[i] = cities[i].toLowerCase();
        	
        	// 비어있거나
        	if(cache.isEmpty()) {
        		answer+= 5;
        		cache.add(cities[i]);
        	}else {
        		// 이미 있거나
        		if(cache.remove(cities[i])) {
        			answer+= 1;
        			cache.add(cities[i]);
        		}
        		// 없는데 
        		else {
        			if(cache.size() == cacheSize) cache.poll(); 
        			answer+= 5;
        			cache.add(cities[i]);
        		}
        	}
        	
        }
        
        return answer;
    }
}
