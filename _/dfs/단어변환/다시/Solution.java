package _.dfs.단어변환.다시;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

class Solution {
    public int solution(String begin, String target, String[] words) {
        int answer = 0;
        
        if(!Arrays.asList(words).contains(target)) {
        	return answer;
        };
        
        Queue<String> queue = new LinkedList<String>();
        queue.add(begin);
        
        boolean status = false;
        
        while(!queue.isEmpty() && answer <= words.length) {
        	int size = queue.size();
        	for(int i= 0; i<size; i++) {
        		for(int j= 0; j<words.length; j++) {
        			int diff = compareWord(queue.peek(), words[j]);
        			
        			if(diff == 1) {
        				if(target.equals(words[j])) {
        					answer++;
        					status = true;
        					break;
        				}else {
        					queue.add(words[j]);
        				}
        			}
        			
        			if(status) break;
        			queue.remove();
        		}
        		
        	}
        	if(status) break;
        	answer++;
        }
        
        return answer;
    }
    
    private int compareWord(String s1, String s2) {
    	int diff = 0;
    	for(int i = 0; i<s1.length(); i++) {
    		if(s1.charAt(i) != s2.charAt(i)) diff++;
    	}
    	
    	return diff;
    }
}