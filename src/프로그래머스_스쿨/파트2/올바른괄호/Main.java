package ���α׷��ӽ�_����.��Ʈ2.�ùٸ���ȣ;

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