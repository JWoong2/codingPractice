package ����Ÿ��.¦���������ϱ�;

import java.util.ArrayList;
import java.util.Stack;

class Solution {
	public static void main(String[] args) {
		int ans = solution("baabaa");

		System.out.println(ans);
	}

	public static int solution(String s) {
		Stack<Character> stack = new Stack<>();

		for (char c : s.toCharArray())
			if (!stack.isEmpty() && stack.peek() == c)
				stack.pop();
			else
				stack.push(c);

		return stack.isEmpty() ? 1 : 0;
	}
}

/*
 * public static int solution(String s) { int answer = 1;
 * 
 * ArrayList<Character> list = new ArrayList<>();
 * 
 * // �ʱ�ȭ for (char c : s.toCharArray()) { list.add(c); }
 * 
 * // �����ϱ� boolean isTrue = true;
 * 
 * while (isTrue) { int size = list.size(); isTrue = false;
 * 
 * for (int i = 0; i < size - 1; i++) { if (list.get(i) == list.get(i + 1)) {
 * list.remove(i); list.remove(i);
 * 
 * isTrue = true;
 * 
 * break; } } }
 * 
 * if (list.size() > 0) { answer = 0; }
 * 
 * return answer; }
 */
