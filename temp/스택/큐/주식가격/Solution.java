package 스택.큐.주식가격;

import java.util.LinkedList;
import java.util.Queue;

class Solution {
    public int[] solution(int[] prices) {
        int[] answer = new int[prices.length];
        int index= 0;
        
        Queue<Integer> queue = new LinkedList<Integer>();
        
        for(int i : prices) {
        	queue.add(i);
        }
        
        while(!queue.isEmpty()) {
        	for(int i = index; i <prices.length; i++) {
                if(queue.peek() > prices[i]) {
            		answer[index] = i-index;                   
                    index++;
            		queue.poll();
                    break;
            	}
                
            	if(i == prices.length-1) {
            		answer[index] = prices.length-index-1;
                	index++;
                	queue.poll();	
            	}
            }
        }
        
        return answer;
    }
}