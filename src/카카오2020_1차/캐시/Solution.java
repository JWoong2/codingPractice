package īī��2020_1��.ĳ��;

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
        	
        	// ����ְų�
        	if(cache.isEmpty()) {
        		answer+= 5;
        		cache.add(cities[i]);
        	}else {
        		// �̹� �ְų�
        		if(cache.remove(cities[i])) {
        			answer+= 1;
        			cache.add(cities[i]);
        		}
        		// ���µ� 
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
