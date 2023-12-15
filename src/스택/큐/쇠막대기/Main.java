package 스택.큐.쇠막대기;

import java.util.Stack;

class Main {
	public static void main(String[] args) {
		int answer = solution("()(((()())(())()))(())");
		System.out.println(answer);
	}
	
    public static int solution(String arrangement) {
        int answer = 0;
        Stack<Character> stack = new Stack<Character>();
        
		for(int i = 0; i<arrangement.length(); i++) {
			if( arrangement.charAt(i) == '(')
				stack.add(arrangement.charAt(i));
			else {
				stack.pop();
				if( arrangement.charAt(i-1) == '(')
					answer += stack.size();
				else 
					answer++;
			}
		}
		
        return answer;
    }
}