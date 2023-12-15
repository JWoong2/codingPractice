package 프로그래머스_스쿨.파트2.올바른괄호;

import java.util.Stack;

class Main {
	public static boolean solution(String s) {
        Stack<Character> stack = new Stack<Character>();
        
        for(char c : s.toCharArray()) {
        	if(c == '(') {
        		stack.add('(');
        	}else {
        		if(stack.isEmpty()) return false;
        		stack.pop();
        	}
        }
        
        return stack.isEmpty();
    }
}