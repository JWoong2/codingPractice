package _;

import java.util.Scanner;
import java.util.Stack;

public class Solution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		Stack<String> stack = new Stack<>();

		while (sc.hasNext()) {
			String input = sc.next();
			String[] array = input.split("");

			for (String s : array) {
				
				System.out.println((char) s.charAt(0)+1);
				
				if (stack.size() == 0) {
					stack.add(input);
				} else {
					if (stack.peek().equals(input)) {
						stack.pop();
					} else {
						stack.add(input);
					}
				}
			}

			if (stack.empty()) {
				System.out.println(true);
			} else {
				System.out.println(false);
			}
		}
	}
}
