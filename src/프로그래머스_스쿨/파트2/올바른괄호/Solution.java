package ���α׷��ӽ�_����.��Ʈ2.�ùٸ���ȣ;

import java.util.*;

class Solution {
	boolean solution(String s) {
		Stack<Character> stack = new Stack<Character>();

		for (char ch : s.toCharArray()) {
			if (ch == '(')
				stack.add(ch);
			else if (stack.isEmpty())
				return false;
			else
				stack.pop();
		}

		return stack.isEmpty();
	}
}