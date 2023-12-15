package 프로그래머스.연습문제.레벨1.추억점수;

import java.util.HashMap;

public class Solution {
	public int[] solution(String[] name, int[] yearning, String[][] photo) {
        // init 
        HashMap<String, Integer> map = new HashMap<>();
        
        for(int i=0; i<name.length; i++) {
        	map.put(name[i], yearning[i]);
        }
        
        int[] score = new int[photo.length];
        
        for(int i=0; i<photo.length; i++) {
        	String[] tempArray = photo[i];
        	int tempScore = 0;
        	
        	for(String str : tempArray) {
        		if(map.containsKey(str)) {
        			tempScore += map.get(str);
        		}
        	}
        	
        	score[i] = tempScore;
        }
        
        return score;
    }
}
