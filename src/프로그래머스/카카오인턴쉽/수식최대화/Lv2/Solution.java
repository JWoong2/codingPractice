package 프로그래머스.카카오인턴쉽.수식최대화.Lv2;

import java.util.ArrayList;

public class Solution {
	public static void main(String[] args) {
		String expression = "100-200*300-500+20";
		// expected : 60420
		// "50*6-3*2" 300

		long answer = solution(expression);

		System.out.println(answer);
	}

	static boolean[] visited;
	static ArrayList<Character> opsList = new ArrayList<>();
	static ArrayList<Long> nums = new ArrayList<>();
	static ArrayList<Character> ops = new ArrayList<>();
	static long maxValue = 0;
	

	public static long solution(String expression) {

		// 총 세개를 먼저 할 수가 있습니다.
		// *를 먼저 계산할건지 + 먼저 계산할 건지 - 먼저 계산할건지
		// 총 6개의 케이스밖에 없는 것 같은데

		String regExp = "[0-9]+";

		String[] arr = expression.split(regExp);

		opsList = new ArrayList<>();

		for (String s : arr) {
			if (!opsList.contains(s) && !s.equals("")) {
				opsList.add(s.charAt(0));
			}
		}
		
		String num = "";
		
		for(char c : expression.toCharArray()) {
			if(Character.isDigit(c)) {
				num += c;
			}else {
				nums.add(Long.parseLong(num));
				num = "";
				
				ops.add(c);
			}
		}
		nums.add(Long.parseLong(num));
		
		for(long l : nums) System.out.println(l);
		for(char c : ops) System.out.println(c);
			
		
		visited = new boolean[opsList.size()];

		// dfs 시작
		dfs(0, new char[visited.length]);

		return maxValue;
	}

	public static Long calc(Long num1, Long num2, char op){
        long num = 0;
        switch (op){
            case '+' : {
                return num1 + num2;
            }
            case '-' : {
                return num1 - num2;
            }
            case '*' : {
                return num1 * num2;
            }
        }
        return num;
    }
	
	public static void dfs(int depth, char[] p) {
		if (depth == 3) {
			ArrayList<Long> cNums = new ArrayList<>(nums);
			ArrayList<Character> cOps = new ArrayList<>(ops);
			
			for(char c : p) {
				for(int i =0; i<cOps.size(); i++) {
					if(c == cOps.get(i)) {
						Long res = calc(cNums.remove(i), cNums.remove(i), c);
						cNums.add(i, res);
						cOps.remove(i);
						i--;
					}
				}
			}
			

			maxValue = Math.max(maxValue, Math.abs(cNums.get(0)));
		}

		for (int i = 0; i < visited.length; i++) {
			if (!visited[i]) {
				visited[i] = true;

				p[depth] = ops.get(i);
				dfs(depth + 1, p);	

				visited[i] = false;
			}
		}
	}
}
