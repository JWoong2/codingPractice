package 프로그래머스.연습문제.레벨2.택배상자;

import java.util.Stack;

class Solution {
	public static void main(String[] args) {
		int[] order = {5, 4, 3, 2, 1};
		
		// case 2 : [5, 4, 3, 2, 1]
		
		System.out.println(solution(order));
	}
	
    public static int solution(int[] order) {
        int answer = 0;
        
        Stack<Integer> stack = new Stack<>();
        
        int index = 0;
        
        for(int i=1; i<=order.length; i++) {
        	if(order[index] == i) {
        		answer++;
        		index++;
        	}else {
        		stack.add(i);
        	}
        	
        	if(stack.size() != 0) {
            	while( stack.peek() == order[index] ) {
            		stack.pop();
            		answer++;
            		index++;
            		
            		if(stack.size() == 0) break;
            	}
        	}
        }
        
        return answer;
    }
}