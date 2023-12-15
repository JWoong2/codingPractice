package 스택.큐.탑;

import java.util.Stack;

public class Main {
	public static void main(String[] args) {
		int[] answers = solution(new int[] {6,9,5,7,4} ); 
		for(int i : answers) {
			System.out.println(i);
		}
	}
    public static int[] solution(int[] heights) {
        int[] answer = new int[heights.length];
        Stack<Integer> stack = new Stack<Integer>();
        
        for(int i : heights) {
        	stack.add(i);	
        }
        
        while(!stack.isEmpty()) {
        	int temp = stack.pop();
        	
        	for(int i=stack.size()-1; i>=0; i--) {
        		int top = stack.get(i);
        		if(top > temp) {
        			answer[stack.size()] = i+1;
        			break;
        		}
        	}
        }
                return answer;
    }
}
